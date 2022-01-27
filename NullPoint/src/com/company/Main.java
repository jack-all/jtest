package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String p1 = null;
        System.out.println("test1111");
        try{
            System.out.println("tttt:%s"+p1);
        }
        catch (NullPointerException e){
            System.out.println("p1 is null point");
        }
    }
}
