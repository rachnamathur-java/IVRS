package practice;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number n ");
        int n = scanner.nextInt();
        int x = 1;
        for (;x<n+1 ; x++) {
            if(x%5==0) {
                System.out.println("Pragra");
                continue;

            }
            System.out.println(x);

        }


    }
}
