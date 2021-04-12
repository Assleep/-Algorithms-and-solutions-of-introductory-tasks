/*
*  The input is a string that is guaranteed to contain two @ symbols.
*  It is necessary to reverse the string between the first and last occurrences of the @ symbol
*  and print the original string with the change.
*  Example:
*  one@live@not on evil@two
*  one@live on ton@evil@two
*/
import java.io.IOException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        int index =  s.lastIndexOf("@");
        for(char letter : s.substring(s.indexOf("@"), s.lastIndexOf("@")).toCharArray()){
            s.setCharAt(index, letter);
            index--;
        }
        System.out.println(s.toString());
    }
}