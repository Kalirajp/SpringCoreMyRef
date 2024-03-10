package com.practice.SpringCorePractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.practice.massage.Message;
import com.practice.massage.MessageService;
import com.practice.massage.SMSMassage;
import com.practice.massage.TwitterMassage;

@Configuration
//@ComponentScan("com.practice.massage")
@ComponentScan(basePackages="com.practice.massage")
public class Conf {
	/*
	 * @Bean
	 * 
	 * @Primary public MessageService getSMSMassage() { return new SMSMassage(); }
	 */
	/*
	 * @Bean public Message getMassage() { return new Message(); }
	 * 
	 * @Bean public MessageService getTwitterMassage() { return new
	 * TwitterMassage(); }
	 */

}
