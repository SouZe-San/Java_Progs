
class TestLogic {

    int result = 0; // Instance variable

    void test() {
        int firstInput = 10;
        int secondInput = 20;
        int result;
        result = firstInput + secondInput;
        this.result = result; // Store the result of the method in the Instance variable
    }

    void testPrint() {
        System.out.println("The Result is: " + result);
    }

    void primePrint() {
        for (int i = 1; i < 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    // * exercise 2: Don’t print the numbers that are multiples of 10 between the
    // range of 1 to 100-------==>
    void printWithOut10related() {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                continue;
            }
            System.out.println(i);
            // if (i %10 != 0) {
            // System.out.println(i);
            // }
        }
    }
}

public class TestStart {
    public static void main(String[] args) {
        System.out.println("Welcome World!");
        TestLogic testLogic = new TestLogic();
        // testLogic.test();
        // testLogic.testPrint();
        // testLogic.oddPrint();
        testLogic.printWithOut10related();
    }
}