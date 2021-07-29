package by.epamLearning.oop.task5.vew;

import by.epamLearning.oop.task5.bean.Gift;
import by.epamLearning.oop.task5.bean.Sweetness;

public class GiftView {

	@SuppressWarnings("deprecation")
	public void printGiftInfo(Gift gift, int amount) {
		System.out.println("Gift number: " + gift.getGiftNumber());
		System.out.println("Customer: " + gift.getCustomer());
		System.out.println("Date: " + gift.getDate().toLocaleString());
		System.out.println("Wrapping: ");
		System.out.println("\t\tMaterial: " + gift.getWraping().getMaterial());
		System.out.println("\t\tColor: " + gift.getWraping().getColor());
		System.out.println("\t\tImage: " + gift.getWraping().getImage());
		System.out.println("\t\tWrapingShape: " + gift.getWraping().getWrapingShape());
		System.out.println("\t\tVolume: " + gift.getWraping().getVolume());
		System.out.println("\t\tLock type: " + gift.getWraping().getLockType());
		System.out.println("\t\tPrice: " + gift.getWraping().getPrice());
		System.out.println("Sweets: ");
		for (Sweetness sweetness : gift.getSweets()) {
			System.out.println("\t\tType: " + sweetness.getType());
			System.out.println("\t\tName: " + sweetness.getName());
			System.out.println("\t\tWrapping: " + sweetness.getWrapping());
			System.out.println("\t\tFilling: " + sweetness.getFilling());
			System.out.println("\t\tWeight: " + sweetness.getWeight());
			System.out.println("\t\tPrice: " + sweetness.getPrice() + "\n");
		}
		System.out.println("\nTotal amount: " + amount);
	}
}
