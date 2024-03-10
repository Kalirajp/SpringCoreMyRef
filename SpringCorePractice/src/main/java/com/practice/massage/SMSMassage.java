package com.practice.massage;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class SMSMassage implements MessageService{
	
	

	public void sendMassage() {
		
		System.out.println("sent massage via SMS ");
	}

}
