// UserDAO.java
import java.util.HashMap;
import java.util.Map;

public class UserDatabase {

    private static final Map<String, User> userDatabase = new HashMap<>();

    // Static block to initialize users for demonstration
    static {
        User user = new User(1, "John", "john@email.com", "john123");
        userDatabase.put("john@email.com", user);
    }

    // Authenticate user based on email and password
    public User authenticateUser(String email, String password) {
        User user = userDatabase.get(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
