import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        char c =  scan.next().charAt(0);
        if (c == '+')
        {
            System.out.println(a+b);
        }
        else if (c == '-')
        {
            System.out.println(a-b);
        }
        else if (c == '*')
        {
            System.out.println(a*b);
        }
        else if (c == '/')
        {
            System.out.println(a/b);
        }
        else
        {
            return;
        }
    }
}