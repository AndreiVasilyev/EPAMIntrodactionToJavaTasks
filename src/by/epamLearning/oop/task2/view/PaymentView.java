package by.epamLearning.oop.task2.view;

import java.util.Map;

import by.epamLearning.oop.task2.bean.Payment;
import by.epamLearning.oop.task2.bean.Payment.Product;

public class PaymentView {

	public void printToConsole(Payment payment, int amount) {
		System.out.println("Payment #" + payment.getId() + "\t" + payment.getDate().toString());
		for (Map.Entry<Product, Integer> entry : payment.getProducts().entrySet()) {
			Product product = entry.getKey();
			System.out.printf("   %-4d%-10s%-20s%-5d%3dqt\n", product.getId(), product.getName(),
					product.getDescription(), product.getCost(), entry.getValue());
		}
		System.out.println("Total amount: " + amount + "\n\n");
	}

	public void printToConsole(Product product) {
		System.out.printf("\n%-4d%-10s%-20s%-5d\n\n", product.getId(), product.getName(), product.getDescription(),
				product.getCost());
	}
}
