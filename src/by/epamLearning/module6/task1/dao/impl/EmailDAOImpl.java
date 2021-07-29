package by.epamLearning.module6.task1.dao.impl;

import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

import by.epamLearning.module6.task1.dao.EmailDAO;
import by.epamLearning.module6.task1.exception.EmailExceptionDAO;

public class EmailDAOImpl implements EmailDAO {

	@Override
	public boolean sendMail(MimeMessage message) throws EmailExceptionDAO {
		try {
			Transport.send(message);
			return true;
		} catch (MessagingException e) {
			throw new EmailExceptionDAO("Error sending email", e);
		}
	}
}
