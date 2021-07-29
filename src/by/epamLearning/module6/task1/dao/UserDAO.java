package by.epamLearning.module6.task1.dao;

import java.util.List;

import by.epamLearning.module6.task1.bean.User;
import by.epamLearning.module6.task1.exception.UserExceptionDAO;

public interface UserDAO {

	public User writeUser(User user) throws UserExceptionDAO;

	public User logination(String login, String password) throws UserExceptionDAO;

	public User readUser(String login) throws UserExceptionDAO;
	
	public List<User> findUsers(User userParams) throws UserExceptionDAO;
}
