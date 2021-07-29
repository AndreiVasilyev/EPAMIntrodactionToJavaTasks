package by.epamLearning.module6.task1.console;

import java.util.HashMap;
import java.util.Map;

import by.epamLearning.module6.task1.console.impl.EditBookCommand;
import by.epamLearning.module6.task1.console.impl.EnterNewBookCommand;
import by.epamLearning.module6.task1.console.impl.EnterStringCommand;
import by.epamLearning.module6.task1.console.impl.LoginationRequestCommand;
import by.epamLearning.module6.task1.console.impl.PrintBooksListCommand;
import by.epamLearning.module6.task1.console.impl.PrintMessageCommand;
import by.epamLearning.module6.task1.console.impl.RegistrationRequestCommand;
import by.epamLearning.module6.task1.console.impl.ShowAdminMenuCommand;
import by.epamLearning.module6.task1.console.impl.ShowStartMenuCommand;
import by.epamLearning.module6.task1.console.impl.ShowUserMenuCommand;

public class ConsoleCommandProvider {

	private Map<String, ConsoleCommand> commands = new HashMap<String, ConsoleCommand>();

	public ConsoleCommandProvider() {
		commands.put("no_command", null);
		commands.put("start_menu", new ShowStartMenuCommand());
		commands.put("logination_request", new LoginationRequestCommand());
		commands.put("registration_request", new RegistrationRequestCommand());
		commands.put("print_message", new PrintMessageCommand());
		commands.put("user_menu", new ShowUserMenuCommand());
		commands.put("admin_menu", new ShowAdminMenuCommand());
		commands.put("enter_book", new EnterNewBookCommand());
		commands.put("enter_string", new EnterStringCommand());
		commands.put("print_books", new PrintBooksListCommand());
		commands.put("edit_book", new EditBookCommand());
	}

	public ConsoleCommand getConsoleCommand(String commandName) {
		return commands.get(commandName);
	}
}
