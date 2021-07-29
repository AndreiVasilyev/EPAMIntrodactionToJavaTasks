package by.epamLearning.module6.task1.console.impl;

import by.epamLearning.module6.task1.console.ConsoleCommand;
import by.epamLearning.module6.task1.service.ConsoleService;
import by.epamLearning.module6.task1.service.ServiceProvider;

public class EnterStringCommand implements ConsoleCommand {

	@Override
	public String execute(String... args) {
		ServiceProvider provider = ServiceProvider.getInstance();
		ConsoleService consoleService = provider.getConsoleService();
		String message = "";
		if (args != null && args[0] != null)
			message = args[0];
		String regexp = ".*";
		if (args != null && args.length > 1 && args[1] != null)
			regexp = args[1];

		return consoleService.readString(message, regexp);
	}

}
