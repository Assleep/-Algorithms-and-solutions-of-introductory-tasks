import java.util.Scanner;
/*
Write a function that takes an integer as input,
and returns the number of bits that are equal to one in the binary representation of that number.
You can guarantee that input is non-negative.
Example: The binary representation of 1234 is 10011010010, 
so the function should return 5 in this case
*/
class BitCounting {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println(countBits(sc.nextInt()));
}
public static int countBits(int n){
    if(n == 0) return 0;
    if(n == 1) return 1;
    int count = 0;
    int del = n;
    while(del != 1){
      if(del%2 == 1) count++;
      del = del/2;
    } 
    count++;
    return count;
	}
	
}