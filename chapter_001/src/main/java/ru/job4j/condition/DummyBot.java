package ru.job4j.condition;

import java.lang.reflect.AnnotatedArrayType;

/**
 * *@author Sergey Mayer(samajor@mail.ru)
 * *@version $Id$
 * *@since 0.1
 **/
public class DummyBot {
    /**
     * Отвечает на вопросы.
     *
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        DummyBot ask = new DummyBot();
        String x = ask.answer("Привет, Бот.");
        System.out.println(x);
    }
}