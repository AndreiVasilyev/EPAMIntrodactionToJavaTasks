package by.epamLearning.module6.task1.console.impl;

import by.epamLearning.module6.task1.console.ConsoleCommand;
import by.epamLearning.module6.task1.service.ConsoleService;
import by.epamLearning.module6.task1.service.ServiceProvider;

public class ShowStartMenuCommand implements ConsoleCommand {

	@Override
	public String execute(String... args) {
		ServiceProvider provider = ServiceProvider.getInstance();
		ConsoleService consoleService = provider.getConsoleService();
		String menuString = "\nChoose action\n1. Login\n2. Register new user\n3. Exit\n";
		consoleService.printString(menuString);
		return consoleService.readString("your choice", "[123]{1}");
	}

}
