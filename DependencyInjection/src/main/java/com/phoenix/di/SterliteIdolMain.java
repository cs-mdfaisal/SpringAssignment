package com.phoenix.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.phoenix.di.config.PerformerConfig;
import com.phoenix.di.performers.Performer;

public class SterliteIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = 
				new AnnotationConfigApplicationContext(PerformerConfig.class);
	
	
	//fetching application object from spring IoC container
	Performer p=context.getBean("Pyaare Mohan", Performer.class);
	//Performer p=context.getBean("instrumentalist", Performer.class);
	
	p.perform();
	
	Performer singer = context.getBean("singer", Performer.class);
	singer.perform();
	}

}
