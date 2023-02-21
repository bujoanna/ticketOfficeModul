package org.example.ticketApp;

public class Information {

    public void printInformation() {
        System.out.println(">> Bilety do wyboru:\n1. Bilet - " + TicketType.NORMAL + " " + PriceConstants.getPriceToPay() + PriceConstants.getPRICE() + PriceConstants.getCurrency() +
                "\n2." + " Bilet - " + TicketType.REDUCED + " " + PriceConstants.getPriceToPay() + PriceConstants.getREDUCED_TICKET() + PriceConstants.getCurrency() + "(50% ceny biletu normalnego, dla dzieci do lat 10.)\n>> ");
    }

}
