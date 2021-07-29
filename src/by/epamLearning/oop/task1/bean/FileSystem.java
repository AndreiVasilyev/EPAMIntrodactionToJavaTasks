package by.epamLearning.oop.task1.bean;

public class FileSystem {

	private Directory root;

	public FileSystem() {
		super();
		root = new Directory("root");
	}

	public FileSystem(Directory root) {
		super();
		this.root = root;
	}

	public Directory getRoot() {
		return root;
	}

	public void setRoot(Directory root) {
		this.root = root;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((root == null) ? 0 : root.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FileSystem other = (FileSystem) obj;
		if (root == null) {
			if (other.root != null)
				return false;
		} else if (!root.equals(other.root))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FileSystem [root=" + root + "]";
	}

}
