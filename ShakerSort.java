import java.util.Scanner;
public class ShakerSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = n-1;
        while(left <= right){
            for(int i = right; i > left; --i){
                if(arr[i-1] > arr[i]){
                    x = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = x;
                }
            }
            ++left;
            for(int i = left; i < right; ++i){
                if(arr[i] > arr[i+1]){
                    x = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = x;
                }
            }
            --right;
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
