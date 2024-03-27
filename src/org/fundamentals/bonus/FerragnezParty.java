package org.fundamentals.bonus;

import java.util.Scanner;

public class FerragnezParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //creo l'array degli invitati
        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};


        //chiedo come si chiama l'utente
        System.out.print("What's your name?");
        String guestsName = scan.nextLine();
        System.out.println(guestsName);

        //verifico se il nome datomi dall'utente è presente nell'array
        boolean guestInvited = false;
        for (int i = 0; i < guests.length; i++) {
            //System.out.println(guests[i]);
            if (guests[i].equals(guestsName)) {
                guestInvited = true;
                break;
            }
        }

        //condizione se l'utente è invitato oppure no
        if (guestInvited) {
            System.out.println("Welcome to the party, " + guestsName + "!");
        } else {
            System.out.println("Sorry, you are not on the guest list.");
        }

        scan.close();
    }
}
