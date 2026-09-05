package com.maurodelcore.autowiringdemo.qualifierdemo;

/**
 * Contract for message sending services.
 * Implementations handle delivery through a specific channel.
 */
public interface MessageSender {
    /**
     * Sends a message through this channel.
     *
     * @param message the message to send
     */
    void sendMessage(String message);
}