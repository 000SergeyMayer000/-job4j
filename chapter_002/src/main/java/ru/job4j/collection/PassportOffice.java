package ru.job4j.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    Map<String, Citizen> citizens = new HashMap<>();

    /**
     * метод проверяет есть ли такой "гражданин" в карте ( возвращает true) и если нет, то добавляет его в карту
     *
     * @param citizen - проверяемый "гражданин"
     * @return если есть гражданин - false , если нет, то мы его добавляем и возвращаем - true
     */

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}