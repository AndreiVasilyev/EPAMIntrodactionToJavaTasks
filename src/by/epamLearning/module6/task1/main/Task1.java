package by.epamLearning.module6.task1.main;

import by.epamLearning.module6.task1.console.Console;
import by.epamLearning.module6.task1.console.impl.ConsoleImpl;
import by.epamLearning.module6.task1.controller.Controller;
import by.epamLearning.module6.task1.controller.impl.CatalogController;
import by.epamLearning.module6.task1.view.UserView;

public class Task1 {

	private static Controller controller = new CatalogController();
	private static Console console = new ConsoleImpl();

	public static void main(String[] args) {
		boolean firstLevelMenu = true;
		while (firstLevelMenu) {
			int startMenuChoice = Integer.parseInt(console.doAction("start_menu"));
			String userRole = null;
			switch (startMenuChoice) {
			case 1:
				userRole = signIn("logination_request");
				break;
			case 2:
				userRole = signIn("registration_request");
				break;
			case 3:
				firstLevelMenu = false;
			}
			boolean secondLevelMenu = true;
			if ("USER".equalsIgnoreCase(userRole)) {
				while (secondLevelMenu) {
					int userMenuChoice = Integer.parseInt(console.doAction("user_menu"));
					int pageNumber = 1;
					switch (userMenuChoice) {
					case 1:
						while (booksReadRequest("read_books page=" + pageNumber, pageNumber)) {
							pageNumber++;
						}
						break;
					case 2:
						booksReadRequest("read_all_books", pageNumber);
						break;
					case 3:
						String findParams = console.doAction("enter_book", "-desc");
						booksReadRequest("find_books" + findParams, pageNumber);
						break;
					case 4:
						console.doAction("print_message", "Enter new book to send Administrator:");
						String newBook = console.doAction("enter_book", "-id", "-desc");
						String findAdminsAnswer = controller.doAction("find_users role=ADMIN");
						sendEmail(findAdminsAnswer, newBook, "Suggestion to add a new book to the catalog",
								"Please, add this book to the catalog:");
						break;
					case 5:
						secondLevelMenu = false;
					}
				}
			} else if ("ADMIN".equalsIgnoreCase(userRole)) {
				while (secondLevelMenu) {
					int adminMenuChoice = Integer.parseInt(console.doAction("admin_menu"));
					switch (adminMenuChoice) {
					case 1:
						console.doAction("print_message", "\nAdding new book... Enter parametrs:");
						String newBook = console.doAction("enter_book", "-id");
						controller.doAction("add_book" + newBook);
						console.doAction("print_message", "\nBook added.");
						String findUsersAnswer = controller.doAction("find_users role=USER");
						sendEmail(findUsersAnswer, newBook, "Info about new book in catalog",
								"There is new book added in the catalog:");
						break;
					case 2:
						String deleteBookId = console.doAction("enter_string", "id", "[1-9][0-9]*");
						controller.doAction("delete_book " + deleteBookId.trim());
						console.doAction("print_message", "\nBook #" + deleteBookId + " deleted");
						break;
					case 3:
						String editBookId = console.doAction("enter_string", "id", "[1-9][0-9]*");
						String editBook = controller.doAction("find_books id=" + editBookId);
						console.doAction("print_message", "\nEditing book... Enter parametrs:");
						String editedBook = console.doAction("edit_book", editBook);
						System.out.println(editedBook);
						controller.doAction("add_book" + editedBook);
						console.doAction("print_message", "\nBook #" + editBookId + " edited and saved");
						break;
					case 4:
						secondLevelMenu = false;
					}
				}
			}

		}
	}

	private static void sendEmail(String addresses, String bookInfo, String subject, String message) {
		String emails = UserView.parseEmailsFromStringAnswer(addresses);
		bookInfo = bookInfo.trim().replaceAll(" ", "###");
		subject = subject.replaceAll(" ", "&&&");
		message = (message + "\n\n").replaceAll(" ", "&&&");
		String response = controller.doAction("send_email " + emails + " " + bookInfo + " " + subject + " " + message);
		String answer = "0".equals(response) ? "\nEmail sent" : "\nError when sending email";
		console.doAction("print_message", answer);
	}

	private static String signIn(String commandName) {
		String request = console.doAction(commandName);
		String response = controller.doAction(request);
		String[] splitedResponse = response.split(" ");
		if ("0".equals(splitedResponse[0])) {
			return splitedResponse[1];
		} else {
			console.doAction("print_message", "error validation data... try again");
		}
		return null;
	}

	private static boolean booksReadRequest(String commandName, int pageNumber) {
		String response = controller.doAction(commandName);
		String[] splitedResponse = response.split(" ");
		if ("0".equals(splitedResponse[0])) {
			if (splitedResponse.length > 1) {
				console.doAction("print_books", response);
				return true;
			} else if (pageNumber == 1) {
				console.doAction("print_message", "data not found");
			}
		} else {
			console.doAction("print_message", splitedResponse[1]);
		}
		return false;
	}

}
