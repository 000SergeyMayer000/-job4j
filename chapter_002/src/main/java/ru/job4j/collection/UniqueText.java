package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        HashSet<String> sample = stringsToSet(originText);
        HashSet<String> check = stringsToSet(duplicateText);
        for (String duplicateString : check) {
            if (!sample.contains(duplicateString)) {
                rsl = false;
            }
        }
        return rsl;
    }

    public static HashSet<String> stringsToSet(String str) {
        HashSet<String> rsl = new HashSet<>();
        String[] strings = str.split(" ");
        rsl.addAll(Arrays.asList(strings));
        return rsl;
    }
}