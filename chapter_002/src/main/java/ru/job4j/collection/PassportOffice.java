package ru.job4j.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    /**
     * метод проверяет есть ли такой "гражданин" в карте ( возвращает false) и если нет, то добавляет его в карту
     * @param citizen - проверяемый "гражданин"
     * @return если есть гражданин - true, если нет - false
     */
    public boolean add(Citizen citizen) {
        boolean rsl = true;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = false;
        }
        return rsl;
    }

    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}