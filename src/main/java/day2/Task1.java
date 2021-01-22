package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter data");
        int val = s.nextInt();
        if ( val > 0 && val <= 4) {
            System.out.println("Малоэтажный дом");
        }
        if (val >= 5 && val <= 8) {
            System.out.println("Среднеэтажный дом");
        }
        if (val >= 9) {
            System.out.println("Многоэтажный дом");
        }
        if (val <= 0) {
            System.out.println("Ошибка ввода");
        }

    }
}
