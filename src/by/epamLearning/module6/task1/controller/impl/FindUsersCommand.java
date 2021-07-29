package by.epamLearning.module6.task1.controller.impl;

import java.util.List;

import by.epamLearning.module6.task1.bean.Role;
import by.epamLearning.module6.task1.bean.User;
import by.epamLearning.module6.task1.controller.Command;
import by.epamLearning.module6.task1.exception.UserExceptionService;
import by.epamLearning.module6.task1.service.ServiceProvider;
import by.epamLearning.module6.task1.service.UserService;
import by.epamLearning.module6.task1.view.UserView;

public class FindUsersCommand implements Command {

	@Override
	public String execute(String[] params) {
		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		UserService userService = serviceProvider.getUserService();
		User user = new User();
		for (int i = 1; i < params.length; i++) {
			String[] splitedParam = params[i].split("=");
			String paramName = splitedParam[0];
			String paramValue = splitedParam[1];
			if ("login".equalsIgnoreCase(paramName)) {
				user.setLogin(paramValue);
			} else if ("password".equalsIgnoreCase(paramName)) {
				user.setPassword(paramValue);
			} else if ("role".equalsIgnoreCase(paramName)) {
				user.setRole(Role.valueOf(paramValue.toUpperCase()));
			} else if ("email".equalsIgnoreCase(paramName)) {
				user.setEmail(paramValue);
			}
		}
		try {
			List<User> users = userService.findUsers(user);
			return UserView.findUsersAnswer(users);
		} catch (UserExceptionService e) {
			e.printStackTrace();
		}
		return null;
	}

}
