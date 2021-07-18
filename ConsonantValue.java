/*
Given a lowercase string that has alphabetic characters only and no spaces,
return the highest value of consonant substrings.
Consonants are any letters of the alphabet except "aeiou".

We shall assign the following values: a = 1, b = 2, c = 3, .... z = 26.

For example, for the word "zodiacs", let's cross out the vowels. We get: "z o d ia cs"
*/
import java.util.Scanner;

public class ConsonantValue {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println(solve(sc.nextLine()));
    }
    public static int solve(final String s) {
        int result = 0, tmp = 0;
        for(String str : s.replaceAll("[aeiou]", " ").split(" ")){
            for(char ch : str.toCharArray()){
                tmp += (int) ch - 96;
            }
            result = tmp > result ? tmp : result;
            tmp = 0;
        }
        return result;
    }
}
