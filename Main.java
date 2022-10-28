package edu.hohlov.kaprekar;

public class Main {


    public static void main(String[] args) {
        Algorithm algorithm;
		
		System.out.println("Hello user!")
        System.out.println("\nЗадание 8: Вывести числа Капрекара в указанном диапазоне. \n");
		

        do {
            algorithm = new Algorithm();
            algorithm.calcKaprekar();
            Speaker.result(algorithm.getKaprekarNumber());
        } while (algorithm.maybeContinue());
    }
}
