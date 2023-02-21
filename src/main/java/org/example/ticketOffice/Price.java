package org.example.ticketOffice;

enum Price {
    ;
    private static final int PRICE = 40;
    private static final int reducedTicket = Price.getPRICE() / 2;
    private static String priceToPay = "Cena do zapłaty: ";
    private static String currency = " zł.";
    private static String youChosen = "Wybrałeś bilet: ";
    private static String enterValue = "Wpisz ilość: ";

    static String getYouChosen() {
        return youChosen;
    }

    static String getEnterValue() {
        return enterValue;
    }

    static int getPRICE() {
        return PRICE;
    }

    public static int getReducedTicket() {
        return reducedTicket;
    }

    static String getPriceToPay() {
        return priceToPay;
    }

    static String getCurrency() {
        return currency;
    }
}
