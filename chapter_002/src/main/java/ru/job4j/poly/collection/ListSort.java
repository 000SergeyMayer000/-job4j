package ru.job4j.poly.collection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Integer first = 2;
        Integer second = 1;
        int rsl = first.compareTo(second); //метод возращает -1 если first < second, 0 - если равны и 1 если first > second
        System.out.println(rsl);

        String petr = "Petr";
        String ivan = "Ivan";
        int rslStr = petr.compareTo(ivan);
        System.out.println(rslStr);
        /*При сравнении каждая строка раскладывается на массив символов,
        которые в свою очередь преобразуются в массив числе.
       {P, e, t, r} -> {80, 101, 116, 114}
       {I, v, a, n} -> {73, 118, 100, 110}
       Дальше Java по очереди сравнивает каждую ячейку массива.
       В этом примере, первое вычисление вернет число 7.
        Так как 80 - 73 = 7. То есть больше нуля. Это значит, что слово "Petr" больше, чем слово "Ivan". */

        List<Integer> list1 = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list1);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);

    }
}