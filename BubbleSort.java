import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = n-1; j >= 1; j--){
            for(int k = 0; k < j; k++){
                if(arr[k] > arr[k+1]){
                    x = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = x;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
