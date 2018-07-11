package hu.pe.nes.sendemail.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hu.pe.nes.sendemail.modal.EmailModal;
import hu.pe.nes.sendemail.service.GenarateReport;

@RestController
public class SendeMailRest {
	
	private static final String message = "Hi!, This is a test! To = %s";
	
	public GenarateReport report;

	@Autowired
    public SendeMailRest(GenarateReport report) {
        this.report = report;
    }
	
	@RequestMapping("/listemail")
	public EmailModal email(
			@RequestParam(value="to", defaultValue="World") String to) {
		
		return new EmailModal(to, String.format(message, to));
	}
	
	@RequestMapping("/sendemail")
	public String sendReportEmail() {
		return report.genarateReport();
	}
}
