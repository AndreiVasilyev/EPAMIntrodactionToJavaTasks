package by.epamLearning.oop.task2.main;

import by.epamLearning.oop.task2.bean.Payment;
import by.epamLearning.oop.task2.bean.Payment.Product;
import by.epamLearning.oop.task2.logic.PaymentLogic;
import by.epamLearning.oop.task2.view.PaymentView;

public class Task2 {

	public static void main(String[] args) {
		PaymentLogic paymentLogic = new PaymentLogic();
		PaymentView paymentView = new PaymentView();
		Payment payment = new Payment();
		payment.setId(1l);
		paymentView.printToConsole(payment, paymentLogic.calculateAmount(payment));
		paymentLogic.addProduct(payment, new Payment.Product(1, "product1", "description", 32), 5);
		paymentLogic.addProduct(payment, new Payment.Product(2, "product2", "description", 21), 2);
		paymentLogic.addProduct(payment, new Payment.Product(3, "product3", "description", 12), 1);
		paymentView.printToConsole(payment, paymentLogic.calculateAmount(payment));

		Product product = paymentLogic.getProduct(payment, 3);
		paymentView.printToConsole(product);

		paymentLogic.removeProduct(payment, 1);
		paymentView.printToConsole(payment, paymentLogic.calculateAmount(payment));
	}

}
