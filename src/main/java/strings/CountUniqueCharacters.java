package strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, count and return the number of unique characters.
 */
public class CountUniqueCharacters {
    public static int count(String input){
        Set<Character> uniques = new HashSet<>();
        for(char c:input.toCharArray()){
            uniques.add(c);
        }
        return uniques.size();
    }

    public static void main(String args[]){
        System.out.println(count("aaaaaaab"));
    }
}
