package by.epamLearning.module6.task1.service;

import by.epamLearning.module6.task1.bean.EmailMessage;
import by.epamLearning.module6.task1.exception.EmailExceptionService;

public interface EmailService {
	

	boolean sendViaGmail(EmailMessage emailMessage) throws EmailExceptionService;
}
