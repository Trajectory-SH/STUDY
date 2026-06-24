package class1.ex.ref;

import java.util.Scanner;

public class ProductOrderMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요");
        int orderQuan = s.nextInt();

        printOrder(orderQuan);
    }

    public static void printOrder(int orderQuantity) {
        int totalPrice = 0;
        totalPrice = makeOrders(orderQuantity);
        System.out.println("total price = " + totalPrice);
    }

    private static int makeOrders(int orderQuantity) {
        Scanner s = new Scanner(System.in);
        int totalPrice = 0;
        Order[] orders = new Order[orderQuantity];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보 입력");

            System.out.print("상품 이름 : ");
            String productName = s.nextLine();

            System.out.print("가격 : ");
            int price = s.nextInt();
            s.nextLine();

            System.out.print("수량 : ");
            int quantity = s.nextInt();
            s.nextLine();

            totalPrice += price * quantity;

            orders[i] = createOrder(productName, price, quantity);
        }

        for (Order order : orders) {
            System.out.println("상품명 = " + order.name + "가격 = " + order.price + "수량  = " + order.quantity);
        }

        return totalPrice;
    }

    public static Order createOrder(String productName, int price, int quantity) {
        Order order = new Order();
        order.name = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
}
