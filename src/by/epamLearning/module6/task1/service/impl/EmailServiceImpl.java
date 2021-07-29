package by.epamLearning.module6.task1.service.impl;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import by.epamLearning.module6.task1.bean.EmailMessage;
import by.epamLearning.module6.task1.dao.DAOProvider;
import by.epamLearning.module6.task1.dao.EmailDAO;
import by.epamLearning.module6.task1.exception.EmailExceptionDAO;
import by.epamLearning.module6.task1.exception.EmailExceptionService;
import by.epamLearning.module6.task1.service.EmailService;

public class EmailServiceImpl implements EmailService {

	private DAOProvider provider = DAOProvider.getInstance();

	@Override
	public boolean sendViaGmail(EmailMessage emailMessage) throws EmailExceptionService {
		EmailDAO emailDAO = provider.getEmailDAO();
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", "smtp.gmail.com");
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.smtp.port", "587");
		properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
		properties.setProperty("mail.smtp.starttls.enable", "true");
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(emailMessage.getLogin(), emailMessage.getPassword());
			}
		});
		Address[] addresses = new Address[emailMessage.getTo().size()];		
		MimeMessage message = new MimeMessage(session);
		try {
			int arrayCounter = 0;
			for (String address : emailMessage.getTo()) {
				addresses[arrayCounter++] = new InternetAddress(address);
			}
			message.setFrom(new InternetAddress(emailMessage.getFrom()));
			message.setSubject(emailMessage.getSubject());
			message.addRecipients(Message.RecipientType.TO, addresses);
			message.setText(emailMessage.getMessage());
			return emailDAO.sendMail(message);
		} catch (EmailExceptionDAO | MessagingException e) {
			throw new EmailExceptionService("Error creating email message", e);
		}
	}
}
