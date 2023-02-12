import java.util.Scanner;

class Problems {
    // *1. Accept a user input and prove that the number is prime. --->
    boolean primeCheck(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i < num; i++) // Check is their any number that can divide it..
            if (num % i == 0)
                return false;
        return true;
    }

    // *Exercises 2: Generate prime numbers between 50 and 1150. ------=>
    void primePrint() {
        for (int i = 50; i < 1150; i++) {
            if (!primeCheck(i)) {
                continue;
            }
            System.out.println(i);
        }
    }
}

public class PrimeNumber {

    public static void main(String[] args) {
        Problems prime = new Problems();
        Scanner sc = new Scanner(System.in);
        // PROBLEM 01: ===>
        System.out.print("Enter the number that want to check it prime or not >>>: ");
        int number = sc.nextInt();
        sc.close();
        System.out.println("Is " + number + ", prime : " + prime.primeCheck(number));

        // PROBLEM 02 : ---->
        System.out.println("\n Prime Number between 50 to 1150 \n");
        // prime.primePrint();
    }
}
