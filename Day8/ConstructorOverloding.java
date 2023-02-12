class Hello {
    int number1 = 0, number2 = 0;
    float Number3 = 0.1f;

    Hello() {
        System.out.println("I am No Argument Constructor");
    }

    Hello(int n1, int n2) {
        number1 = n1;
        number2 = n2;
        System.out.println("I am With 2 int Argument");
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
    }

    Hello(int n1, float n2) {
        number1 = n1;
        Number3 = n2;
        System.out.println("I am With 2 int Argument");
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + Number3);
    }

    static {
        System.out.println("ami StTIC");
    }
}

public class ConstructorOverloding {
    public static void main(String[] args) {
        Hello foo = new Hello(3, 4.4f);

    }

}