
public class UserService {

    public User createUser(String user) {

        System.out.println("Validating user creation request");
        System.out.println("Validating user creation request part 2");

        // Validate null or blank input first
        if (user == null || user.isBlank()) {
            throw new IllegalArgumentException(
                    "User name cannot be empty"
            );
        }

        // Validate minimum username length
        if (user.length() < 5) {
            throw new IllegalArgumentException(
                    "User name must contain at least 5 characters"
            );
        }

        // Compare Strings using .equals()
        if (user.equals("Anmol")) {
            System.out.println("User found!");
        }

        if (!user.equals("Anmol")) {
            System.out.println("User not found..");
        }

        System.out.println("Creating user: " + user);

        return new User(user);
    }

    private void testingMethod() {
        System.out.println("Testing this method");

        int n = 0;
        if (n == 0) {
            System.out.println("perfect");
        }
    }
}
