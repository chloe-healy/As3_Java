package RegisterGUI;

public class User {
    private final String email;
    private final String password;

    /**
     *
     * Constructor to create a user object
     * @param email    - string representation of a users email
     * @param password - string representation of a users password
     */

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
