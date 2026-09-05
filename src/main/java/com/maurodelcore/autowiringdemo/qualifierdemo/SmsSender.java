package com.maurodelcore.autowiringdemo.qualifierdemo;

import org.springframework.stereotype.Component;

/**
 * Sends messages via SMS.
 * Implements {@link MessageSender} as a Spring-managed component.
 */
@Component
public class SmsSender implements MessageSender {

    /**
     * Sends a message via SMS.
     *
     * @param message the message to send
     */
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}