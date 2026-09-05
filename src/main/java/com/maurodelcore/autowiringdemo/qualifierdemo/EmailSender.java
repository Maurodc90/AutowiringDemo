package com.maurodelcore.autowiringdemo.qualifierdemo;

import org.springframework.stereotype.Component;

/**
 * Sends messages via email.
 * Implements {@link MessageSender} as a Spring-managed component.
 */
@Component
public class EmailSender implements MessageSender {

    /**
     * Sends a message via email.
     *
     * @param message the message to send
     */
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}