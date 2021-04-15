import java.util.Scanner;
public class InsertionSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; ++i) {
            x = arr[i];
            int j = i;
            while(j>0 && arr[j-1]>x){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=x;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
