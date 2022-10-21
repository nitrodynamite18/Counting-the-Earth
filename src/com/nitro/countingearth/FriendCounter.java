package com.nitro.countingearth;

import java.math.BigInteger;
import java.util.Scanner;

public class FriendCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What are you trying to count to? Enter a whole number: ");
        BigInteger countingTo = input.nextBigInteger();

        String countingToBinary = countingTo.toString(2);

        long numberOfBinaryDigits = countingToBinary.length();
        // Creates a variable of type long and assigns it the value of the length of the String countingToBinary divided by 5, rounded up to the nearest whole number because we are assuming that each hand has 5 fingers.
        long numberOfHands = (long) Math.ceil(numberOfBinaryDigits / 5.0);
        // Creates a variable of type long and assigns it the value of the variable numberOfHands divided by 2, rounded up to the nearest whole number because we are assuming that each person has 2 hands.
        long numberOfFriends = (long) Math.ceil(numberOfHands / 2.0);

        System.out.println("You need " + numberOfFriends + " friends counting on their hands, using " + numberOfBinaryDigits + " fingers on " + numberOfHands + " hands, to count to " + countingTo + " in binary.");
    }
}
