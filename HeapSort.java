import java.util.*;
public class HeapSort{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		for(int i = n/2 - 1; i >= 0; i--){
		    heapSort(arr, n, i);
		}
		for(int i = n-1; i>=0; i--){
		    int temp = arr[0];
		    arr[0] = arr[i];
		    arr[i] = temp;
		    heapSort(arr, i, 0);
		}
		for(int i = 0; i < n; i++){
		    System.out.print(arr[i]+" ");
		}
	}
	public static void heapSort(int[] arr, int n, int highest){
	    int max = highest;
	    int left = 2*highest+1;
	    int right = 2*highest+2;
	    
	    if(left < n && arr[left] > arr[max]) max = left;
	    if(right < n && arr[right] > arr[max]) max = right;
	    if(max != highest){
	        int temp = arr[highest];
	        arr[highest] = arr[max];
	        arr[max] = temp;
	        heapSort(arr, n, max);
	    }
	}
}
