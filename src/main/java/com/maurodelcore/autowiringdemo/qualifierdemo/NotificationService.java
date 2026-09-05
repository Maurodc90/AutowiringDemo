package com.maurodelcore.autowiringdemo.qualifierdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Service that sends notifications through multiple channels.
 * Uses {@link MessageSender} implementations for email and SMS delivery.
 */
@Service
public class NotificationService {
    private MessageSender emailSender;
    private MessageSender smsSender;

    /**
     * Constructs the service with email and SMS senders.
     *
     * @param emailSender the email message sender
     * @param smsSender   the SMS message sender
     */
    @Autowired
    public NotificationService(@Qualifier("emailSender") MessageSender emailSender,
                               @Qualifier("smsSender") MessageSender smsSender) {
        this.emailSender = emailSender;
        this.smsSender = smsSender;
    }

    /**
     * Sends a notification through all channels.
     *
     * @param message the message to send
     */
    public void notify(String message) {
        smsSender.sendMessage(message);
        emailSender.sendMessage(message);
    }
}