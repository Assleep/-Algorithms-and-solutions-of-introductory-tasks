import java.util.Scanner;

/*You need to return a string that looks like a diamond shape when printed on the screen,
  using asterisk (*) characters. Trailing spaces should be removed,
  and every line must be terminated with a newline character (\n).

  Return null if the input is an even number or negative,
  as it is not possible to print a diamond of even or negative size.
  A size 3 diamond:
    *
   ***
    *
 */
class DrawDiamond {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(DrawDiamond.print(num));
    }
    public static String print(int n) {
        if(n>0 && n%2!=0){
            StringBuilder result = new StringBuilder();
            if(n > 1){
                for(int i = 1; i <= n; ){
                    if(i != n){
                        int k = (n-i)/2;
                        while(k != 0){
                            result.append(" ");
                            k--;
                        }
                    }
                    if(i%2!=0){
                        for(int j = 0; j < i; j++){
                            result.append("*");
                        }
                        result.append("\n");
                    }
                    i+=2;
                }
                for(int i = n-2; i >= 1;){
                    int k = (n-i)/2;
                    while(k != 0){
                        result.append(" ");
                        k--;
                    }
                    if(i%2!=0){
                        for(int j = 0; j < i; j++){
                            result.append("*");
                        }
                        result.append("\n");
                    }
                    i-=2;
                }
            }else{
                result.append("*\n");
            }
            return result.toString();
        }
        return null;
    }
}
