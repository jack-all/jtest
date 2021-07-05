package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    private final static HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','O','U'));

    private static String revVowels(String str){
        int min = 0;
        int max = str.length() - 1;
        char minc = str.charAt(min);
        char maxc = str.charAt(max);
        char[] result = new char[str.length()];
        while(min <= max){
            if(!vowels.contains(minc)){
                result[min++] = minc;
                minc = str.charAt(min);
            }
            else if(!vowels.contains(maxc)){
                result[max--] = maxc;
                maxc = str.charAt(max);
            }
            else{
                result[min++] = maxc;
                result[max--] = minc;
                minc = str.charAt(min);
                maxc = str.charAt(max);
            }
        }

        return new String(result);
    }

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("input String:");
        String str1 = in.nextLine();
        System.out.println("init:"+str1);
        System.out.println("end:"+ revVowels(str1));
    }
}
