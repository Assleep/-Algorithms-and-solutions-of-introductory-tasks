import java.util.*;

public class RomanNumeralsHelper {
    private static Map<String, Integer> sv = new HashMap<String, Integer>();
    public RomanNumeralsHelper(){
        sv.put("I", 1);
        sv.put("V", 5);
        sv.put("X", 10);
        sv.put("L", 50);
        sv.put("C", 100);
        sv.put("D", 500);
        sv.put("M", 1000);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fromRoman(sc.nextLine()));
        System.out.println(fromRoman("MMCV"));
    }
    public static int fromRoman(String romanNumeral) {
        int result = 0;
        String previous = "";
        boolean isSubstraction = false;
        for(String ch : romanNumeral.split("")){
            if(previous != "" && sv.get(ch) > sv.get(previous)){
                isSubstraction = true;
            }
            result = isSubstraction ? result + sv.get(ch) - 2*sv.get(previous) : result + sv.get(ch);
            previous = ch;
            isSubstraction = false;
        }
        return result;
    }
}
