package main.java.com.xworkz.logger.service;


import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import main.java.com.xworkz.logger.dto.EmailDTO;

@Service
public class EmailServiceImpl implements EmailService {
	private Logger logger = Logger.getLogger(EmailServiceImpl.class);
	@Autowired
	private MailSender mailSender;

	@Override
	public boolean sendEmail(EmailDTO dto) {
		logger.info("Start : EmailService" +": processing an Email");
		logger.info("Invoked sendEmail() method from serviceImpl"); 
		Boolean valid = false;
		try {
		if (Objects.nonNull(dto)) {
			valid = true;
			logger.info("dto object is  not null");
			if (Objects.nonNull(dto.getToEmailId()) && !dto.getToEmailId().isEmpty() && valid) {
				valid = true;
				logger.info("Email id is valid, so we can send");
			} else {
				valid = false;
				logger.warn("Email id is null, so we cannot send");
			}

		} else {
			valid = false;
			logger.warn("dto object is null");
		}

		if (valid == true) {
			SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
			simpleMailMessage.setTo(dto.getToEmailId());
			simpleMailMessage.setText(dto.getBody());
			simpleMailMessage.setSubject(dto.getSubject());

			logger.info("Now going to send an email :");
			mailSender.send(simpleMailMessage);
			logger.info("End : EmailService : processing");

			return valid;

		} else {
			return valid;
		}
		}catch (Exception e) {
			logger.error("Some thing went wrong in Service",e);
		}
		return valid;
	}

}

