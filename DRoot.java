import java.util.Scanner;

public class DRoot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(digital_root(sc.nextInt()));
    }
    public static int digital_root(int n) {
        if(n<10) return n;
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n = n / 10;
            if(n == 0 && sum >= 10){
                n = sum;
                sum = 0;
            }
        }
        return sum;
    }
}
