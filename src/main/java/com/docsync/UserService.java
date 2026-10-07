public class UserService{
  public User createUser(String user) {
    System.out.println("Creating user: " + user);

    if (user == null || user.isBlank()) {
        throw new IllegalArgumentException("User name cannot be empty");
    }

    System.out.println("Testing123 " + user);
}
}
