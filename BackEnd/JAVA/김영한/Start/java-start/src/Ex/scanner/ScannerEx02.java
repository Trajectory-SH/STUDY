package Ex.scanner;

import java.util.Scanner;

public class ScannerEx01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요 : ");
        String name = scanner.nextLine();

        System.out.print("당신의 나이 입력하세요 : ");
        int age = scanner.nextInt();

        System.out.println("당신의 이름은 : " + name + ",당신의 나이는 : " + age);
    }
}
