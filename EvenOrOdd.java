package Assignment_Day_05;

import java.util.Scanner;

//Java Program to Check Whether a Number is Even or Odd???

public class EvenOrOdd {
    public class EvenOdd {

        public static void main(String[] args) {

            Scanner reader = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = reader.nextInt();

            if (num % 2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
        }
    }
}
