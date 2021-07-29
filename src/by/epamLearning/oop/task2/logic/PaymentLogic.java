package by.epamLearning.oop.task2.logic;

import java.util.Map;

import by.epamLearning.oop.task2.bean.Payment;
import by.epamLearning.oop.task2.bean.Payment.Product;

public class PaymentLogic {

	public void addProduct(Payment payment, Product product, int quantity) {
		Map<Product, Integer> products = payment.getProducts();
		if (products.containsKey(product)) {
			int currentQuantity = products.get(product);
			products.replace(product, currentQuantity + quantity);
		} else {
			products.put(product, Integer.valueOf(quantity));
		}

	}

	public Product getProduct(Payment payment, long id) {
		Map<Product, Integer> products = payment.getProducts();
		for (Map.Entry<Product, Integer> entry : products.entrySet()) {
			if (id == entry.getKey().getId()) {
				return entry.getKey();
			}
		}
		return null;
	}

	public void removeProduct(Payment payment, long id) {
		removeProduct(payment, id, 1);
	}

	public void removeProduct(Payment payment, long id, int quantity) {
		Map<Product, Integer> products = payment.getProducts();
		Product currentProduct = getProduct(payment, id);
		if (currentProduct != null) {
			int currentQuantity = products.get(currentProduct);
			if (currentQuantity <= quantity) {
				products.remove(currentProduct);
			} else {
				currentQuantity -= quantity;
				products.replace(currentProduct, currentQuantity);
			}
		}
	}

	public int calculateAmount(Payment payment) {
		int amount = 0;
		if (payment != null && payment.getProducts() != null) {
			for (Map.Entry<Product, Integer> entry : payment.getProducts().entrySet()) {
				amount += entry.getKey().getCost() * entry.getValue();
			}
		}
		return amount;
	}

}
