package com.blogspot.diegopacheco.camel.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CamelBootstraping {
	public static void main(String[] args) {		
		try{				
			new ClassPathXmlApplicationContext(new String[] {"classpath:camel-server.xml"});			
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
}
