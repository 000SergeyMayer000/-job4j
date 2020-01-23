package ru.job4j.ex;

public class JdbcConfig {
    //    ****************************************
//     Объявления исключений в сигнатуре метода.

    public static void load(String url) throws UserInputException {
        if (url == null) {
            throw new UserInputException("Url could not be null");
        }
        //load jdbc
    }
//    ****************************************
            //Конструкция try-catch
    public static void main(String[] args) throws UserInputException {
        try {
            load("jdbc://localhost:8080");
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}