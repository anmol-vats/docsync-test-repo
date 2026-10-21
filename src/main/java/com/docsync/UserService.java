
public class UserService {

    public User createUser(String user) {
        if (user == null || user.isBlank()) {
            throw new IllegalArgumentException(
                    "User name cannot be empty"
            );
        }

        if(user == 'Anmol'){
            System.out.println("User found !");
        }

        if(user != 'Anmol'){
            System.out.println("User not found..");
        }

        System.out.println("Creating user: " + user);

        return new User(user);
    }
}
