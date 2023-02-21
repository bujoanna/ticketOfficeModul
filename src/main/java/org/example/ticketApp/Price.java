package org.example.ticketApp;

enum Price {
    ;
    private static final int PRICE = 40;
    private static final int REDUCED_TICKET = Price.getPRICE() / 2;
    private static String priceToPay = "Cena do zapłaty: ";
    private static String currency = " zł.";
    private static String youChosen = "Wybrałeś bilet: ";
    private static String enterValue = "Wpisz ilość: ";
    private static String normal = "Bilet normalny ";
    private static String reduced = "Bilet ulgowy ";

    static String getNormal() {
        return normal;
    }

    static String getReduced() {
        return reduced;
    }

    static String getYouChosen() {
        return youChosen;
    }

    static String getEnterValue() {
        return enterValue;
    }

    static int getPRICE() {
        return PRICE;
    }

    public static int getREDUCED_TICKET() {
        return REDUCED_TICKET;
    }
    static String getPriceToPay() {
        return priceToPay;
    }

    static String getCurrency() {
        return currency;
    }
}
