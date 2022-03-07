package Beginner.bank;

import java.util.HashMap;

public class BankSimple {
    public class Account {

        private final String id;
        private final String name;
        private int money;

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getMoney() {
            return money;
        }

        public Account(String id, String name, int money) {
            this.id = id;
            this.name = name;
            this.money = money;
        }

        public void open() {
            accounts.put(id, this);
        }

        public void close() {
            accounts.remove(id);
        }


    }

    private HashMap<String, BankSimple.Account> accounts = new HashMap<>();


//    public void openAccount(String id, String name) {
//        Account account = new Account();
//        account.id = id;
//        account.name = name;
//        accounts.put(id, account);
//    }

    public void putMoney(String id, int amount) {
        BankSimple.Account account = accounts.get(id);
        if (account == null) {
            return;
        }
        account.money += amount;
    }

    public void getMoney(String id, int amount) {
        BankSimple.Account account = accounts.get(id);
        if (account == null) {
            return;
        }
        account.money -= amount;
    }


    public void printInfo() {
        accounts.forEach((s, account) -> System.out.println(account.getId() + " " + account.getName() + " " + account.getMoney()));


    }

    public static class Banker {


        public BankSimple createBank() {
            return new BankSimple();
        }
    }

    private BankSimple() {

    }

}


class Main2 {
    public static void main(String[] args) {


        BankSimple.Banker banker = new BankSimple.Banker();
        BankSimple bank = banker.createBank();
        BankSimple.Account account = bank.new Account("1", "Arsen", 1000);
        BankSimple.Account account2 = bank.new Account("2", "Ani", 1000);

        account.open();
        account2.open();

        bank.printInfo();
    }
}
