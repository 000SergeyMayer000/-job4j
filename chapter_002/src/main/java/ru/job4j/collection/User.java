package ru.job4j.collection;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(@NotNull User o) {
        if (CharSequence.compare(this.name, o.getName()) > 0) {
            return 1;
        } else if (CharSequence.compare(this.name, o.getName()) < 0) {
            return -1;
        } else {
            if (Integer.compare(this.age, o.age) > 0) {
                return 1;
            } else if (Integer.compare(this.age, o.age) < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}


