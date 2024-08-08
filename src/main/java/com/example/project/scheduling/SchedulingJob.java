package com.example.project.scheduling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SchedulingJob {

	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void executeJob1(){
		logger.info("scheduling test");
	}
	public void executeJob2(){
		logger.info("scheduling test");
	}
	
}
