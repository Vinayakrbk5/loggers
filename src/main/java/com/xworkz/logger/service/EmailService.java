package main.java.com.xworkz.logger.service;

import main.java.com.xworkz.logger.dto.EmailDTO;

public interface EmailService {
	public boolean sendEmail(EmailDTO dto);

}
