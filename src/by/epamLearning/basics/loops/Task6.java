package by.epamLearning.basics.loops;

public class Task6 {

	public static void main(String[] args) {
		for(int i=0;i<500;i++) {
			System.out.print("("+(char)i+"="+i+") ");
			if(i%10==0) System.out.println();
		}

	}

}
