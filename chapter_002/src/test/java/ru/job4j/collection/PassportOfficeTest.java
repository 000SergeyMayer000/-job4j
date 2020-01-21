package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void whenOneCitizenAdd() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void whenTwoCitizensAdd() {
        PassportOffice office = new PassportOffice();
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizen2 = new Citizen("w342y5", "Sergey Mayer");
        office.add(citizen);
        assertThat(office.add(citizen2), is(false));
    }

    @Test
    public void whenTwoSameCitizensAdd() {
        PassportOffice office = new PassportOffice();
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizen2 = new Citizen("2f44a", "Sergey Mayer");
        Citizen citizen3 = new Citizen("2f44a", "Sergey Mayer");
        System.out.println(office.add(citizen));
        office.add(citizen2);
        assertThat(office.add(citizen3), is(true));
    }
}