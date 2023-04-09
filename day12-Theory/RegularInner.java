class LogIn {
    private int id = 10;
    private String UserName = "SOuxxxw";
    private String password = "****";

    class valid {
        void details() {
            System.out.println(id);
            System.out.println(UserName);
            System.out.println(password);
        }
    }
}

public class RegularInner {
    public static void main(String[] args) {
        // LogIn obj = new LogIn();
        LogIn.valid obj1 = new LogIn().new valid();
        obj1.details();
    }
}