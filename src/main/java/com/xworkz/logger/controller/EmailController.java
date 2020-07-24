package main.java.com.xworkz.logger.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.java.com.xworkz.logger.dto.EmailDTO;
import main.java.com.xworkz.logger.service.EmailService;

@Component
@RequestMapping("/")
public class EmailController {

	@Autowired
	private EmailService emailService;
	private Logger logger = Logger.getLogger(EmailController.class);

	public EmailController() {
		logger.warn("Created " + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String onSubmit(EmailDTO dto) {
		try {
		logger.info("Start : EmailController");
		logger.info("Invoked onSubmit() method");
		Boolean check = emailService.sendEmail(dto);
		
		if (check == true) {
			logger.info("Email is sent Successfully");
			logger.info("End : EmailController");
			return "success";
		} else {
			logger.warn("failed to send an email");
			return "fail";
		}
		
	}catch (Exception e) {
		logger.error("Something went wrong in EmailController",e);
	}
		return null;
	}
}
