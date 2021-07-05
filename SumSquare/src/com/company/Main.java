package com.company;

import java.util.Scanner;

public class Main {
    public static boolean getSumSquare(int target){
        int max = (int)Math.sqrt(target);
        int min = 1;
        while(min < max){
            int sum = min*min + max*max;
            if(sum == target){
                System.out.printf("%d*%d+%d*%d=%d\n",min,min,max,max,target);
                return true;
            }
            else if(sum < target){
                min++;
            }
            else{
                max--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("get the number square");
        System.out.println("input number");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        if(getSumSquare(target)){
            System.out.println("sucess");
        }
        else{
            System.out.println("fail");
        }
    }
}
