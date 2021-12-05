/**
 * @filename: test.java
 * @author: Chloe Healy
 */

package Test;

import RegisterGUI.User;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class test {

    /**
     * Class to run unit tests on the developed GUI.
     */

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

    @ParameterizedTest
    @ValueSource(strings = {"hasnum1", "abc1234", "pass56"})
    public void hasNumberTest(String testPassword) {
        User usr = new User(userEmail, testPassword);
        assertTrue(usr.verifyNum(testPassword));
    }

    @ParameterizedTest
    @ValueSource(strings = {"hasnonumone", "abcdefg", "passfive"})
    public void noNumberTest(String testPassword) {
        User usr = new User(userEmail, testPassword);
        assertFalse(usr.verifyNum(testPassword));
    }

    @ParameterizedTest
    @ValueSource(strings = {"plat9314s", "112x12y", "c"})
    public void hasLetterTest(String testPassword) {
        User usr = new User(userEmail, testPassword);
        assertTrue(usr.verifyAlpha(testPassword));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1234567", "7654321", ""})
    public void noLetterTest(String testPassword) {
        User usr = new User(userEmail, testPassword);
        assertFalse(usr.verifyAlpha(testPassword));
    }

    @ParameterizedTest
    @ValueSource(strings = {"pqrt!xd8", "!23h567", "p@assw0rdz"})
    public void validPasswordTest(String testPassword) {
        User usr = new User(userEmail, testPassword);
        assertTrue(usr.verifyPass(testPassword));
    }

    @ParameterizedTest
    @ValueSource(strings = {"abcdefg", "1234567", "!!@@!!@"})
    public void invalidPasswordTest(String testPassword) {
        User usr = new User(userEmail, testPassword);
        assertFalse(usr.verifyPass(testPassword));
    }
}


