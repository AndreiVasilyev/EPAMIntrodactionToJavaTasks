package by.epamLearning.module6.task1.console.impl;

import by.epamLearning.module6.task1.console.ConsoleCommand;
import by.epamLearning.module6.task1.service.ConsoleService;
import by.epamLearning.module6.task1.service.ServiceProvider;
import by.epamLearning.module6.task1.util.Utils;

public class RegistrationRequestCommand implements ConsoleCommand {

	@Override
	public String execute(String... args) {
		ServiceProvider provider = ServiceProvider.getInstance();
		ConsoleService consoleService = provider.getConsoleService();
		String newLogin = consoleService.readString("login");
		String newPassword = Utils.encodePassword(consoleService.readBytes("password"));
		String role = consoleService.readString("role");
		String email = consoleService.readString("email");
		StringBuilder builder = new StringBuilder("registration login=");
		builder.append(newLogin);
		builder.append(" password=");
		builder.append(newPassword);
		builder.append(" role=");
		builder.append(role);
		builder.append(" email=");
		builder.append(email);
		return builder.toString();
	}

}
