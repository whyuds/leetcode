import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {

    @Test
    void isMatch1() {
        boolean result = RegularExpressionMatching.isMatch("aa", "a");
        assertEquals(false, result);
    }

    @Test
    void isMatch2() {
        boolean result = RegularExpressionMatching.isMatch("aa", "a*");
        assertEquals(true, result);
    }

    @Test
    void isMatch3() {
        boolean result = RegularExpressionMatching.isMatch("ab", ".*");
        assertEquals(true, result);
    }

    @Test
    void isMatch4() {
        boolean result = RegularExpressionMatching.isMatch("aab", "c*a*b");
        assertEquals(true, result);
    }

    @Test
    void isMatch5() {
        boolean result = RegularExpressionMatching.isMatch("mississippi", "mis*is*p*.");
        assertEquals(false, result);
    }
}