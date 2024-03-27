package org.fundamentals.train;

import java.util.Scanner;

public class TicketTrain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //chiedere quanti chilometri vuole fare il passeggero
        System.out.print("Kilometers number: ");
        int kilometers = scan.nextInt();

        //chiedere l'età del passeggero
        System.out.print("Age: ");
        int age = scan.nextInt();

        //costo dei chilometri percorsi
        double kilometersPrice = 0.21;
        double price = kilometers * kilometersPrice;


        //condizione sconto in base all'età
        if (age <= 18) {
            double discount = (price * 20) / 100;
            double finalPrice = price - discount;
            System.out.println("Final Price: " + finalPrice + "€");
        } else if (age >= 65) {
            double discount = (price * 40) / 100;
            double finalPrice = price - discount;
            System.out.println("Final Price: " + finalPrice + "€");
        } else {
            System.out.println("Final Price: " + price);
        }
        scan.close();
    }
}
