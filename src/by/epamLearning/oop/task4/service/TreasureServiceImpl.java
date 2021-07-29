package by.epamLearning.oop.task4.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import by.epamLearning.oop.task4.bean.Treasure;
import by.epamLearning.oop.task4.dao.DAOProvider;
import by.epamLearning.oop.task4.dao.TreasureLoaderDAO;
import by.epamLearning.oop.task4.exception.TreasureExceptionDAO;
import by.epamLearning.oop.task4.exception.TreasureExceptionService;

public class TreasureServiceImpl implements TreasureService {

	private final DAOProvider daoProvider = DAOProvider.getInstance();

	public void initRandomTreasureValues() throws TreasureExceptionService {
		List<Treasure> treasures = new ArrayList<>();
		Random rnd = new Random();
		for (int i = 1; i < 101; i++) {
			Treasure treasure = new Treasure();
			treasure.setId(i);
			treasure.setName("tresure#" + i);
			treasure.setPrice(rnd.nextInt(1000) + 1);
			treasures.add(treasure);
		}
		try {
			TreasureLoaderDAO treasureLoaderDAO = daoProvider.getTreasureLoaderDAO();
			treasureLoaderDAO.writeTreasures(treasures);
		} catch (TreasureExceptionDAO e) {
			throw new TreasureExceptionService("Write treasures error", e);
		}
	}

	public List<Treasure> getAllTreasures() throws TreasureExceptionService {
		try {
			TreasureLoaderDAO treasureLoaderDAO = daoProvider.getTreasureLoaderDAO();
			return treasureLoaderDAO.readTreasures();
		} catch (TreasureExceptionDAO e) {
			throw new TreasureExceptionService("Read treasures error", e);
		}
	}

	public List<Treasure> getTreasures(List<Long> treasuresId) throws TreasureExceptionService {
		try {
			TreasureLoaderDAO treasureLoaderDAO = daoProvider.getTreasureLoaderDAO();
			return treasureLoaderDAO.readTreasures(treasuresId);
		} catch (TreasureExceptionDAO e) {
			throw new TreasureExceptionService("Read treasures error", e);
		}
	}

	public Treasure getTreasure(Long treasureId) throws TreasureExceptionService {
		try {
			TreasureLoaderDAO treasureLoaderDAO = daoProvider.getTreasureLoaderDAO();
			return treasureLoaderDAO.readTreasure(treasureId);
		} catch (TreasureExceptionDAO e) {
			throw new TreasureExceptionService("Read treasure error", e);
		}
	}

	public void saveTreasures(List<Treasure> treasures) throws TreasureExceptionService {
		try {
			TreasureLoaderDAO treasureLoaderDAO = daoProvider.getTreasureLoaderDAO();
			treasureLoaderDAO.writeTreasures(treasures);
		} catch (TreasureExceptionDAO e) {
			throw new TreasureExceptionService("Write treasures error", e);
		}
	}

	public void saveTreasure(Treasure treasure) throws TreasureExceptionService {
		try {
			TreasureLoaderDAO treasureLoaderDAO = daoProvider.getTreasureLoaderDAO();
			treasureLoaderDAO.writeTreasure(treasure);
		} catch (TreasureExceptionDAO e) {
			throw new TreasureExceptionService("Write treasure error", e);
		}
	}
}
