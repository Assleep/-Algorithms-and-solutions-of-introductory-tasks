import java.util.Scanner;

/*
You are given an array (which will have a length of at least 3, but could be very large) containing integers.
The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
Write a method that takes the array as an argument and returns this "outlier" N.

[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number)*/

public class TheParityOutler {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(oddOrEven(arr));
    }
    private static int oddOrEven(int[] integers){
        boolean isOdd = false;
        if(integers[0]%2 == 0 && integers[1]%2 == 0){
            isOdd = true;
        } else if(integers[0]%2 != 0 && integers[1]%2 != 0){
            isOdd = false;
        }else{
            if(integers[2]%2 != 1 ) isOdd = true;
            if(integers[2]%2 != 0 ) isOdd = false;
        }
        if(isOdd){
            for(int i = 0; i < integers.length; i++){
                if(integers[i]%2!=0){ return integers[i];}
            }
        }else{
            for(int i = 0; i < integers.length; i++){
                if(integers[i]%2==0){ return integers[i];}
            }
        }
        return 0;
    }
}
