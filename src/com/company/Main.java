package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);

        System.out.print("I'm thinking of a number between 1 and 100. ");
        System.out.println("Can you guess it?");
        System.out.print("Type a number: ");
        int yourGuess = in.nextInt();

        if (number == 69) {
            System.out.println("69.. nice");
        }
        if (number == yourGuess) {
            System.out.println("Well Done, your guess is correct!");
        } else {
            if (number > yourGuess) {
                System.out.println("Your guess was too low. Care to try again?");
            }
            if (number < yourGuess) {
                System.out.println("Your guess was too high. Care to try again?");
            }

            if (yourGuess != 0) {
                System.out.print("Type your guess: ");
                int yourSecondGuess = in.nextInt();
                if (number == yourSecondGuess) {
                    System.out.println("Well Done, your guess is correct!");
                } else {
                    if (number > yourSecondGuess) {
                        System.out.println("Your guess was too low. Care to try again?");
                    }
                    if (number < yourSecondGuess) {
                        System.out.println("Your guess was too high. Care to try again?");
                    }
                    if (yourSecondGuess != 0) {
                        System.out.print("Type your guess: ");
                    }

                    if (yourSecondGuess != 0) {
                        System.out.print("Type your guess: ");
                        int yourThirdGuess = in.nextInt();
                        if (number == yourThirdGuess) {
                            System.out.println("Well Done, your guess is correct!");
                        } else {
                            if (number > yourThirdGuess) {
                                System.out.println("Your guess was too low. Care to try again?");
                            }
                            if (number < yourThirdGuess) {
                                System.out.println("Your guess was too high. Care to try again?");
                            }
                            if (yourThirdGuess != 0) {
                                System.out.print("Damn, you're out of tries :(");
                            }


                        }
                    }
                }
            }
        }
    }
}
