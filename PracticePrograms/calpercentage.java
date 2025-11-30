package com.company;

import java.util.Scanner;

public class calpercentage {
    public static void main(String[] args) {
        System.out.println("percentage of 5 sub");
        Scanner sc = new Scanner (System.in);
        System.out.println("enter sub 1");
        int a = sc.nextInt();
        System.out.println("enter sub 2");
        int b = sc.nextInt();
        System.out.println("enter sub 3");
        int c = sc.nextByte();
        System.out.println("enter sub 4");
        int d = sc.nextInt();
        System.out.println("enter sub 5");
        int e = sc.nextInt();
        int sum = ( a + b + c + d + e);
        System.out.println("maximum marks");
        float max = sc.nextInt();
        float div = ( sum / max);
        float percentage = (div * 100);
        System.out.println("percentage scored");
        System.out.println(percentage);
    }
}
