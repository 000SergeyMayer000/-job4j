package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenExit() {
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[]{action});
        assertThat(action.isCall(), is(true));
    }

    @Test
    public void whenPrtMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(
                new String[] {"0"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[] { action });
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("           Меню.")
                .add("0. Stub action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
    @Test
    public void whenCheckOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item = new Item("name 1", "desc 1", 2610201914144L);
        tracker.add(item);
        AllShowAction act = new AllShowAction();
        act.execute(new StubInput(new String[] {}), tracker);
        StringBuilder expect = new StringBuilder();
        expect.append("Заявка с именем " + item.getName());
        expect.append(System.lineSeparator());
        expect.append("ID заявки: " + item.getId());
        expect.append(System.lineSeparator());
        expect.append("Дата создания: " + item.getTime());
        expect.append(System.lineSeparator());
        expect.append("Описание: " + item.getDecs());
        expect.append(System.lineSeparator());
        expect.toString();

        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}
