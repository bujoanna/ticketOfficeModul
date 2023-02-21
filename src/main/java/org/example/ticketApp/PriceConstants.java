package org.example.ticketApp;

interface PriceConstants {

    int PRICE = 40;
    int REDUCED_TICKET = PriceConstants.getPRICE() / 2;
    String PRICE_TO_PAY = "Cena do zapłaty: ";
    String CURRENCY = " zł.";
    String YOU_CHOSEN = "Wybrałeś bilet: ";
    String ENTER_VALUE = "Wpisz ilość: ";
    String NORMAL_TICKET = "Bilet normalny ";
    String REDUCED = "Bilet ulgowy ";

    static String getNormalTicket() {
        return NORMAL_TICKET;
    }

    static String getReduced() {
        return REDUCED;
    }

    static String getYouChosen() {
        return YOU_CHOSEN;
    }

    static String getEnterValue() {
        return ENTER_VALUE;
    }

    static int getPRICE() {
        return PRICE;
    }

    static int getREDUCED_TICKET() {
        return REDUCED_TICKET;
    }

    static String getPriceToPay() {
        return PRICE_TO_PAY;
    }

    static String getCurrency() {
        return CURRENCY;
    }
}
