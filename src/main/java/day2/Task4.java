package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter data");
        double x = scanner.nextDouble();
        double y;

        if (x >= 5) {
            y = (x * 2 - 10) / (x + 7);
            System.out.println(y);
        } else if (-3 < x && x < 5) {
            y = (x + 3) * (x * 2 - 2);
            System.out.println(y);
        } else {
            System.out.println(420);
        }


    }
}
