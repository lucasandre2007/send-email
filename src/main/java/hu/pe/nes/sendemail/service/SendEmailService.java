package hu.pe.nes.sendemail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SendEmailService {

	private EmailService email;

	@Autowired
	public SendEmailService(EmailService email) {
		this.email = email;
	}

	public String sendSimple() {
		try {
			email.sendSimpleMessage("glfariatec@gmail.com", "lucas_andre.2007@hotmail.com", "Subject",
					"This is a test!");

		} catch (Exception e) {
			return "Ops. Deu ruim!";
		}

		return "Email successfully sent!";
	}

	public String sendAttachment(String anexo) {
		try {
			email.sendSimpleMessage("glfariatec@gmail.com", "lucas_andre.2007@hotmail.com", "Email com anexo",
					"This is a test! Attachment: " + anexo);

		} catch (Exception e) {
			return "Ops. Deu ruim!";
		}
		return "Email successfully sent!";
	}

}
