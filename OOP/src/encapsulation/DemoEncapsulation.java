package encapsulation;

public class DemoEncapsulation {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAcc_no(123213123);
        acc.setName("Praveen");
        acc.setEmail("test@gmail.com");
        acc.setAmount(123123);

        System.out.println(acc);
    }
}
