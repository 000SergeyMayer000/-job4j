package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        List<Character> leftList = new ArrayList<>();
        char[] leftArray = o1.toCharArray();
        for (Character character : leftArray) {
            leftList.add(character);
        }
        List<Character> rightList = new ArrayList<>();
        char[] rightArray = o2.toCharArray();
        for (Character character : rightArray) {
            rightList.add(character);
        }
        int rsl = -1;
        int index = Math.min(leftList.size(), rightList.size());
        for (int i = 0; i < index; i++) {
            if (Character.compare(leftList.get(i), rightList.get((i))) == 1 || (Integer.compare(leftList.get(i), rightList.get((i)))) == 1) {
                rsl = 1;
                break;
            } else if (Character.compare(leftList.get(i), rightList.get((i))) == 0 || (Integer.compare(leftList.get(i), rightList.get((i)))) == 0) {
                rsl = 0;
            } else {
                rsl = -1;
                break;
            }
        }
        if (rsl == 0) {
            if (leftList.size() > rightList.size()) {
                rsl = 1;
            } else if (leftList.size() < rightList.size()) {
                rsl = -1;
            }
        }
        return rsl;
    }
}
