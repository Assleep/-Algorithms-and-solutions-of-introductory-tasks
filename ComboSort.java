import java.util.Scanner;
public class ComboSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int delta = n - 1;
        while(delta >= 1){
            for(int i = 0; i+delta < n; ++i){
                if(arr[i] > arr[i+delta]){
                    x = arr[i];
                    arr[i] = arr[i+delta];
                    arr[i+delta] = x;
                }
            }
            delta = (int) Math.floor(delta/1.247);
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
