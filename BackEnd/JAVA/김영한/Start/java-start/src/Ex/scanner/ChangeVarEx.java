package Ex.scanner;

import java.util.Scanner;

public class ScannerEx04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int dan = scanner.nextInt();

        System.out.println(dan + "의 구구단: ");
        for (int i = 1; i < 10; i++) {
            int result = dan * i;
            System.out.println(dan + "X" + i + " = " + result);
        }

    }
}
