package org.example;

import org.example.ticketApp.PriceConstants;
import org.example.ticketApp.TicketApp;

public class Main {
    public static void main(String[] args) {
        TicketApp ticketOffice = new TicketApp(PriceConstants.NORMAL_T,0,PriceConstants.REDUCED_T,0);
        ticketOffice.choose();
    }
}