package org.ruben.java.log;

import org.apache.log4j.Logger;

public class AppLogEnError{
	
	final static Logger logger = Logger.getLogger(AppLogEnError.class);
	
	public static void main(String[] args) {
	
		AppLogEnError app = new AppLogEnError();
		try{
			app.dividir();
		}catch(ArithmeticException ex){
			logger.error("Ha fallado la division: ", ex);
		}
	}
	
	private void dividir(){
		int i = 10 /0;
	}
	
	
}