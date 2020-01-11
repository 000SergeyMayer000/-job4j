package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.job4j.bank.BankService;

public class Test {
    public static void main(String[] args) {

        BankService bank = new BankService();
        Map<User, List<Account>> map1 = new HashMap<>();
        User user1 = new User("3434", "Petr Arsentev");
        User user2 = new User("1212", "Sergey Mayer");
        User user3 = new User("1232", "Viktor Mayer");

        List<Account> accounts1 = new ArrayList<>();
        List<Account> accounts2 = new ArrayList<>();
        List<Account> accounts3 = new ArrayList<>();

        bank.addUser(user1);
        bank.addUser(user2);
        bank.addUser(user3);

        Account account11 = new Account("1223", 1011);
        Account account12 = new Account("2345", 2012);
        Account account21 = new Account("3221", 1021);
        Account account22 = new Account("5432", 2022);
        Account account31 = new Account("9874", 1031);
        Account account32 = new Account("4789", 2032);

        accounts1.add(account11);
        accounts1.add(account12);
        accounts2.add(account21);
        accounts2.add(account22);
        accounts3.add(account31);
        accounts3.add(account32);

        map1.put(user1, accounts1);
        map1.put(user2, accounts2);
        map1.put(user3, accounts3);

        List<Account> accounts = map1.get(user1);
        for (Account account : accounts) {
            System.out.println(user1 + " -> " +account);
        }

        System.out.println(bank.findByRequisite("3434", "2345"));

//        for (User user : map1.keySet()) {
//            System.out.println("Пользователь с паспортом " + user.getPassport() + "-> " + user);
//        }
//        System.out.println("до перевода " + bank.findByRequisite("3434", "2345"));
//        bank.transferMoney("3434", "2345", "1212", "3221", 1000);
//        System.out.println("после перевода " + bank.findByRequisite("3434", "2345"));
    }
}
