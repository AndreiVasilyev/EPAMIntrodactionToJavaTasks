package by.epamLearning.oop.task4.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

import by.epamLearning.oop.task4.bean.Treasure;
import by.epamLearning.oop.task4.exception.TreasureExceptionDAO;

public class TreasureLoaderDAOImpl implements TreasureLoaderDAO {

	private final String FILE_NAME = "/resources/treasure.txt";
	private final int MAX_RECORDS = 100;
	private final int MIN_RECORDS = 0;
	private File fileSource;

	public TreasureLoaderDAOImpl() {
		String rootPath = this.getClass().getProtectionDomain().getCodeSource().getLocation().toString()
				.replaceAll("file:/", "");
		String relativePath = new File(this.getClass().getPackageName().replaceAll("\\.", "\\/")).getParent();
		fileSource = new File(rootPath.concat(relativePath).concat(FILE_NAME));
	}

	@Override
	public List<Treasure> readTreasures() throws TreasureExceptionDAO {
		List<Treasure> result = readTreasures(new ArrayList<Long>());
		return result;
	}

	@Override
	public Treasure readTreasure(long id) throws TreasureExceptionDAO {
		List<Long> idList = new ArrayList<Long>();
		idList.add(id);
		List<Treasure> result = readTreasures(idList);
		return result.isEmpty() ? null : result.get(0);
	}

	@Override
	public List<Treasure> readTreasures(List<Long> idList) throws TreasureExceptionDAO {
		checkFileSource();
		List<Treasure> result = new ArrayList<>();
		if (idList == null || idList.isEmpty()) {
			idList = new ArrayList<>();
			idList.add(Long.valueOf(0));
		}
		try (FileReader reader = new FileReader(fileSource);
				BufferedReader bufferedReader = new BufferedReader(reader)) {
			for (Long idSample : idList) {
				while (bufferedReader.ready()) {
					String stringValue = bufferedReader.readLine();
					if (!stringValue.trim().isEmpty()) {
						Treasure treasure = parseToTreasure(stringValue);
						if (idSample != 0 && !idSample.equals(Long.valueOf(treasure.getId()))) {
							continue;
						}
						result.add(treasure);
						if (idSample != 0) {
							break;
						}
					}
				}
			}
		} catch (IOException | NumberFormatException e) {
			if (e instanceof IOException) {
				throw new TreasureExceptionDAO("File read error", e);
			}
			throw new TreasureExceptionDAO("Data parse error", e);
		}
		return result;
	}

	@Override
	public void writeTreasure(Treasure treasure) throws TreasureExceptionDAO {
		List<Treasure> treasures = List.of(treasure);
		writeTreasures(treasures);
	}

	@Override
	public void writeTreasures(List<Treasure> treasures) throws TreasureExceptionDAO {
		try (RandomAccessFile fileLoader = new RandomAccessFile(fileSource, "rw")) {
			for (Treasure treasureToWrite : treasures) {
				long treasureToWriteId = treasureToWrite.getId();
				if (treasureToWriteId > MIN_RECORDS && treasureToWriteId <= MAX_RECORDS) {
					StringBuilder stringToWrite = new StringBuilder();
					stringToWrite.append("id=");
					stringToWrite.append(treasureToWriteId);
					stringToWrite.append(" name=");
					stringToWrite.append(treasureToWrite.getName());
					stringToWrite.append(" price=");
					stringToWrite.append(treasureToWrite.getPrice());
					stringToWrite.append("\n");
					long currentPointer = 0l;
					long writeToPointer = 0l;
					int stringToReplaceCounter = 0;
					int replaceTextLength = 0;
					String readString = fileLoader.readLine();
					while (readString != null) {
						if (!readString.trim().isBlank()) {
							Treasure readTreasure = parseToTreasure(readString);
							if (readTreasure.getId() == treasureToWriteId) {
								writeToPointer = currentPointer;
								stringToReplaceCounter++;
								replaceTextLength += readString.length() + 1;
							} else if (readTreasure.getId() > treasureToWriteId) {
								if (stringToReplaceCounter == 0) {
									writeToPointer = currentPointer;
								}
								stringToWrite.append(readString);
								stringToWrite.append("\n");
								stringToReplaceCounter++;
								replaceTextLength += readString.length() + 1;
							}
						}
						currentPointer = fileLoader.getFilePointer();
						readString = fileLoader.readLine();
						if (readString == null && stringToReplaceCounter == 0) {
							writeToPointer = currentPointer;
						}
					}
					if (replaceTextLength > stringToWrite.length()) {
						stringToWrite.setLength(replaceTextLength);
					}
					fileLoader.seek(writeToPointer);
					fileLoader.writeBytes(stringToWrite.toString());
					fileLoader.seek(0);
				}
			}
		} catch (IOException e) {
			throw new TreasureExceptionDAO("File write error", e);
		}
	}

	private Treasure parseToTreasure(String stringValue) throws TreasureExceptionDAO {
		String[] treasureValues = stringValue.trim().split("\s+");
		Treasure treasure = new Treasure();
		try {
			treasure.setId(Long.valueOf(treasureValues[0].replaceAll("id=", "")));
			treasure.setName(treasureValues[1].replaceAll("name=", ""));
			treasure.setPrice(Integer.valueOf(treasureValues[2].replaceAll("price=", "")));
		} catch (NumberFormatException e) {
			throw new TreasureExceptionDAO("Data parse error", e);
		}
		return treasure;
	}

	private void checkFileSource() throws TreasureExceptionDAO {
		if (!fileSource.exists()) {
			try {
				fileSource.createNewFile();
			} catch (IOException e) {
				throw new TreasureExceptionDAO("File create error", e);
			}
		}
	}

}
