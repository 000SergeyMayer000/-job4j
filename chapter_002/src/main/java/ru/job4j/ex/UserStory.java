package ru.job4j.ex;

public class UserStory {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                rsl = user;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("Такого пользователя нет");
        }
        return rsl;
    }


    public static boolean validate(User user) throws UserInvalidException {
        boolean valid = true;
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Валидация пользователя не прошла");
        }
        return valid;
    }

    public static void main(String[] args) {
        User[] users = {new User("Petr Arsentev", true)};
        try {
            User user = findUser(users, "Petr ");

            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.out.println("This user not pass validation");
        } catch (UserNotFoundException e) {
            System.out.println("This user not found");
        }
    }
}

