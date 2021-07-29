package by.epamLearning.oop.task5.builder;

public class SweetnessCreator {

	public void createCandyABC(SweetnessBuilder sweetnessBuilder) {
		sweetnessBuilder.setType("Candy");
		sweetnessBuilder.setName("ABC");
		sweetnessBuilder.setWeight(5);
		sweetnessBuilder.setFilling("nuts");
		sweetnessBuilder.setWrapping("paper");
		sweetnessBuilder.setPrice(12);
	}

	public void createCandyDFG(SweetnessBuilder sweetnessBuilder) {
		sweetnessBuilder.setType("Candy");
		sweetnessBuilder.setName("DFG");
		sweetnessBuilder.setWeight(7);
		sweetnessBuilder.setFilling("w/o");
		sweetnessBuilder.setWrapping("w/o");
		sweetnessBuilder.setPrice(8);
	}

	public void createChocolateAAA(SweetnessBuilder sweetnessBuilder) {
		sweetnessBuilder.setType("Chocolate");
		sweetnessBuilder.setName("AAA");
		sweetnessBuilder.setWeight(100);
		sweetnessBuilder.setFilling("w/o");
		sweetnessBuilder.setWrapping("paper");
		sweetnessBuilder.setPrice(15);
	}

	public void createMarshmallowQQQ(SweetnessBuilder sweetnessBuilder) {
		sweetnessBuilder.setType("Marshmallow");
		sweetnessBuilder.setName("QQQ");
		sweetnessBuilder.setWeight(10);
		sweetnessBuilder.setFilling("w/o");
		sweetnessBuilder.setWrapping("w/o");
		sweetnessBuilder.setPrice(10);
	}
}
