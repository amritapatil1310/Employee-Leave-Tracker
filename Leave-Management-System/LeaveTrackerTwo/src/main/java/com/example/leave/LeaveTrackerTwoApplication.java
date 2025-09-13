package com.example.leave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class LeaveTrackerTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaveTrackerTwoApplication.class, args);
	}

}
