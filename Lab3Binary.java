package com.gradescope.lab03;

import java.util.ArrayList;

public class Lab3Binary {
	
    public static void binary(int N, String current, ArrayList<String> allSolutions) {
        // Base case: when the length of the current string equals N
        if (current.length() == N) {
            allSolutions.add(current);  // Add the binary string to the list
            return;
        }

        // Recursive case: append '0' and '1'
        binary(N, current + "0", allSolutions);
        binary(N, current + "1", allSolutions);
    }

    public static void main(String[] args) {
        ArrayList<String> allSolutions = new ArrayList<String>();
        binary(5, "", allSolutions);
        System.out.println(allSolutions);
    }
}

