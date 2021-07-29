package by.epamLearning.module6.task1.view;

import java.util.List;

import by.epamLearning.module6.task1.bean.Role;
import by.epamLearning.module6.task1.bean.User;
import by.epamLearning.module6.task1.exception.UserExceptionDAO;

public class UserView {

	public static String prepareStringToWrite(User user) {
		StringBuilder builder = new StringBuilder();
		String endLine = "\n";
		builder.append("login=");
		builder.append(user.getLogin());
		builder.append(endLine);
		builder.append("password=");
		builder.append(user.getPassword());
		builder.append(endLine);
		builder.append("role=");
		builder.append(user.getRole());
		builder.append(endLine);
		builder.append("email=");
		builder.append(user.getEmail());
		builder.append(endLine);
		builder.append(endLine);
		return builder.toString();
	}

	public static String prepareLoginationAnswer(User result) {
		String answer;
		if (result != null) {
			answer = "0 " + result.getRole().toString();
		} else {
			answer = "1 Wrong_login_or_password";
		}
		return answer;
	}

	public static String findUsersAnswer(List<User> users) {
		StringBuilder builder = new StringBuilder();
		if (users == null) {
			builder.append("1 Error reading books");
		} else {
			builder.append("0 ");
			for (User user : users) {
				builder.append(user.getLogin());
				builder.append("###");
				builder.append(user.getPassword());
				builder.append("###");
				builder.append(user.getRole().toString());
				builder.append("###");
				builder.append(user.getEmail());
				builder.append("&&&");
			}
		}
		return builder.toString();
	}

	public static User parseUserFromFileRecord(String userString) throws UserExceptionDAO {
		User user = new User();
		String[] properties = userString.trim().split("\n");
		if (properties.length >= 2) {
			for (String propertyString : properties) {
				String[] splitedProperty = propertyString.trim().split("=");
				if (splitedProperty.length == 2) {
					String propertyName = splitedProperty[0].trim();
					String propertyValue = splitedProperty[1].trim();
					if ("login".equals(propertyName)) {
						user.setLogin(propertyValue);
					} else if ("password".equals(propertyName)) {
						user.setPassword(propertyValue);
					} else if ("role".equals(propertyName)) {
						user.setRole(Role.valueOf(propertyValue));
					} else if ("email".equals(propertyName)) {
						user.setEmail(propertyValue);
					}
				}
			}
		} else {
			throw new UserExceptionDAO("Error parsing User record");
		}
		return user;
	}

	public static String parseEmailsFromStringAnswer(String answer) {
		StringBuilder builder = new StringBuilder();
		String[] users = answer.split(" ")[1].split("&&&");
		for (String user : users) {
			String[] params = user.split("###");
			builder.append(params[3].trim());
			builder.append("&&&");
		}
		builder=builder.replace(builder.length()-3, builder.length(), " ");
		return builder.toString();
	}
}
