package com.gradescope.lab03;

import java.util.ArrayList;

public class Lab3Dice {

    public static void roll(int N, String current, ArrayList<String> allSolutions) {
        // Base case: when the length of the current string equals N (each die rolled)
        if (current.length() == N) {
        	// Add the roll combination to the list
            allSolutions.add(current);  
            return;
        }

        // Recursive case: append each die value from '1' to '6'
        for (int i = 1; i <= 6; i++) {
            roll(N, current + i, allSolutions);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> allSolutions = new ArrayList<String>();
        String solution = "";
        roll(2, solution, allSolutions);
        System.out.println(allSolutions);
    }

}
