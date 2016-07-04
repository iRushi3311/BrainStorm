package me.rpatel.anagram;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *  This class performs Anagram Checking for given strings.
 *
 *  Problem Statement : https://www.hackerrank.com/challenges/anagram
 *
 *  <p>
 *      Two strings  and  are called anagrams if they consist same characters, but may be in different orders.
 *      So the list of anagrams of CAT is "CAT", "ACT" , "TAC", "TCA" ,"ATC" and "CTA".
 *      Given two strings, print "Anagrams" if they are anagrams, print "Not Anagrams" if they are not.
 *      The strings may consist at most 50 English characters; the comparison should NOT be case sensitive.
 *  </p>
 */
public class AnagramChecker {

    /**
     * Checks if both strings are anagram or not
     * @param string1 - first string
     * @param string2 - second string to be compared
     * @return boolean - if both strings are anagram - returns TRUE, else function returns FALSE
     */
    static boolean isAnagram(String string1, String string2) {

        if(string1.length() == string2.length()) {

            Map<Character, Long> charMap = string1
                                                .toLowerCase()
                                                .chars().mapToObj(i -> (char)i)
                                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            Map<Character, Long> charMap2 = string2
                                                .toLowerCase()
                                                .chars().mapToObj(i -> (char)i)
                                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            boolean result = charMap.equals(charMap2);
            return result;
        } else {
            return false;
        }

    }

    public AnagramChecker() {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = AnagramChecker.isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
