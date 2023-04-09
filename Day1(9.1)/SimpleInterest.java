//! Problem No-3 : 
// @WAP to calculate the simple interest at the end of 3 years assuming a man deposits 2000 INR in bank account at an interest rate of 6% per annum for 3 years, calculate the simple interest  at the end of 3 years.

public class SimpleInterest {
    static double interestCalculate(int money, float interest, int time) {
        double si = (money * interest * time) / 100;
        return si;
    }

    public static void main(String[] args) {
        System.out.print("The Simple interest is : ");
        System.out.println(interestCalculate(2000, 6, 3));
    }
}
