package by.epamLearning.oop.task1.bean;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {

	private List<File> files;

	public Directory() {
		this("");
	}

	public Directory(String name) {
		this(name, new ArrayList<File>());
	}

	public Directory(String name, List<File> files) {
		super(name);
		this.files = files;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	public void addFile(File file) {
		files.add(file);
	}

	public void deleteFile(String name) {
		File file = getFile(name);
		if (file != null) {
			files.remove(file);
		}
	}

	public File getFile(String name) {
		for (File file : files) {
			if (name.equalsIgnoreCase(file.getName())) {
				return file;
			}
		}
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((files == null) ? 0 : files.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directory other = (Directory) obj;
		if (files == null) {
			if (other.files != null)
				return false;
		} else if (!files.equals(other.files))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Directory [files=" + files + "]";
	}

}
