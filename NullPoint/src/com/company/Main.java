package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<Integer,Integer> keyvalue = new HashMap<Integer, Integer>();
        keyvalue.put(1,2);

        try {
            int t1 = keyvalue.get(2);
            System.out.println("tttt:" + t1);
        }
        catch(NullPointerException e){
            System.out.println("p1 is null point");
        }
        finally {
            System.out.println("finally");
        }
    }
}
