package by.epamLearning.oop.task5.logic;

import java.util.List;

import by.epamLearning.oop.task5.bean.Gift;
import by.epamLearning.oop.task5.bean.Sweetness;

public class GiftLogic {

	public void addSweetness(Gift gift, Sweetness sweetness) {
		addSweetness(gift, sweetness, 1);
	}

	public void addSweetness(Gift gift, Sweetness sweetness, int quantity) {
		if (quantity != 0) {
			for (int i = 0; i < quantity; i++) {
				gift.getSweets().add(sweetness);
			}
		}
	}

	public void addSweets(Gift gift, List<Sweetness> sweets) {
		if (sweets != null && !sweets.isEmpty()) {
			gift.getSweets().addAll(sweets);
		}
	}

	public boolean removeSweetness(Gift gift, Sweetness sweetness) {
		return removeSweetness(gift, sweetness, 1);
	}

	public boolean removeSweetness(Gift gift, Sweetness sweetness, int quantity) {
		if (quantity == 0) {
			return false;
		}
		return gift.getSweets().remove(sweetness);
	}

	public boolean removeSweets(Gift gift, List<Sweetness> sweets) {
		if (sweets != null && !sweets.isEmpty()) {
			return gift.getSweets().removeAll(sweets);
		}
		return false;
	}

	public int giftAmount(Gift gift) {
		int amount = 0;
		for (Sweetness sweetness : gift.getSweets()) {
			amount += sweetness.getPrice();
		}
		return amount + gift.getWraping().getPrice();
	}
}
