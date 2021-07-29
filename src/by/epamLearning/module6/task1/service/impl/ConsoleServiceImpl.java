package by.epamLearning.module6.task1.service.impl;

import by.epamLearning.module6.task1.dao.ConsoleDAO;
import by.epamLearning.module6.task1.dao.DAOProvider;
import by.epamLearning.module6.task1.service.ConsoleService;

public class ConsoleServiceImpl implements ConsoleService {

	private DAOProvider provider = DAOProvider.getInstance();

	@Override
	public String readString(String message) {
		ConsoleDAO consoleDAO = provider.getConsoleDAO();
		consoleDAO.printString("Enter " + message + ": ");
		return consoleDAO.readString();
	}

	@Override
	public String readString(String message, String regexp) {
		ConsoleDAO consoleDAO = provider.getConsoleDAO();
		String result;
		while (true) {
			consoleDAO.printString("Enter " + message + ": ");
			result = consoleDAO.readString();
			if (result.matches(regexp))
				break;
			consoleDAO.printString("Wrong enter " + message + ". Try again...\n");
		}
		return result;
	}

	@Override
	public byte[] readBytes(String message) {
		ConsoleDAO consoleDAO = provider.getConsoleDAO();
		byte[] bytes;
		while (true) {
			consoleDAO.printString("Enter " + message + ": ");
			bytes = consoleDAO.readBytes();
			if (bytes != null && bytes.length >= 3)
				break;
			System.out.println("Wrong enter " + message + ". Try again...\n");
		}
		return bytes;
	}

	@Override
	public void printString(String message) {
		ConsoleDAO consoleDAO = provider.getConsoleDAO();
		consoleDAO.printString(message);
	}

}
