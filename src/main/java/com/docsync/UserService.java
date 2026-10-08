public class UserService{
  public User createUser(String user) {
    System.out.println("Creating user: " + user);
    System.out.println("Creating user2: " + user);

    if (user == null || user.isBlank()) {
        throw new IllegalArgumentException("User name cannot be empty");
    }
    if(user != null){
        throw new IllegalArgumentException("User name cannot be empty");
    }
}
}
