package by.epamLearning.oop.task5.main;

import by.epamLearning.oop.task5.bean.Gift;
import by.epamLearning.oop.task5.builder.SweetnessBuilder;
import by.epamLearning.oop.task5.builder.SweetnessBuilderImpl;
import by.epamLearning.oop.task5.builder.SweetnessCreator;
import by.epamLearning.oop.task5.builder.WrappingBuilder;
import by.epamLearning.oop.task5.builder.WrappingBuilderImpl;
import by.epamLearning.oop.task5.builder.WrappingCreator;
import by.epamLearning.oop.task5.logic.GiftLogic;
import by.epamLearning.oop.task5.vew.GiftView;

public class Task5 {

	public static void main(String[] args) {
		WrappingBuilder wrappingBuilder = new WrappingBuilderImpl();
		SweetnessBuilder sweetnessBuilder = new SweetnessBuilderImpl();
		SweetnessCreator sweetnessCreator = new SweetnessCreator();
		WrappingCreator wrappingCreator = new WrappingCreator();
		GiftLogic giftLogic = new GiftLogic();
		GiftView giftView = new GiftView();
		Gift gift = new Gift();
		gift.setCustomer("Ivanov");
		gift.setGiftNumber(1);
		wrappingCreator.createCardboardBox(wrappingBuilder);
		gift.setWraping(wrappingBuilder.getResult());
		sweetnessCreator.createCandyABC(sweetnessBuilder);
		giftLogic.addSweetness(gift, sweetnessBuilder.getResult(), 5);
		sweetnessCreator.createChocolateAAA(sweetnessBuilder);
		giftLogic.addSweetness(gift, sweetnessBuilder.getResult(), 2);
		sweetnessCreator.createMarshmallowQQQ(sweetnessBuilder);
		giftLogic.addSweetness(gift, sweetnessBuilder.getResult());
		giftView.printGiftInfo(gift, giftLogic.giftAmount(gift));
	}
}
