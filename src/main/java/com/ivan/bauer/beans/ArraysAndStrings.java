package com.ivan.bauer.beans;

import java.util.Arrays;

public class ArraysAndStrings {

    //Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
    //cannot use additional data structures?
    //Has complexity O(N^2)
    public static Boolean allUniqueString(String str) {
        for(int i = 0; i < str.length(); i++) {
            char iChar = str.charAt(i);
            for(int j = i; j < str.length(); j++) {
                char jChar = str.charAt(j);
                if(iChar == jChar && i != j) {
                    return false;
                }
            }
        }
        return true;
    }

    //Check Permutation: Given two strings, write a method to decide if one is a permutation of the
    //other.
    //
    public static Boolean isPermutation(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        char firstArray[] = first.toCharArray();
        char secondArray[] = second.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        first = new String(firstArray);
        second = new String(secondArray);
        if (first.equals(second)) {
            return true;
        }
        return false;
    }

}
