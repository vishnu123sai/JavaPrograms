import java.util.HashSet;
import java.util.*;



/**
 * Java Program to find all permutations of a String
 * @author pankaj
 *
 */
public class StringFindAllPermutations {
    public static Set<String> permutationFinder(String str) {
        SortedSet<String> perm = new TreeSet<String>();
        //Handling error scenarios
        if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0); // first character
        String rem = str.substring(1); // Full string without first character
        Set<String> words = permutationFinder(rem);
        System.out.println(words);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }

    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        System.out.println("in per  "+begin + c + end);
        return begin + c + end;
    }

    public static void main(String[] args) {
        String s = "ABC";
        //String s1 = "ABC";
        //String s2 = "ABCD";
        System.out.println("\nPermutations for " + s + " are: \n" + permutationFinder(s));
        // System.out.println("\nPermutations for " + s1 + " are: \n" + permutationFinder(s1));
        // System.out.println("\nPermutations for " + s2 + " are: \n" + permutationFinder(s2));
    }
}
