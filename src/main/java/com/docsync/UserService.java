
public class UserService {

    public User createUser(String user) {
        if (user == null || user.isBlank()) {
            throw new IllegalArgumentException(
                    "User name cannot be empty"
            );
        }

        System.out.println("Creating user: " + user);

        return new User(user);
    }
}
