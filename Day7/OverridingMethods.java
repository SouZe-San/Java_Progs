package Day7;

// class hello {

// }

class Animal {
    int eyes = 2;
    int lag = 2;
    int ear = 2;
    int noes = 1;

    void details() {
        System.out.println("I am From Animal Class");
        System.out.println("I have " + this.noes + " noes");
        System.out.println("I have " + this.lag + " lages");
        System.out.println("I have " + this.ear + " ears");
        System.out.println("I have " + this.eyes + " eyes");
    }

    void move() {
        System.out.println("I move Forward and Backward");
    }
}

class Dog extends Animal {

    void myColor(String color) {
        super.details();
        System.out.println("I Am from Dog Class");
        System.out.println("My color is :" + color);
    }

    void move() {
        System.out.println("I Move Forward, Left, right And Backward Also>>>>");
    }
}

public class OverridingMethods {
    public static void main(String[] args) {
        Dog puppy = new Dog();
        puppy.move();
        // puppy.details(); //? Method of Parent class which use by child class
        puppy.myColor("white");
        // hello foo = new hello();

    }
}
