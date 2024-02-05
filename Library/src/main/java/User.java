
import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String name;
    private String email;
    private String password;
    
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public User(int userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    public static List<User> getUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User(1, "John", "john@email.com", "john123"));
        users.add(new User(2, "Mary", "mary@email.com", "maryabc"));
        return users;
    }
}
