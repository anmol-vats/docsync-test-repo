public class UserService{
  public User createUser(String user) {
    System.out.println("Creating user: " + user);

    if (user == null || user.isBlank()) {
        throw new IllegalArgumentException("User name cannot be empty");
    }

    System.out.println("User name is " + user);
}
  public User createUser(String user) {
    System.out.println("Creating user: " + user);

    if (user == null || user.isBlank()) {
        throw new IllegalArgumentException("User name cannot be empty");
    }

    System.out.println("User name is " + user);
}
}
