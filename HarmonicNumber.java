package Assignment_Day_05;

import java.util.Scanner;

//Harmonic Number
//a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
//b. I/P -> The Harmonic Value N. Ensure N != 0
//c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
//d. O/P -> Print the Nth Harmonic Value.

public class HarmonicNumber {
    public static void main(String[] args) {

        // INITIALIZATION
        double result = 0, num = 0, j;
        int n;
        Scanner u = new Scanner(System.in);

        // INPUT DATA
        System.out.print("enter the harmonic you want to find: ");
        n = u.nextInt();

        // COMPUTATION
        for (j = 1; j <= n; j++) {
            num = num + (1 / j);
            result = num;
        }
        System.out.println("the value of harmonic no. " + n + " is: " + result);

    }

}


