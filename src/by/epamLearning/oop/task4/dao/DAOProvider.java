package by.epamLearning.oop.task4.dao;

public class DAOProvider {

	private static final DAOProvider instance = new DAOProvider();

	private TreasureLoaderDAO treasureLoaderDAO = new TreasureLoaderDAOImpl();

	private DAOProvider() {
	};

	public static DAOProvider getInstance() {
		return instance;
	}

	public TreasureLoaderDAO getTreasureLoaderDAO() {
		return treasureLoaderDAO;
	}

	public void setTreasureLoaderDAO(TreasureLoaderDAO treasureLoaderDAO) {
		this.treasureLoaderDAO = treasureLoaderDAO;
	}

}
