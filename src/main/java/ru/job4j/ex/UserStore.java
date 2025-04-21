package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User person = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                person = user;
                break;
            }
        } if (person == null) {
            throw new UserNotFoundException("User not found");
        }
        return person;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() <= 3) {
            throw new UserInvalidException("User is not validate");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");

            if (validate(user)) {
                System.out.println("This user " + user.getUsername() + " has the access");
            }
        } catch (UserInvalidException ie) {
            ie.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}