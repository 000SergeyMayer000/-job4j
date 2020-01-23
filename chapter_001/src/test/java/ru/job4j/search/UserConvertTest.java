package ru.job4j.search;

import org.junit.Test;
import ru.job4j.map.User;
import ru.job4j.map.UserConvert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserConvertTest {
//    @Test
//    public void when3usersThem1Map() {
//        UserConvert userConvert = new UserConvert();
//        List<User> users = new ArrayList<>();
//        users.add(new User(1, "Sergey", "Doneck"));
//        users.add(new User(2, "Roman", "Orel"));
//        users.add(new User(3, "Petr", "Smolensk"));
//        Map<Integer, User> result = userConvert.process(users);
//        Map<Integer, User> expect = Map.of(
//                1, new User(1, "Sergey", "Doneck"),
//                2, new User(2, "Roman", "Orel"),
//                3, new User(3, "Petr", "Smolensk")
//        );
//        assertThat(result, is(expect));
//    }


    @Test
    public void when2usersThem1Map() {
        UserConvert userConvert = new UserConvert();
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Sergey", "Doneck"));
        users.add(new User(2, "Roman", "Orel"));
        users.add(new User(3, "Petr", "Smolensk"));
        Map<Integer, User> map = userConvert.process(users);
        User result = map.get(3);
        assertThat(result, is(new User(3, "Petr", "Smolensk")));
    }
}



