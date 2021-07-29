package by.epamLearning.oop.task4.dao;

import java.util.List;

import by.epamLearning.oop.task4.bean.Treasure;
import by.epamLearning.oop.task4.exception.TreasureExceptionDAO;

public interface TreasureLoaderDAO {

	public List<Treasure> readTreasures() throws TreasureExceptionDAO;

	public Treasure readTreasure(long id) throws TreasureExceptionDAO;
	
	public List<Treasure> readTreasures(List<Long> idList) throws TreasureExceptionDAO;

	public void writeTreasures(List<Treasure> treasures) throws TreasureExceptionDAO;

	public void writeTreasure(Treasure treasure) throws TreasureExceptionDAO;

}
