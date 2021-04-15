import java.util.Scanner;
public class SelectionSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x,k;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            x = arr[i];
            k = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < x) {
                    k = j;
                    x = arr[j];
                }
            }
            arr[k]= arr[i];
            arr[i] = x;
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

