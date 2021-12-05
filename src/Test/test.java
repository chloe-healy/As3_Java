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

    @ParameterizedTest
    @ValueSource(strings = {"student123@umail.ucc.ie", "john@gmail.com", "tina99@hotmail.com"})
    public void validEmailTest(String testEmail) {
        User usr = new User(testEmail, userPass);
        assertTrue(usr.verifyEmail(testEmail));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "hello!", "abc12!", "a!2"})
    public void invalidLengthTest(String testPassword) {
        User usr = new User(userEmail, testPassword);
        assertFalse(usr.verifyLength(testPassword));
    }

    @ParameterizedTest
    @ValueSource(strings = {"longp@@ss", "abc123!", "c0mputerSc!"})
    public void validLengthTest(String testPassword) {
        User usr = new User(userEmail, testPassword);
        assertTrue(usr.verifyLength(testPassword));
    }

    @ParameterizedTest
    @ValueSource(strings = {"hasst/r", "h@@s2at", "hasexclam!"})
    public void hasSpecialCharTest(String testPassword) {
        User usr = new User(userEmail, testPassword);
        assertTrue(usr.verifySpecial(testPassword));
    }

    @ParameterizedTest
    @ValueSource(strings = {"hasnost4r", "hasnoaatz1", "hasnoexclam"})
    public void noSpecialCharTest(String testPassword) {
        User usr = new User(userEmail, testPassword);
        assertFalse(usr.verifySpecial(testPassword));
    }

}
