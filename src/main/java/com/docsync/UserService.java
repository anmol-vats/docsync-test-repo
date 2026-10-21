
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
    private void testingMethod(){
        System.out.println("Tetsing this method");
        int n = 0;
        if(n == 0){
            System.out.println("perfect");
        }
    }
}
