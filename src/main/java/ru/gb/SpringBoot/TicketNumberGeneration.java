package ru.gb.SpringBoot;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TicketNumberGeneration {

    public String createNewNumber(){
        return "Ticket #" + UUID.randomUUID().toString();
    }
}
