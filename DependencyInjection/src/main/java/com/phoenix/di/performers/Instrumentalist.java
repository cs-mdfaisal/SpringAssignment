package com.phoenix.di.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.phoenix.di.instruments.Instrument;
//instrumentalist is a dependent object which depends on dependency object instrument
@Component("Pyaare Mohan")
public class Instrumentalist implements Performer {

	//Dependency
	@Autowired//used to acheive dependency injection for complex objects complex property
	private Instrument instrument;
	
	@Value("Nile Nile Ambar pe...")//used to inject value in simple property
	private String song;
	
	//Business logic method of performer
	@Override
	public void perform() {
		// TODO Auto-generated method stub

	System.out.println("Instrument is playing a song "+song);	
	instrument.play();	
		
	}

}
