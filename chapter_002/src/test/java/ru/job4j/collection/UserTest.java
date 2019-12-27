package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.poly.collection.Job;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
    }

    @Test
    public void whenComparePetrVSIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareSegeyVSSergey() {
        int rsl = new User("Sergey", 32)
                .compareTo(
                        new User("Sergey", 40)
                );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenSortByNameAscendingSort() {
        Comparator<User> sbna = new SortByNameAscendingSort();
        int rsl = sbna.compare(
                new User("Petr", 31),
                new User("Ivan", 27)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenSortByNameDescendingSort() {
        Comparator<User> sbnd = new SortByNameDescendingSort();
        int rsl = sbnd.compare(
                new User("Petr", 31),
                new User("Ivan", 27)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenSortByAgeDescendingSort() {
        Comparator<User> sbad = new SortByAgeDescendingSort();
        int rsl = sbad.compare(
                new User("Petr", 31),
                new User("Ivan", 27)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenSortByAgeAscendingSort() {
        Comparator<User> sbaa = new SortByAgeAscendingSort();
        int rsl = sbaa.compare(
                new User("Petr", 31),
                new User("Ivan", 27)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCombinedSortByNameAscendingSortSortByAgeDescendugSort() {
        Comparator<User> comb = new SortByNameAscendingSort().thenComparing(new SortByAgeDescendingSort());
        int rsl = comb.compare(
                new User("Ivan", 29),
                new User("Ivan", 31)
        );
        assertThat(rsl, greaterThan(0));
    }
}