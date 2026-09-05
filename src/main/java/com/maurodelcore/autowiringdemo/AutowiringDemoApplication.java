package com.maurodelcore.autowiringdemo;

import com.maurodelcore.autowiringdemo.greetingdemo.MessageService;
import com.maurodelcore.autowiringdemo.greetingdemo.TimeBasedGreetingService;
import com.maurodelcore.autowiringdemo.qualifierdemo.NotificationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

/**
 * Entry point for the AutowiringDemo Spring Boot application.
 * Demonstrates autowiring by type, qualifier-based injection, and constructor injection.
 */
@SpringBootApplication
public class AutowiringDemoApplication {

	/**
	 * Runs the application, demonstrating qualifier-based notification
	 * and time-based personalized greeting.
	 *
	 * @param args command-line arguments
	 */
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AutowiringDemoApplication.class, args);

		// Qualifier demo — sends message through both email and SMS
		NotificationService notificationService = context.getBean(NotificationService.class);
		notificationService.notify("Hello World!");

		// Greeting demo — personalized greeting based on time of day
		MessageService messageService = context.getBean(MessageService.class);
		TimeBasedGreetingService greetingService = context.getBean(TimeBasedGreetingService.class);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome please insert your name: ");
		String name = scanner.nextLine();
		messageService.setName(name);
		System.out.println(greetingService.getGreeting());
	}
}