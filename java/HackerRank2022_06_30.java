/**                 Hacker Rank Prob 2022 06 30
 *
 */

/**
 *                  Hacker Rank Prob 01 : 2022 06 30
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N % 2 != 0){
            System.out.println("Weird");
        } else if (N % 2 == 0 && N > 1 && N < 6) {
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && N > 5 && N < 21) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && N > 20){
            System.out.println("Not Weird");
        }

            scanner.close();
    }
}
 */

/**
 *                  Hacker Rank Prob 02 : 2022 06 30

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String x = scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
 */

/**
 *                  Hacker Rank Prob 03 : 2022 06 30
 *
 *                  https://www.baeldung.com/java-printstream-printf

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for(int i=0; i<3; i++){
            String s1 = sc.next();
            System.out.printf("%-15s", s1);

            int x = sc.nextInt();
            System.out.printf("%03d %n", x);

        }
        System.out.println("================================");

    }

}
 */

