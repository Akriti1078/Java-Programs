package PracticePrograms;

import java.util.Scanner;

public class Expression {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println("enter v");
            int v = sc.nextInt();
            System.out.println("enter u");
            int u = sc.nextInt();
            System.out.println("enter a ");
            int a = sc.nextByte();
            System.out.println("enter s ");
            int s = sc.nextInt();
            double p1= v * v;
            double p2 = u*u ;
            double p3 = 2 * a * s;

            double s1= p1- p2;
            double expression = s1 / p3;

            System.out.println(expression);
        }

    public static class multiplicationtable {

            // static void method to print multiplication table
            static void printTable(int n) {
                System.out.println("\nMultiplication Table of " + n);
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " x " + i + " = " + (n * i));
                }
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // Asking user for input
                System.out.print("Enter a number to print its multiplication table: ");
                int num = sc.nextInt();

                // Calling static method
                printTable(num);

                sc.close();
            }
        }
}


