package by.epamLearning.module6.task1.dao;

import javax.mail.internet.MimeMessage;

import by.epamLearning.module6.task1.exception.EmailExceptionDAO;

public interface EmailDAO {

	boolean sendMail(MimeMessage message) throws EmailExceptionDAO;
}
