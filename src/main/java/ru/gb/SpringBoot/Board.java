package ru.gb.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Board {
    private TicketNumberGeneration ticketNumberGeneration;

    @Autowired
    public Board(TicketNumberGeneration ticketNumberGeneration){
        this.ticketNumberGeneration = ticketNumberGeneration;
    }
    public Ticket newTicket(){
        return new Ticket(ticketNumberGeneration.createNewNumber(), LocalDateTime.now());
    }
}
