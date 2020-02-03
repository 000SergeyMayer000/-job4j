package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int minsize = Math.min(o1.length(), o2.length());
        int res = 0;
        ArrayList<String> o1List = new ArrayList<>(Arrays.asList(o1.split("/")));
        ArrayList<String> o2List = new ArrayList<>(Arrays.asList(o2.split("/")));
        for (int index = 0; index < minsize; index++) {

            int compare = o1List.get(index).compareTo(o2List.get(index));
            if (compare != 0) {
                res = compare;
                break;
            }
        }
        return res;
    }
}
