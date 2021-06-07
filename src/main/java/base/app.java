package base;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        int nums[]=new int[3];

        System.out.print("Enter the first number: ");
        nums[0] = newScan.nextInt();

        System.out.print("Enter the second number: ");
        nums[1] = newScan.nextInt();

        System.out.print("Enter the third number: ");
        nums[2] = newScan.nextInt();

        int big=0;
        for(int i = 0; i < 3; i++){
            if(nums[i] > big)
                big = nums[i];
        }

        System.out.print("The largest number is "+big+".");
    }

}
