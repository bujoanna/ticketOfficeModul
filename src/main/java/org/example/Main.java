package org.example;

import org.example.ticketApp.TicketApp;

import static org.example.ticketApp.PriceConstants.NORMAL_T;
import static org.example.ticketApp.PriceConstants.REDUCED_T;

public class Main {
    public static void main(String[] args) {
        TicketApp ticketOffice = new TicketApp(NORMAL_T, 0, REDUCED_T, 0);
        ticketOffice.choose();
    }
}