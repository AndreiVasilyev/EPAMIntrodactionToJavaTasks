package by.epamLearning.oop.task4.service;

import java.util.List;
import by.epamLearning.oop.task4.bean.Treasure;
import by.epamLearning.oop.task4.exception.TreasureExceptionService;

public interface TreasureService {

	public void initRandomTreasureValues() throws TreasureExceptionService;

	public List<Treasure> getAllTreasures() throws TreasureExceptionService;

	public List<Treasure> getTreasures(List<Long> treasuresId) throws TreasureExceptionService;

	public Treasure getTreasure(Long treasureId) throws TreasureExceptionService;

	public void saveTreasures(List<Treasure> treasures) throws TreasureExceptionService;

	public void saveTreasure(Treasure treasure) throws TreasureExceptionService;
}
