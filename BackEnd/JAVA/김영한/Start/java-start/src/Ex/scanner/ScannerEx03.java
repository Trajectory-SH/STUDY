package Ex.scanner;

import java.util.Scanner;

public class ScannerEx02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 하나를 입력해보렴 : ");
        int num = scanner.nextInt();
        int flag = num % 2;


        System.out.println("flag = " + flag);
        System.out.println("num = " + num);
        switch (flag) {
            case 0:
                System.out.println("짝수입니다.");
                break;
            case 1:
                System.out.println("홀수입니다.");
                break;
        }

    }
}
