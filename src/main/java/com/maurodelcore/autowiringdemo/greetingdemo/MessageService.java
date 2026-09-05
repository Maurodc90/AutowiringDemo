package com.maurodelcore.autowiringdemo.greetingdemo;

import org.springframework.stereotype.Service;

/**
 * Service that stores and retrieves the user's name.
 * Used by other services to personalize output.
 */
@Service
public class MessageService {
    private String name = "";

    /**
     * Sets the user's name.
     *
     * @param name the user's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the user's name.
     *
     * @return the stored name
     */
    public String getName() {
        return name;
    }
}