package main.java.com.xworkz.logger.dto;

import org.apache.log4j.Logger;

public class EmailDTO {
	
	private Logger logger=Logger.getLogger(EmailDTO.class);
	private String toEmailId;
	private String subject;
	private String body;
	
	public EmailDTO() {
		logger.info("Created "+this.getClass().getSimpleName());
	}

	public String getToEmailId() {
		return toEmailId;
	}

	public void setToEmailId(String toEmailId) {
		this.toEmailId = toEmailId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "EmailDTO [toEmailId=" + toEmailId + ", subject=" + subject + ", body=" + body + "]";
	}
	
	
	

}
