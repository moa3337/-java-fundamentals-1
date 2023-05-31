package org.learnig.java;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // verifico se il numero è multiplo di 3 o di 5
            if (i % 3 == 0 && i % 5 == 0) {
                // stampo FizzBuzz se il numero è sia multiplo di 3 e di 5
                System.out.println("FizzBuzz");
            }
            // stampo Fizz se il numero è multiplo di 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // stampo Buzz se il numero è multiplo di 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // stampo un numero intero se non è multiplo di 3 o 5
            else {
                System.out.println(i);
            }
        }
    }
}
