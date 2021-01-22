package day3;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter city");
        String city = scanner.nextLine();
        switch (city) {
            case "Москва":
            case "Владивосток":
            case "Ростов":
                System.out.println("Россия");
                break;
            case "Рим":
            case "Милан":
            case "Турин":
                System.out.println("Италия");
                break;
            case "Берлин":
            case "Мюнхен":
            case "Кёльн":
                System.out.println("Германия");
                break;
            default:
                System.out.println("Не известная страна");
            case "Stop":
                System.out.println("Программа завершила работу");

        }

    }
}
