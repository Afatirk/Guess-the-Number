package com.abdul_fatir;
import javax.swing.plaf.synth.SynthOptionPaneUI;
 import java.util.Scanner;
import java.util.SortedSet;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber = 0;

        do {
            System.out.print("Enter your Guess (1-100) : ");
            userNumber = sc.nextInt();

            if (myNumber == userNumber) {
                System.out.println("YOOO....You have guessed the number!!!!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("You have guessed a large number");
            } else {
                System.out.println("You have guesses a small number");
            }
        } while (userNumber >= 0);
        System.out.print("My Number was: ");
        System.out.println(myNumber);
    }
}


