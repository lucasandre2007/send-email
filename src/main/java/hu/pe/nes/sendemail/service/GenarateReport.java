package hu.pe.nes.sendemail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GenarateReport {

	private SendEmailService service;

	@Autowired
	private GenarateReport(SendEmailService service) {
        this.service = service;
    }
	
	public String genarateReport() {
		String result = null;
		
		try {
			
			result = service.sendAttachment(report());
		
		} catch (Exception e) {
			return "Ops! This is a error";
		}
		
		return result;
	}
	
	private String report() {
		return "This is a report!";
	}
}
