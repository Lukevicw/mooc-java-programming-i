
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        
        Account myAccount = new Account("My account", 0);
        Account matthewAccount = new Account("Matthews account", 1000.0);

        myAccount.deposit(100);
        matthewAccount.withdrawal(100);

        System.out.println(matthewAccount);
        System.out.println(myAccount);

        // Do not touch the code in Account.java
        // Write your program here
    }
        // Do not touch the code in Account.java
        // write your program here
}
