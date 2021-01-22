package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter data");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a % 5 == 0 && a % 10 != 0 && b % 5 == 0 && (b & 10) != 0) {
            System.out.println(scanner);
        }
    }
}
