package by.epamLearning.module6.task1.service;

public interface ConsoleService {

	public String readString(String message);

	public String readString(String message, String regexp);

	public byte[] readBytes(String message);

	public void printString(String message);
}
