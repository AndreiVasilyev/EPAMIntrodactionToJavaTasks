package by.epamLearning.oop.task4.service;

public class ServiceProvider {

	private static final ServiceProvider instance = new ServiceProvider();

	private TreasureService treasureService = new TreasureServiceImpl();

	private ServiceProvider() {
	}

	public static ServiceProvider getInstance() {
		return instance;
	}

	public TreasureService getTreasureService() {
		return treasureService;
	}

	public void setTreasureService(TreasureService treasureService) {
		this.treasureService = treasureService;
	}

}
