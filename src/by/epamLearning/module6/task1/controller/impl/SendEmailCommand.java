package by.epamLearning.module6.task1.controller.impl;

import by.epamLearning.module6.task1.bean.EmailMessage;
import by.epamLearning.module6.task1.controller.Command;
import by.epamLearning.module6.task1.exception.EmailExceptionService;
import by.epamLearning.module6.task1.service.EmailService;
import by.epamLearning.module6.task1.service.ServiceProvider;

public class SendEmailCommand implements Command {

	private final String FROM = "study.test.acc@gmail.com";
	private final String PASSWORD = "cxjeyfxhttfaohkq";

	@Override
	public String execute(String[] params) {
		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		EmailService emailService = serviceProvider.getEmailService();
		EmailMessage emailMessage = new EmailMessage();
		emailMessage.setFrom(FROM);
		emailMessage.setLogin(FROM);
		emailMessage.setPassword(PASSWORD);
		emailMessage.setSubject(params[3].replaceAll("&&&", " "));
		String[] adminEmails = params[1].replaceAll("&&&", " ").trim().split(" ");
		for (String adminEmail : adminEmails) {
			emailMessage.addTo(adminEmail);
		}
		String bookParams = params[2].replaceAll("###", "\n").replaceAll("&&&", " ");
		String message = params[4].replaceAll("&&&", " ") + "\n\n" + bookParams;
		emailMessage.setMessage(message);
		try {
			emailService.sendViaGmail(emailMessage);
		} catch (EmailExceptionService e) {
			e.printStackTrace();
		}
		return "0";
	}
}
