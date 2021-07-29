package by.epamLearning.oop.task1.view;

import by.epamLearning.oop.task1.bean.Directory;
import by.epamLearning.oop.task1.bean.File;

public class FileViewer {

	public void printToConsole(String message, String value) {
		System.out.println(message + "\n");
		System.out.println(value);
	}

	public void printToConsole(String message, File file) {
		System.out.println(message + "\n");
		if (file instanceof Directory) {
			System.out.println(file.getName().toUpperCase());
			printDerectoryContent(file, "\t");
		} else {
			System.out.println(file.getName());
		}
		System.out.println();
	}

	private void printDerectoryContent(File files, String prefix) {
		Directory directory = (Directory) files;
		if (directory.getFiles() != null && !directory.getFiles().isEmpty()) {
			for (File file : directory.getFiles()) {
				if (file instanceof Directory) {
					System.out.println(prefix + file.getName().toUpperCase());
					printDerectoryContent(file, prefix + "\t");
				} else {
					System.out.println(prefix + file.getName());
				}
			}
		}
	}

}
