/*
Assume "#" is like a backspace in string. This means that string "a#bc#d" actually is "bd"
Your task is to process a string with "#" symbols.

Examples
"abc#d##c"      ==>  "ac"
"abc##d######"  ==>  ""
"#######"       ==>  ""
""              ==>  ""
 */
import java.util.*;
import java.util.regex.Pattern;
public class BackspacesInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(cleanString(sc.nextLine()));
    }
    public static String cleanString(String s) {
        if(s.equals("") || !Pattern.compile("[^#]").matcher(s).find()) return "";
        Stack<String> stack = new Stack();
        for(String str : s.split("")){
            if(str.equals("#")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(str);
            }
        }
        return stack.isEmpty() ? "" : stack.stream().reduce((x, y) -> x+y).get();
    }
}