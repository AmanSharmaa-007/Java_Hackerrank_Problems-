import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // System.out.print("Enter two numbers: ");

        int a = scanner.nextInt();

        int b = scanner.nextInt();

        if (a < 10 || a > 1000 || b < 10 || b > 1000) {

            System.out.println("Invalid Input");

            return;

        }

        boolean result = isBigger(a, b);

        System.out.println(result);

    }

    public static boolean isBigger(int a, int b) {

        return a > b;
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}