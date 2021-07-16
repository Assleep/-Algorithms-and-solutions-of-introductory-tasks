/*
  Your job is to create a calculator which evaluates expressions in Reverse Polish notation.

  For example expression 5 1 2 + 4 * + 3 - (which is equivalent to 5 + ((1 + 2) * 4) - 3 in normal notation) should evaluate to 14.
  For your convenience, the input is formatted such that a space is provided between every token.
  Empty expression should evaluate to 0.
  Valid operations are +, -, *, /.
  You may assume that there won't be exceptional situations (like stack underflow or division by zero).
*/
import java.util.*;

public class ReversePolishNotationCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(evaluate(sc.nextLine()));
    }
    public static double evaluate(String expr) {
        if(!expr.equals("")){
            String[] chars = expr.split(" ");
            List<Float> nums = new ArrayList<>();
            for(String str : chars){
                if(chars.length == 1) return Float.parseFloat(str);

                switch(str){
                    case "+":
                        Float num1 = nums.get(nums.size()-1);
                        Float num2 = nums.get(nums.size()-2);
                        nums.remove(nums.size()-1);
                        nums.remove(nums.size()-1);
                        nums.add(num1+num2);
                        break;
                    case "-":
                        num1 = nums.get(nums.size()-1);
                        num2 = nums.get(nums.size()-2);
                        nums.remove(nums.size()-1);
                        nums.remove(nums.size()-1);
                        nums.add(num2-num1);
                        break;
                    case "*":
                        num1 = nums.get(nums.size()-1);
                        num2 = nums.get(nums.size()-2);
                        nums.remove(nums.size()-1);
                        nums.remove(nums.size()-1);
                        nums.add(num1*num2);
                        break;
                    case "/":
                        num1 = nums.get(nums.size()-1);
                        num2 = nums.get(nums.size()-2);
                        nums.remove(nums.size()-1);
                        nums.remove(nums.size()-1);
                        nums.add(num2/num1);
                        break;
                    default:
                        nums.add(Float.parseFloat(str));
                        break;
                }
            }
            return nums.get(nums.size()-1);
        }
        return 0;
    }
}
