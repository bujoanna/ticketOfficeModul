package org.example.ticketOffice;

public class Information {

    public void information() {
        System.out.println(">> Bilety do wyboru:\n1. Bilet - " + TicketType.NORMALNY + " " + Price.getPriceToPay() + Price.getPRICE() + Price.getCurrency() +
                "\n2." + " Bilet - " + TicketType.ULGOWY + " " + Price.getPriceToPay() + Price.getREDUCED_TICKET() + Price.getCurrency() + "(50% ceny biletu normalnego, dla dzieci do lat 10.)\n>> ");
    }

}
