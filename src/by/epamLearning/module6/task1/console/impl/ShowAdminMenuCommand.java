package by.epamLearning.module6.task1.console.impl;

import by.epamLearning.module6.task1.console.ConsoleCommand;
import by.epamLearning.module6.task1.service.ConsoleService;
import by.epamLearning.module6.task1.service.ServiceProvider;

public class ShowAdminMenuCommand implements ConsoleCommand {

	@Override
	public String execute(String... args) {
		ServiceProvider provider = ServiceProvider.getInstance();
		ConsoleService consoleService = provider.getConsoleService();
		String menuString = "\nChoose action\n1. Add new book\n2. Delete book\n3. Edit book\n4. Start menu\n";
		consoleService.printString(menuString);
		return consoleService.readString("your choice", "[1234]{1}");
	}

}
