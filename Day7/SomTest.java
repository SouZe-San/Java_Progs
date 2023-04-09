class Parent {
    int a = 10;
}

class Child extends Parent {
    int a = 20;

}

/**
 * SomTest
 */
public class SomTest {

    public static void main(String[] args) {
        Parent p1 = new Parent();
        System.out.println(p1.a);
    }
}