package by.epamLearning.module6.task1.controller;

import java.util.HashMap;
import java.util.Map;

import by.epamLearning.module6.task1.controller.impl.AddBookCommand;
import by.epamLearning.module6.task1.controller.impl.DeleteBookCommand;
import by.epamLearning.module6.task1.controller.impl.FindBooksCommand;
import by.epamLearning.module6.task1.controller.impl.FindUsersCommand;
import by.epamLearning.module6.task1.controller.impl.LoginationCommand;
import by.epamLearning.module6.task1.controller.impl.ReadAllBooksCommand;
import by.epamLearning.module6.task1.controller.impl.ReadBooksByPageCommand;
import by.epamLearning.module6.task1.controller.impl.RegistrationCommand;
import by.epamLearning.module6.task1.controller.impl.SendEmailCommand;

public class CommandProvider {

	private Map<String, Command> commands = new HashMap<>();

	public CommandProvider() {
		commands.put("no_command", null);
		commands.put("logination", new LoginationCommand());
		commands.put("registration", new RegistrationCommand());
		commands.put("read_all_books", new ReadAllBooksCommand());
		commands.put("read_books", new ReadBooksByPageCommand());
		commands.put("find_books", new FindBooksCommand());
		commands.put("find_users", new FindUsersCommand());
		commands.put("send_email", new SendEmailCommand());
		commands.put("add_book", new AddBookCommand());
		commands.put("delete_book", new DeleteBookCommand());
	}

	public Command getCommand(String commandName) {
		Command command = commands.get(commandName);
		return command == null ? commands.get("no_command") : command;
	}
}
