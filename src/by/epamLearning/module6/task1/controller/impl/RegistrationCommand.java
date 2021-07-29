package by.epamLearning.module6.task1.controller.impl;

import by.epamLearning.module6.task1.bean.Role;
import by.epamLearning.module6.task1.bean.User;
import by.epamLearning.module6.task1.controller.Command;
import by.epamLearning.module6.task1.exception.UserExceptionService;
import by.epamLearning.module6.task1.service.ServiceProvider;
import by.epamLearning.module6.task1.service.UserService;
import by.epamLearning.module6.task1.view.UserView;

public class RegistrationCommand implements Command {

	@Override
	public String execute(String[] params) {
		String login = params[1].split("=")[1];
		String password = params[2].split("=")[1];
		String role = params[3].split("=")[1];
		String email = params[4].split("=")[1];
		User resultRegistration = null;
		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		UserService userService = serviceProvider.getUserService();
		User newUser = new User();
		newUser.setLogin(login);
		newUser.setPassword(password);
		newUser.setRole(Role.valueOf(role));
		newUser.setEmail(email);
		try {
			resultRegistration = userService.registration(newUser);
		} catch (UserExceptionService e) {
			e.printStackTrace();
		}
		return UserView.prepareLoginationAnswer(resultRegistration);
	}
}
