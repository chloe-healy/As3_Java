package Test;

import RegisterGUI.User;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    public static final String  userEmail = "email";
    public static final String userPass = "pass";

    @ParameterizedTest
    @ValueSource(strings = {"", "gmail.com", "abc", "user@yahoo" })
    public void invalidEmailTest(String testEmail) {
        User usr = new User(testEmail, userPass);
        assertFalse(usr.verifyEmail(testEmail));
    }

}
