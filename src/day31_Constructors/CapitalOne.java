package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet Ozkok",123456789);

        System.out.println(account1);

        account1.deposit(2503);
        account1.checkBalance();

        account1.withdraw(945);
        account1.checkBalance();

        account1.deposit(324);
        account1.checkBalance();

        System.out.println("--------------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Ayse", 987456123);

        account2.deposit(3280);
        account2.checkBalance();

        account2.withdraw(25);
        account2.checkBalance();

    }
}
