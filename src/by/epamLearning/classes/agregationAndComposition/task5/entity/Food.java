package by.epamLearning.classes.agregationAndComposition.task5.entity;

public enum Food {
	OB("Only bed"), RO("Room only"), AO("Accommodation only"), BB("Bed and breakfast"), CB("Continental breakfast"),
	HB("Half board"), HBP("Half board plus"), FB("Full board"), FBP("Full board plus"), ALL("All inclusive"),
	AI("All inclusive"), UAL("Ultra all inclusive"), UAI("Ultra all inclusive"), HcAL("High class all inclusive");

	private String fullName;

	private Food(String fullName) {
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

}
