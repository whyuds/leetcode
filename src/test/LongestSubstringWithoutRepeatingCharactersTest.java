import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void test1(){
        String s = "abcabcbb";
        assertTrue(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s) == 3);
    }

    @Test
    public void test2(){
        String s = "bbbbb";
        assertTrue(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s) == 1);
    }

    @Test
    public void test3(){
        String s = "pwwkew";
        assertTrue(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s) == 3);
    }
}