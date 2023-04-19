package org.ruben.java.log;

import org.apache.log4j.Logger;

public class AppNivelLog{
	
	final static Logger logger = Logger.getLogger(AppNivelLog.class);
	
	public static void main(String[] args) {
	
		AppNivelLog app = new AppNivelLog();
		
		if(logger.isDebugEnabled()){
			logger.debug("Hola mundo (debug)");
		}
		
		if(logger.isInfoEnabled()){
			logger.info("Hola mundo (info)");
		}
		
		logger.warn("Hola mundo (warn)");
		logger.error("Hola mundo (error)");
		logger.fatal("Hola mundo (fatal)");

		
	}
	

	
	
}