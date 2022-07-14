package com.test.integration;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronTrigger {
    private CustomGateway customGateway;

   
    public CronTrigger(CustomGateway customGateway) {
		super();
		this.customGateway = customGateway;
	}


	@Scheduled(cron = "0/5 * * * * *")
    public void printMessage() {
       
        customGateway.start("https://worldtimeapi.org/api/timezone/Etc/UTC");
    }
}
