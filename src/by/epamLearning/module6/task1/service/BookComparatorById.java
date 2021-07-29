package by.epamLearning.module6.task1.service;

import java.util.Comparator;

import by.epamLearning.module6.task1.bean.Book;

public class BookComparatorById implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		long difference = o1.getId() - o2.getId();
		return difference > 0 ? 1 : difference == 0 ? 0 : -1;
	}

}
