package Assignment_Day_05;

import java.util.Scanner;

//1. Flip Coin and print percentage of Heads and Tails
//        a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
//        b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
//                    heads
//        c. O/P -> Percentage of Head vs Tails

public class FlipCoin {
    public static void main(String[] args) {
        // INITIALIZATION
        int n, h_cnt = 0, t_cnt = 0;
        double heads, tails;
        Scanner u = new Scanner(System.in);

        // INPUT DATA
        System.out.print("enter no. of times you want to flip the coin: ");
        n = u.nextInt();

        // COMPUTATION
        for (int j = 0; j < n; j++) {
            double random = Math.random();
            if (random < 0.5)
                t_cnt++;
            else
                h_cnt++;
        }

        heads = h_cnt / (double) n * 100;
        tails = t_cnt / (double) n * 100;
        System.out.println("Percentage of heads: " + heads + "%");
        System.out.println("Percentage of tails: " + tails + "%");

    }
}
