//@ Problem No 1. WAP that accepts two integer inputs . Swap the value of these variables without a third variable.

public class Prob01 {
    static void swapNumber(int num1, int num2) {
        num1 = num1 - num2;
        num2 = num1 + num2;
        num1 = num2 - num1;
        System.out.println("After swap two number: " + num1 + " ," + num2);
    }

    public static void main(String[] args) {

        int a = 10, b = 49;
        System.out.println("Before swap two number : " + a + "," + b);
        swapNumber(a, b);
    }
}