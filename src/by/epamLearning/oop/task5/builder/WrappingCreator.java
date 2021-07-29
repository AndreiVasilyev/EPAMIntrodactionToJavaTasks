package by.epamLearning.oop.task5.builder;

public class WrappingCreator {

	public void createCardboardBox(WrappingBuilder wrappingBuilder) {
		wrappingBuilder.setWrapingShape("Cube 20x20x20");
		wrappingBuilder.setVolume(3);
		wrappingBuilder.setColor("blue");
		wrappingBuilder.setImage("no");
		wrappingBuilder.setLockType("Cardboard");
		wrappingBuilder.setMaterial("Cardboard");
	}

	public void createMetalBox(WrappingBuilder wrappingBuilder) {
		wrappingBuilder.setWrapingShape("Cilinder 10x20");
		wrappingBuilder.setVolume(1);
		wrappingBuilder.setColor("Grey");
		wrappingBuilder.setImage("stars");
		wrappingBuilder.setLockType("Metal cover");
		wrappingBuilder.setMaterial("Metal");
	}

	public void createPackingBag(WrappingBuilder wrappingBuilder) {
		wrappingBuilder.setWrapingShape("Box 10x20x30");
		wrappingBuilder.setVolume(2);
		wrappingBuilder.setColor("Yellow");
		wrappingBuilder.setImage("no");
		wrappingBuilder.setLockType("Ribbon");
		wrappingBuilder.setMaterial("Textile");
	}
}
