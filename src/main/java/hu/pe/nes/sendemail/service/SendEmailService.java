package hu.pe.nes.sendemail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SendEmailService {
	
	private EmailServiceImpl email;
	
	@Autowired
    public SendEmailService(EmailServiceImpl email) {
        this.email = email;
    }
	
	public String enviaEmail() {
		try {
			email.sendSimpleMessage("glfariatec@gmail.com", "lucas_andre.2007@hotmail.com", "Subject", "This is a test!");
			
		} catch (Exception e) {
			return "Ops. Deu ruim!";
		}
		
		return "Email successfully sent!";
	} 

}
