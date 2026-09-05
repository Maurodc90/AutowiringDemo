package com.maurodelcore.autowiringdemo.greetingdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

/**
 * Generates a personalized greeting based on the current time of day.
 * Uses {@link MessageService} to retrieve the user's name.
 */
@Component
public class TimeBasedGreetingService implements GreetingService {
    private MessageService messageService;

    /**
     * Constructs the service with the required MessageService dependency.
     *
     * @param messageService the service providing the user's name
     */
    @Autowired
    public TimeBasedGreetingService(MessageService messageService) {
        this.messageService = messageService;
    }

    /**
     * Returns a time-based greeting with the user's name.
     *
     * @return greeting string such as "Good evening Mauro"
     */
    public String getGreeting() {
        return getTime() + " " + messageService.getName();
    }

    /**
     * Determines the greeting prefix based on the current hour.
     *
     * @return "Good morning", "Good afternoon", or "Good evening"
     */
    public String getTime() {
        LocalTime time = LocalTime.now();
        if (time.getHour() < 12) {
            return "Good morning";
        } else if (time.getHour() < 18) {
            return "Good afternoon";
        } else {
            return "Good evening";
        }
    }
}