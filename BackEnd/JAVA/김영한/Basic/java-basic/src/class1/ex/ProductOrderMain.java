package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        ProductOrder order1 = new ProductOrder();
        order1.productName = "밥";
        order1.price = 2000;
        order1.quantity = 3;
        orders[0] = order1;
        ProductOrder order2 = new ProductOrder();
        order2.productName = "빵";
        order2.price = 4000;
        order2.quantity = 1;
        orders[1] = order2;
        ProductOrder order3 = new ProductOrder();
        order3.productName = "면";
        order3.price = 1000;
        order3.quantity = 2;
        orders[2] = order3;

        printOrder(orders);

    }

    public static void printOrder(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + "가격 : " + order.price + "수량 : " + order.price);
            totalPrice += order.price * order.quantity;
        }

        System.out.println("총결제금액 : " + totalPrice);

    }
}
