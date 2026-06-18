package Clazz;

public class TestClass {
    Data data;
    BigData bigData;
    int integer;
    String string;
    public static void main(String[] args) {

        int localInteger;
        Data data1;
        BigData bigData1;
        String string1 ;

        TestClass test = new TestClass();
        test.data = new Data();
        test.data.data = "helloWorld...";

        test.data.data = "Hellowold";

        System.out.println("test = " + test.data.data);
        System.out.println("test = " + test.integer);
        System.out.println("test.bigData = " + test.bigData);
//        System.out.println("string1 = " + string1);
//        System.out.println("bigData1 = " + bigData1);
//        System.out.println("data1 = " + data1);
//        System.out.println("localInteger = " + localInteger);
//

    }
}
