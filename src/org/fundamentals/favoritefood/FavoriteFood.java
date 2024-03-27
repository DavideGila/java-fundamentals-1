package org.fundamentals.favoritefood;

public class FavoriteFood {
    public static void main(String[] args) {
        //array di cibo preferito
        String[] food = {"Pizza", "Pasta", "Sushi", "Pasta al Pesto", "Hamburger", "Risotto alla Milanese"};

        //lunghezza dell'array
        System.out.println("My favorite foods are: " + food.length);

        //primo cibo preferito
        System.out.println("My favorite food is: " + food[0]);

        //ultimo cibo preferito
        int lastFavoriteFood = food.length - 1;
        System.out.println("My least favorite food is: " + food[lastFavoriteFood]);

        //cibo preferito a metà dell'array
        int middleFavoriteFood = food.length / 2;
        System.out.println("My middle favorite food is: " + food[middleFavoriteFood]);
    }
}
