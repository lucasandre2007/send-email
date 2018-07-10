package hu.pe.nes.sendemail.modal;

import lombok.Data;

@Data
public class EmailModal {
	
	private String to;
	private String content;
	
	public EmailModal(String to, String content) {
		this.to = to;
		this.content = content;
	}
}
