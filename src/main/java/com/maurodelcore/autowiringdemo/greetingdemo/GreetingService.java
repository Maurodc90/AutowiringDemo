package com.maurodelcore.autowiringdemo.greetingdemo;

/**
 * Contract for greeting services.
 * Implementations generate a personalized greeting message.
 */
public interface GreetingService {
    /**
     * Returns a personalized greeting message.
     *
     * @return the greeting string
     */
    String getGreeting();
}