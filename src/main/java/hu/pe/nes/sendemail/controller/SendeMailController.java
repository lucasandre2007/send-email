package hu.pe.nes.sendemail.controller;

import hu.pe.nes.sendemail.modal.EmailModal;
import hu.pe.nes.sendemail.service.EmailServiceImpl;
import hu.pe.nes.sendemail.service.SendEmailService;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendeMailController {
	
	public SendEmailService service;

	@Autowired
    public SendeMailController(SendEmailService service) {
        this.service = service;
    }
	

	//private static final String message = "Hi!, This is a test! From = %s";
	//private final AtomicLong counter = new AtomicLong();

	
	@RequestMapping("/listemail")
	public EmailModal email(
			@RequestParam(value="from", defaultValue="World") String from, 
			@RequestParam(value="to", defaultValue="World") String to//,
			//@RequestParam(value="subject", defaultValue="World") String subject,
			//@RequestParam(value="name", defaultValue="World") String name
			) {
		return null;
		//return new EmailModal(counter.incrementAndGet(), String.format(message, from), to);
	}
	
	@RequestMapping("/sendemail")
	public String sendEmail(
			@RequestParam(value="to", defaultValue="World") String to) {
		
		String result = null;
		result = service.enviaEmail();
	
		return result;
	}
}
