package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first end second number");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        while (b != 0) {
            double c = a / b;
            System.out.println(c);
            break;
        }
    }
}
