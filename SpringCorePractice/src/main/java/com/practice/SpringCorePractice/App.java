package com.practice.SpringCorePractice;

import com.practice.massage.SMSMassage;
import com.practice.massage.TwitterMassage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.massage.Message;
import com.practice.massage.MessageService;

public class App 
{
    public static void main( String[] args )
    {
        //SMSMassage sms=new SMSMassage();
    	//sms.sendMassage();
    	
    	//TwitterMassage twit=new TwitterMassage();
    	//twit.sendMassage();
    	
    	//MessageService msg=new SMSMassage();  
    	//msg.sendMassage();
    	
    	//MessageService msg=new TwitterMassage();  
    	//msg.sendMassage();
    	
		/*
		 * ApplicationContext context=new
		 * ClassPathXmlApplicationContext("./spring.xml"); MessageService bean =
		 * (MessageService)context.getBean("messageService"); bean.sendMassage();
		 */
    	
    	
    	ApplicationContext factory=new AnnotationConfigApplicationContext(Conf.class);
    	Message bean =(Message)factory.getBean(Message.class);
    	bean.sendingMsg();
        
    }
}
