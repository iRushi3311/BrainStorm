package me.rpatel.anagram;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for AnagramChecker
 */
public class AnagramCheckerTest {

    @Test
    public void testIsAnagram() {
        boolean result = AnagramChecker.isAnagram("ABCDEF","ABCDEF");
        Assert.assertTrue("Should detect as an anagram",result);
    }

    @Test
    public void testIsAnagram2() {
        boolean result = AnagramChecker.isAnagram("CAT","TAC");
        Assert.assertTrue("Should detect as an anagram",result);
    }

    @Test
    public void testIsAnagram3() {
        boolean result = AnagramChecker.isAnagram("CAT","ACT");
        Assert.assertTrue("Should detect as an anagram",result);
    }

    @Test
    public void testNotEqualSizeOfString() {
        boolean result = AnagramChecker.isAnagram("ABCD","ABC");
        Assert.assertFalse("Should detect not an anagram", result);
    }

    @Test
    public void testIntIsAnagram() {
        boolean result = AnagramChecker.isAnagram("123","132");
        Assert.assertTrue("Should detect as an anagram",result);
    }

}
