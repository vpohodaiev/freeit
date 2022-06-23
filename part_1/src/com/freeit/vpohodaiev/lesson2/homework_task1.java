package com.freeit.vpohodaiev.lesson2;

import java.util.Scanner;

public class homework_task1 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill in x number and click on Enter");
        int x;
        x = sc.nextInt();
        System.out.println("Fill in y number and click on Enter");
        int y ;
        y = sc.nextInt();
        if (x<y)
        {
            System.out.println("x less than y");
        }
        else if (x>y)
        {
            System.out.println("x more than y");
        }
        else
        {
            System.out.println("x equals y");
        }
    }
}