/*
* Example:
* [9, 4, 2, 3, 6, 8, 1] -> [1, 4, 2, 3, 6, 8, 9]
*/
import java.util.ArrayList;
import java.util.Scanner;

public class SortOnlyOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int size = 0;
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2!=0){
                temp.add(arr[i]);
                size++;
            }
        }
        int[] temp_arr = new int[size];
        for(int i = 0; i < size; i++){
            temp_arr[i] = temp.get(i);
        }
        for(int i = 0; i < size; i++){
            int tmp = 0;
            for(int j = 0; j < size; j++){
                if(temp_arr[i]<temp_arr[j]){
                    tmp = temp_arr[i];
                    temp_arr[i] = temp_arr[j];
                    temp_arr[j] = tmp;
                }
            }
        }
        size = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2!=0){
                arr[i] = temp_arr[size];
                size++;
            }
            System.out.print(arr[i]);
        }
    }
}
