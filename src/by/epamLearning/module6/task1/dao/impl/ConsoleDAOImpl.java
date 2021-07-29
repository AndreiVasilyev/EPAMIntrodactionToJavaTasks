package by.epamLearning.module6.task1.dao.impl;

import java.util.Scanner;

import by.epamLearning.module6.task1.dao.ConsoleDAO;

public class ConsoleDAOImpl implements ConsoleDAO {

	private Scanner scanner;

	public ConsoleDAOImpl() {
		scanner = new Scanner(System.in);
	}

	@Override
	public String readString() {
		return scanner.nextLine();
	}

	@Override
	public void printString(String message) {
		System.out.print(message);
	}

	@Override
	public byte[] readBytes() {		
		return scanner.nextLine().getBytes();
	}
}
