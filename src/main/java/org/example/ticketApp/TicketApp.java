package org.example.ticketApp;

import java.io.IOException;
import java.util.Scanner;

import static org.example.ticketApp.Menus.menu;

public class TicketApp extends Information implements TicketMachine, TicketService, TODOPay {
    static Scanner scanner = new Scanner(System.in);
    private int choose = menu();


    public void choose() {
        while (choose != 0) {
            switch (choose) {
                case 1:
                    printInformation();
                    break;
                case 2:
                    printInformation();
                    System.out.println("Wybierz rodzaj biletu:");
                    chooseATicketMenu();
                    break;
                case 3:
                    exitProgram();
                default:
                    throw new IllegalStateException("Unexpected value: " + choose);
            }
            System.out.println("\nWciśnij Enter, aby kontynuować...");
            try {
                System.in.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            choose = menu();
        }
        System.out.println("     ****************************************");
        System.out.println("\n     *  Koniec programu\n\n");
        exitProgram();
    }

    @Override
    public void normalTicket() {
        System.out.println(Price.getYouChosen() + TicketType.NORMAL + "\n" + Price.getEnterValue());
        numberOfTicketNormal();
        chooseMore();

    }

    @Override
    public void reducedTicket() {
        System.out.println(Price.getYouChosen() + TicketType.REDUCED + "\n" + Price.getEnterValue());
        numberOfTicketReduced();
        chooseMore();
    }

    @Override
    public void chooseATicketMenu() {
        int optionNumber;
        optionNumber = scanner.nextInt();
        switch (optionNumber) {
            case 1 -> normalTicket();
            case 2 -> reducedTicket();
            default -> System.out.println("Nie ma takiej możliwości.");
        }

    }

    private int numberNormal;

    int getNumberNormal() {
        numberNormal = scanner.nextInt();
        return numberNormal;
    }

    public void numberOfTicketNormal() {
        System.out.println("Wybrałeś: " + getNumberNormal() + " sztuki/ę ");
    }

    private int numberReduced;

    int getNumberReduced() {
        numberReduced = scanner.nextInt();
        return numberReduced;
    }

    public void numberOfTicketReduced() {
        System.out.println("Wybrałeś: " + getNumberReduced() + " sztuki/ę ");
    }

    @Override
    public void chooseMore() {
        System.out.println(">> Jeśli chcesz wybrać więcej biletów wpisz: (1) >> \n" + ">> Jeśli chcesz zsumować wybrane bilety:     (2) >> \n" + ">> Jeśli chcesz przejść do zapłaty wciśnij:  (3) >> ");
        int optionNumber;
        optionNumber = scanner.nextInt();
        if (optionNumber == 1) {
            printInformation();
            chooseATicketMenu();
        } else if (optionNumber == 2) {
            System.out.println(Price.getNormal() + numberNormal);
            System.out.println(Price.getReduced() + numberReduced);
            System.out.println("Suma wybranych biletów: " + (numberReduced + numberNormal));
            System.out.println(Price.getPriceToPay() + (numberNormal * Price.getPRICE() + numberReduced * Price.getREDUCED_TICKET()) + Price.getCurrency());
        } else {
            TODOpay();
        }
    }

    @Override
    public void TODOpay() {
        System.out.println("TODO: Płacę.");
    }

    public void exitProgram() {
        System.exit(0);
    }
}


