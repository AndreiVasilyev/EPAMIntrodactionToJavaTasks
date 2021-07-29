package by.epamLearning.basics.linePrograms;

public class Task5 {

	public static void main(String[] args) {
		long time = 5440l;
		long hours = time / 3600;
		long minutes = time % 3600 / 60;
		long seconds = time % 3600 % 60;
		System.out.println("Seconds:" + time + " equals - ");
		System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
	}
}
