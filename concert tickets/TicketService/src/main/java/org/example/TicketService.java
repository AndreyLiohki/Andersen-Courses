package org.example;

import Ticket.Ticket;
import java.time.LocalDate;
import java.time.LocalTime;
import java.math.BigDecimal;
public class TicketService {

    public static void main(String[] args) {
    Ticket ticket1 = new Ticket();

    String name = new String("La Scala");
    LocalDate date = LocalDate.of(2006, 12,10);
    LocalTime time = LocalTime.of(13, 00, 00);

    Ticket ticket2 = new Ticket(name, (short)324, date, time);

    String name2 = new String("Sydney OH");
    LocalDate date2 = LocalDate.of(2024,12,12);
    LocalTime time2 = LocalTime.of(19,30,00);
    char sector = 'A';
    BigDecimal cost = BigDecimal.valueOf(35.45);

    Ticket ticket3 = new Ticket((short)123, name2, date2, time2, false, sector, 1.123, cost);

    printTicket(ticket1);
    System.out.println();
    System.out.println();
    printTicket(ticket2);
    System.out.println();
    System.out.println();
    printTicket(ticket3);
    }

    public static void printTicket(Ticket ticket){
        System.out.println("Name of Concert Hall: " + ticket.concertHall);
        System.out.println("Day: " + ticket.day);
        System.out.println("Time: " + ticket.time);
        System.out.println("Stadium sector: " + ticket.stadiumSector);
        System.out.println("Ticket cost: " + ticket.cost);
        System.out.println("Maximum allowed backpack weight: " + ticket.maxWeight);
        System.out.print("Is this ticket with Promo: " + ticket.isPromo);

    }

}