package com.ivan.bauer.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Properties;

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


    public static Connection connDatabase() {
//        String url = "jdbc:postgresql://localhost/test";
//        Properties props = new Properties();
//        props.setProperty("user","user");
//        props.setProperty("password","password");
//        props.setProperty("ssl","false");
//        try {
//            Connection conn = DriverManager.getConnection(url, props);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        url = "jdbc:postgresql://mypostgres:5432/postgres";
        String url = "jdbc:postgresql://mypostgres/postgres?user=user&password=password";
        try {
            Connection conn = DriverManager.getConnection(url);
//            return conn;
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        return data;
        return null;
    }



}
