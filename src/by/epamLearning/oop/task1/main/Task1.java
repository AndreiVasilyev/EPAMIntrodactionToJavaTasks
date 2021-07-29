package by.epamLearning.oop.task1.main;

import by.epamLearning.oop.task1.bean.Directory;
import by.epamLearning.oop.task1.bean.FileSystem;
import by.epamLearning.oop.task1.bean.TextFile;
import by.epamLearning.oop.task1.view.FileViewer;

public class Task1 {

	public static void main(String[] args) {
		FileSystem fileSystem = new FileSystem(new Directory("root"));
		FileViewer viewer = new FileViewer();
		viewer.printToConsole("Empty file system", fileSystem.getRoot());
		fileSystem.getRoot().addFile(new Directory("Download"));
		fileSystem.getRoot().addFile(new Directory("Install"));
		fileSystem.getRoot().addFile(new Directory("Documents"));
		fileSystem.getRoot().addFile(new TextFile("readme", "this file describe folder content"));
		viewer.printToConsole("Current file system", fileSystem.getRoot());
		TextFile textFile = (TextFile) fileSystem.getRoot().getFile("readme");
		viewer.printToConsole("readme file content:", textFile.getText());
		Directory docDirectory = (Directory) fileSystem.getRoot().getFile("Documents");
		docDirectory.addFile(new Directory("temp"));
		docDirectory.addFile(new TextFile("logout"));
		viewer.printToConsole("Current file system", fileSystem.getRoot());
		fileSystem.getRoot().getFile("readme").setName("readme_d");
		viewer.printToConsole("Current file system", fileSystem.getRoot());
		docDirectory.deleteFile("temp");
		viewer.printToConsole("Current file system", fileSystem.getRoot());
	}

}
