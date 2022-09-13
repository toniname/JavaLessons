package other;

import java.util.Scanner;

public class Bitcoin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is Bitcoin price today?" );

        double priceBitcoin = sc.nextInt();

        System.out.println("How much $ do you have?");

        double dollars = sc.nextInt();

        double result = dollars/priceBitcoin;

        System.out.println("You can buy:" + result );
    }


}
