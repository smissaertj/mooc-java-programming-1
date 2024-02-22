
public class YourFirstAccount {

    public static void main(String[] args) {
        // Write your program here
        Account myAccount = new Account("Joeri", 100.0);
        myAccount.deposit(20);
        System.out.println(myAccount);
    }
}
