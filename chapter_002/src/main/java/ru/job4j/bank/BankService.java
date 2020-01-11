package ru.job4j.bank;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        if (users.containsKey(user)) {
            System.out.println("Such a client exists");
        } else {
            users.put(user, accounts);
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> accounts = users.get(user);
        int index = accounts.indexOf(account);
        if (index >= 0) {
            System.out.println("Such an account exists");

        } else {
            accounts.add(account);
        }
    }

    public User findByPassport(String passport) {
          User rsl = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
                break;
            } else {
                System.out.println("There is no such client");
            }
        }
        return rsl;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        List<Account> accounts = users.get(user);
        Account rsl = null;
        for (Account account : accounts) {
            String req = account.getRequisite();
            if (req.equals(requisite)) {
                rsl = account;
                break;
            }
        }
        return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        return rsl;
    }



    public static void main(String[] args) {

        BankService bank = new BankService();
        Map<User, List<Account>> map1 = new HashMap<>();
        User user = new User("3434", "Petr Arsentev");
        List<Account> accounts = new ArrayList<>();
        bank.addUser(user);
        System.out.println(bank.findByPassport("3434"));
        Account account1 = new Account("1223", 1000);
        Account account2 = new Account("2345", 2000);
        accounts.add(account1);
        accounts.add(account2);
        System.out.println(accounts.size());
        map1.put(user, accounts);
        System.out.println("00user " + bank.findByPassport("3434")); //00user User{passport='3434', username='Petr Arsentev'}
        boolean value = false;
        List<Account> list = map1.get(user);
        for (Account account : list) {
            System.out.println(account);
            System.out.println(account.getRequisite());
            value = account.getRequisite().equals("2345");
        }
        System.out.println(value); //true
        System.out.println(bank.findByRequisite("3434", "2345")); //null
    }
}