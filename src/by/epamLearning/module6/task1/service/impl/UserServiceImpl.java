package by.epamLearning.module6.task1.service.impl;

import java.util.List;

import by.epamLearning.module6.task1.bean.User;
import by.epamLearning.module6.task1.dao.DAOProvider;
import by.epamLearning.module6.task1.dao.UserDAO;
import by.epamLearning.module6.task1.exception.UserExceptionDAO;
import by.epamLearning.module6.task1.exception.UserExceptionService;
import by.epamLearning.module6.task1.service.UserService;

public class UserServiceImpl implements UserService {

	private DAOProvider provider = DAOProvider.getInstance();

	@Override
	public User registration(User user) throws UserExceptionService {
		UserDAO userDAO = provider.getUserDAO();
		try {
			return userDAO.writeUser(user);
		} catch (UserExceptionDAO e) {
			throw new UserExceptionService("Error registration service", e);
		}
	}

	@Override
	public User logination(String login, String password) throws UserExceptionService {
		UserDAO userDAO = provider.getUserDAO();
		try {
			return userDAO.logination(login, password);
		} catch (UserExceptionDAO e) {
			throw new UserExceptionService("Error logination service", e);
		}
	}

	@Override
	public List<User> findUsers(User userParams) throws UserExceptionService {
		UserDAO userDAO = provider.getUserDAO();
		try {
			return userDAO.findUsers(userParams);
		} catch (UserExceptionDAO e) {
			throw new UserExceptionService("Error find users service", e);
		}
	}
}
