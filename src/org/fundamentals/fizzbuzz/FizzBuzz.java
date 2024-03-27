package org.fundamentals.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        //creo l'array
        int[] numbers = new int[100];

        //applico ciclo for e inserisco i numeri da 1 a 100 nell'array
        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
            //System.out.println(numbers[i]);

            //applico condizione per stampare Fizz per tutti i numeri multipli di 3, Buzz per i multipli di 5 e FizzBuzz per i multipli sia di 3 che di 5
            if (numbers[i] % 3 == 0 && numbers[i] % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (numbers[i] % 3 == 0) {
                System.out.println("Fizz");
            } else if (numbers[i] % 5 == 0) {
                System.out.println("Buzz");
            }
        }


    }
}
