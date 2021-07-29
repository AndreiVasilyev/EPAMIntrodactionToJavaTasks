package by.epamLearning.module6.task1.controller.impl;

import by.epamLearning.module6.task1.bean.User;
import by.epamLearning.module6.task1.controller.Command;
import by.epamLearning.module6.task1.exception.UserExceptionService;
import by.epamLearning.module6.task1.service.ServiceProvider;
import by.epamLearning.module6.task1.service.UserService;
import by.epamLearning.module6.task1.view.UserView;

public class LoginationCommand implements Command {

	@Override
	public String execute(String[] params) {
		String login = params[1].split("=")[1];
		String password = params[2].split("=")[1];
		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		UserService userService = serviceProvider.getUserService();
		User resultLogination = null;
		try {
			resultLogination = userService.logination(login, password);
		} catch (UserExceptionService e) {
			e.printStackTrace();
		}
		return UserView.prepareLoginationAnswer(resultLogination);
	}

}
