package by.epamLearning.module6.task1.console.impl;

import by.epamLearning.module6.task1.console.ConsoleCommand;
import by.epamLearning.module6.task1.service.ConsoleService;
import by.epamLearning.module6.task1.service.ServiceProvider;
import by.epamLearning.module6.task1.util.Utils;

public class LoginationRequestCommand implements ConsoleCommand {

	@Override
	public String execute(String... args) {
		ServiceProvider provider = ServiceProvider.getInstance();
		ConsoleService consoleService = provider.getConsoleService();
		String login = consoleService.readString("login");
		String password = Utils.encodePassword(consoleService.readBytes("password"));
		StringBuilder builder = new StringBuilder("logination login=");
		builder.append(login);
		builder.append(" password=");
		builder.append(password);
		return builder.toString();
	}
}
