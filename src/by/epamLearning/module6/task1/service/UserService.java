package by.epamLearning.module6.task1.service;

import java.util.List;

import by.epamLearning.module6.task1.bean.User;
import by.epamLearning.module6.task1.exception.UserExceptionService;

public interface UserService {

	public User registration(User user) throws UserExceptionService;

	public User logination(String login, String password) throws UserExceptionService;

	public List<User> findUsers(User userParams) throws UserExceptionService;

}
