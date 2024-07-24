package ru.gb.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(Application.class, args);
		TicketNumberGeneration generation = context.getBean(TicketNumberGeneration.class);
		System.out.println(generation.createNewNumber());
		System.out.println(generation.createNewNumber());
		System.out.println(generation.createNewNumber());

		Board board = context.getBean(Board.class);

		System.out.println(board.newTicket());
	}

}
