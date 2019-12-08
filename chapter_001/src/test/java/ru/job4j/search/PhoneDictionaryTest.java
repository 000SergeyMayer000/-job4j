package ru.job4j.search;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        List<Person> persons = phones.find("Petr");
        assertThat(persons.iterator().next().getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindByAddres() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phones.add(new Person("Sergey", "Mayer", "258741", "Doneck"));
        List<Person> persons = phones.find("Don");
        assertThat(persons.iterator().next().getSurname(), is("Mayer"));
    }

    @Test
    public void whenFindByFone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phones.add(new Person("Sergey", "Mayer", "258741", "Doneck"));
        phones.add(new Person("Igor", "Hilytych", "987456", "Orel"));
        List<Person> persons = phones.find("87");
        assertThat(persons.size(), is(3));
    }
}