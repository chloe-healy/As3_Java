/**
 * @filename: User.java
 * @author: Chloe Healy
 */

package RegisterGUI;


public class User {
    private final String email;
    private final String password;

    /**
     * Constructor for a user object
     * @param email - string representation of a users email
     * @param password - string representation of a users password
     */

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /**
     * Boolean function to verify if an email meets criteria
     * @param testEmail string representation of the email to be tested
     * @return if the email matches the given regex values
     */


    public boolean verifyEmail(String testEmail) {
            String emailR = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                    + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
            return testEmail.matches(emailR);
        }


    /**
     * Function to verify if the password is the correct length
     * @param testPassword string representation of password to be compared
     * @return password if it has 7 or more charachters
     */
    public boolean verifyLength(String testPassword) {
        return testPassword.length() >= 7;
    }

    /**
     * Function to verify if the password contains special charachters
     * @param testPassword string representation of password to be compared
     * @return password that contains a special charachter
     */
    public boolean verifySpecial(String testPassword) {
        String specialR = ".*[/^&@!.].*";
        return password.matches(specialR);
    }

    /**
     * Function to verify if the password contains a number
     * @param testPassword string representation of password to be compared
     * @return  user passwords that contains a number
     */
    public boolean verifyNum(String testPassword) {
        String numR = ".*[0-9].*";
        return password.matches(numR);
    }

    /**
     * Function to verfity that a password contains a letter
     * @param testPassword string representation of password to be compared
     * @return password that contains a letter
     */
    public boolean verifyAlpha(String testPassword) {
        String alphaR = ".*[a-zA-Z].*";
        return password.matches(alphaR);
    }

    /**
     * Function to verify the password, based on all the functions above
     * @param testPassword string representation of password to be compared
     * @return verified password
     */
    public boolean verifyPass(String testPassword) {
        return (verifyLength(testPassword) && verifySpecial(testPassword) && verifyNum(testPassword) && verifyAlpha(testPassword));
    }
}

