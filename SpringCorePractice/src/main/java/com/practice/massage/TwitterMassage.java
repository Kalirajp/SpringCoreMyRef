package com.practice.massage;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TwitterMassage implements MessageService{
	
		public void sendMassage() {
		
		System.out.println("sent massage via Twitter");
	}

}
