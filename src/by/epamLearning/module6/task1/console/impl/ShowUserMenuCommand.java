package by.epamLearning.module6.task1.console.impl;

import by.epamLearning.module6.task1.console.ConsoleCommand;
import by.epamLearning.module6.task1.service.ConsoleService;
import by.epamLearning.module6.task1.service.ServiceProvider;

public class ShowUserMenuCommand implements ConsoleCommand {

	@Override
	public String execute(String... args) {
		ServiceProvider provider = ServiceProvider.getInstance();
		ConsoleService consoleService = provider.getConsoleService();
		String menuString = "\nChoose action\n1. Show catalog pages\n2. Show all catalog\n3. Find books\n4. Send email to ADMIN\n5. Start menu\n";
		consoleService.printString(menuString);
		return consoleService.readString("your choice", "[12345]{1}");
	}

}
