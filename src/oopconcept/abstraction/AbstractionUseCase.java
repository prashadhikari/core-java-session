package oopconcept.abstraction;

public class AbstractionUseCase {

    public static void main(String[] args) {

        Account accountA = new Account();
        accountA.setAccountName("A");
        accountA.setAccountNumber("32515867");
        accountA.setSocialSecurityNumber("123456789");
        accountA.setBalance(5000);

        Account accountB = new Account();
        accountA.setAccountName("B");
        accountA.setAccountNumber("32515867");
        accountA.setSocialSecurityNumber("123456789");
        accountA.setBalance(1000);

//        BankUtils bankUtils = new BankUtils();
        BankUtils.transferBalance(accountA, accountB, 500);
        BankUtils.transferBalance(accountA, accountB, 500);
        BankUtils.transferBalance(accountA, accountB, 1000);


    }
}
