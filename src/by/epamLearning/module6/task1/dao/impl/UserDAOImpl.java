package by.epamLearning.module6.task1.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.epamLearning.module6.task1.bean.User;
import by.epamLearning.module6.task1.dao.UserDAO;
import by.epamLearning.module6.task1.exception.UserExceptionDAO;
import by.epamLearning.module6.task1.view.UserView;

public class UserDAOImpl implements UserDAO {

	private final String FILE_NAME = "/source/users.txt";
	private File sourceFile;

	public UserDAOImpl() {
		String rootPath = this.getClass().getProtectionDomain().getCodeSource().getLocation().toString()
				.replaceAll("file:/", "");
		String relativePath = new File(new File(this.getClass().getPackageName().replaceAll("\\.", "\\/")).getParent())
				.getParent();
		sourceFile = new File(rootPath.concat(relativePath).concat(FILE_NAME));
	}

	@Override
	public User writeUser(User user) throws UserExceptionDAO {
		if (user != null) {
			checkFile(sourceFile);
			try (FileWriter fileWriter = new FileWriter(sourceFile, true)) {
				String stringToWrite = UserView.prepareStringToWrite(user);
				fileWriter.write(stringToWrite);
			} catch (IOException e) {
				throw new UserExceptionDAO("File 'users.txt' writing error", e);
			}
		}
		return user;
	}

	@Override
	public User logination(String login, String password) throws UserExceptionDAO {
		checkFile(sourceFile);
		User result = null;
		try (BufferedReader fileReader = new BufferedReader(new FileReader(sourceFile))) {
			while (fileReader.ready()) {
				String stringFromFile = readUserRecord(fileReader);
				if (stringValid(login, password, stringFromFile)) {
					result = UserView.parseUserFromFileRecord(stringFromFile);
					break;
				}

			}
		} catch (IOException e) {
			throw new UserExceptionDAO("File 'users.txt' reading error", e);
		}
		return result;
	}

	@Override
	public User readUser(String login) throws UserExceptionDAO {
		checkFile(sourceFile);
		try (BufferedReader fileReader = new BufferedReader(new FileReader(sourceFile))) {
			while (fileReader.ready()) {
				String stringFromFile = readUserRecord(fileReader);
				User currentUser = UserView.parseUserFromFileRecord(stringFromFile);
				if (login.equalsIgnoreCase(currentUser.getLogin())) {
					return currentUser;
				}
			}
		} catch (IOException e) {
			throw new UserExceptionDAO("File 'users.txt' reading error", e);
		}
		return null;
	}

	@Override
	public List<User> findUsers(User userParams) throws UserExceptionDAO {
		checkFile(sourceFile);
		List<User> users = new ArrayList<User>();
		try (BufferedReader fileReader = new BufferedReader(new FileReader(sourceFile))) {
			while (fileReader.ready()) {
				String stringFromFile = readUserRecord(fileReader);
				User currentUser = UserView.parseUserFromFileRecord(stringFromFile);
				if (currentUserMatch(currentUser, userParams)) {
					users.add(currentUser);
				}

			}
		} catch (IOException e) {
			throw new UserExceptionDAO("File 'users.txt' reading error", e);
		}
		return users;
	}

	private boolean currentUserMatch(User currentUser, User userParams) {
		if (userParams == null)
			return true;
		if (userParams.getLogin() != null && !userParams.getLogin().equalsIgnoreCase(currentUser.getLogin()))
			return false;
		if (userParams.getPassword() != null && !userParams.getPassword().equalsIgnoreCase(currentUser.getPassword()))
			return false;
		if (userParams.getRole() != null
				&& !userParams.getRole().toString().equalsIgnoreCase(currentUser.getRole().toString()))
			return false;
		if (userParams.getEmail() != null && !userParams.getEmail().equalsIgnoreCase(currentUser.getEmail()))
			return false;
		return true;
	}

	private String readUserRecord(BufferedReader fileReader) throws IOException {
		StringBuilder builder = new StringBuilder();
		while (fileReader.ready()) {
			String readLine = fileReader.readLine();
			if (!readLine.isBlank()) {
				builder.append(readLine.trim());
				builder.append("\n");
			} else if (!builder.isEmpty())
				break;
		}
		builder.append("\n");
		return builder.toString();
	}

	private void checkFile(File fileSource) throws UserExceptionDAO {
		if (!fileSource.exists()) {
			try {
				fileSource.createNewFile();
			} catch (IOException e) {
				throw new UserExceptionDAO("File 'users.txt' creating error", e);
			}
		}
	}

	private boolean stringValid(String login, String password, String stringFromFile) throws UserExceptionDAO {
		User currentUser = UserView.parseUserFromFileRecord(stringFromFile);
		if (login.equalsIgnoreCase(currentUser.getLogin()) && password.equalsIgnoreCase(currentUser.getPassword()))
			return true;
		return false;
	}
}
