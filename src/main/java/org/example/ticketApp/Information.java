package org.example.ticketApp;

public class Information {

    public void printInformation() {
        System.out.println(">> Bilety do wyboru:\n1. Bilet - " + TicketType.NORMAL + " " + Price.getPriceToPay() + Price.getPRICE() + Price.getCurrency() +
                "\n2." + " Bilet - " + TicketType.REDUCED + " " + Price.getPriceToPay() + Price.getREDUCED_TICKET() + Price.getCurrency() + "(50% ceny biletu normalnego, dla dzieci do lat 10.)\n>> ");
    }

}
