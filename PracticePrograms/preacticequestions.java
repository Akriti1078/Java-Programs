package PracticePrograms;

public class preacticequestions {

    // Recursive function to calculate sum of first n natural numbers
    static int sum(int n) {
        if (n == 0) {   // Base case
            return 0;
        }
        return n + sum(n - 1);   // Recursive call
    }

    public static void main(String[] args) {
        int n = 5; // you can change the value of n here
        int result = sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}