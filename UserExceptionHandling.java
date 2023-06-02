class AgeException extends Exception {

    public AgeException(String message) {

        super(message);

    }

}

class User {

    private String name;

    private int age;

    public User(String name, int age) throws AgeException {

        if (age < 0 || age > 120) {

            throw new AgeException("Invalid age!");

        }

        this.name = name;

        this.age = age;

    }

    public String getName() {

        return name;

    }

    public int getAge() {

        return age;

    }

}

public class UserExceptionHandling {

    public static void main(String[] args) {

        try {

            User user1 = new User("rohit", 37);

            System.out.println("User name: " + user1.getName());

            System.out.println("User age: " + user1.getAge());


            User user2 = new User("kim", -5);

            System.out.println("User name: " + user2.getName());

            System.out.println("User age: " + user2.getAge());

        } catch (AgeException e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}