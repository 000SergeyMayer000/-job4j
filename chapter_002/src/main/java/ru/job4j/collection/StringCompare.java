package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int minsize = Math.min(o1.length(), o2.length());
        int res = 0;
        for (int index = 0; index < minsize; index++) {
            int compare = Character.compare(o1.charAt(index), o2.charAt(index));
            if (compare != 0) {
                res = compare;
                break;
            }
        }
        if (res == 0) {
            res = Integer.compare(o1.length(), o2.length());
        }
        return res;
    }
}
