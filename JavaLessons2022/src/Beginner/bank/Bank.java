package Beginner.bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Bank {


    public class Account {

        private final String id;
        private final String name;
        private final int money;
        private final ArrayList<AccountOperation> operations = new ArrayList<>();


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

    private final HashMap<String, Account> accounts = new HashMap<>();


    public void putMoney(String id, int amount) {
        Account account = accounts.get(id);
        if (account == null) {
            return;
        }

        AccountOperation operation = new AccountOperation() {
            @Override
            public Date getDate() {
                return new Date();
            }

            @Override
            public int amount() {
                return amount;
            }
        };
        account.operations.add(operation);
    }

    public void getMoney(String id, int amount) {
        Account account = accounts.get(id);
        if (account == null) {
            return;
        }

        AccountOperation operation = new AccountOperation() {
            @Override
            public Date getDate() {
                return new Date();
            }

            @Override
            public int amount() {
                return -amount;
            }
        };
        account.operations.add(operation);
    }


    public void printInfo() {
        accounts.forEach((s, account) -> System.out.println(account.getId() + " " + account.getName() + " " + account.getMoney()));


    }

    public static class Banker {


        public Bank createBank() {
            return new Bank();
        }
    }

    private Bank() {

    }

}


class Main {
    public static void main(String[] args) {


        Bank.Banker banker = new Bank.Banker();
        Bank bank = banker.createBank();
        Bank.Account account = bank.new Account("1", "Arsen", 1000);
        Bank.Account account2 = bank.new Account("2", "Ani", 1000);

        account.open();
        bank.putMoney("1", 2000);
        bank.printInfo();
        account2.open();


        bank.printInfo();
    }
}
