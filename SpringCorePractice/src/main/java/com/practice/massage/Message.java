package com.practice.massage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Message {
	
	@Autowired
	@Qualifier("twitterMassage")
	MessageService msg;
	
	public void sendingMsg() {
		
		msg.sendMassage();
		
	}

}
