import java.util.Scanner;
public class QuickSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private static void quickSort(int[] arr, int low, int high){
        int med = arr[low+(high-low)/2];
        int i = low;
        int j = high;
        while(i<=j){
            while(arr[i] < med){
                i++;
            }
            while(arr[j] > med){
                j--;
            }
            if(i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if(low < j){
                quickSort(arr, low, j);
            }
            if(high > i){
                quickSort(arr, i, high);
            }
        }
    }
}
