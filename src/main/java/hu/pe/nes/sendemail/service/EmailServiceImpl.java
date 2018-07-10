package hu.pe.nes.sendemail.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl {
	
	private JavaMailSender javaMailSender;
	 
    @Autowired
    public EmailServiceImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }
    
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void sendSimpleMessage(String from, String to, String subject, String text) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(from);
		message.setTo(to);
		message.setSubject(subject);
		message.setText(text);
		
		logger.info("Sending...");
		
		javaMailSender.send(message);
		
		logger.info("Done");
	}
}
