package com.ironyard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Please enter five words please make sure they do not match: ");

	    Scanner scanner = new Scanner(System.in);

        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();
        String wordFour = scanner.next();
        String wordFive = scanner.next();

        System.out.println("Here is what you've chosen:");
        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);
        System.out.println(wordFour);
        System.out.println(wordFive);


        boolean areEqualOne = wordOne.equals(wordTwo) || wordOne.equals(wordThree) || wordOne.equals(wordFour) || wordOne.equals(wordFive);
        boolean areEqualTwo = wordTwo.equals(wordOne) || wordTwo.equals(wordThree) || wordTwo.equals(wordFour) || wordTwo.equals(wordFive);
        boolean areEqualThree = wordThree.equals(wordOne) || wordThree.equals(wordTwo) || wordThree.equals(wordFour) || wordThree.equals(wordFive);
        boolean areEqualFour = wordFour.equals(wordOne) || wordFour.equals(wordTwo) || wordFour.equals(wordThree) || wordFour.equals(wordFive);
        boolean areEqualFive = wordFive.equals(wordOne) || wordFive.equals(wordTwo) || wordFive.equals(wordThree) || wordFive.equals(wordFour);

        if(areEqualOne || areEqualTwo || areEqualThree || areEqualFour || areEqualFive){
            System.out.print("Did your words match?\n True");


        }
        else {
            System.out.print("Did your words match?\n False");
        }
    }
}
