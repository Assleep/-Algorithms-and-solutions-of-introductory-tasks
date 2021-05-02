import java.util.Arrays;
import java.util.stream.IntStream;

/*
* There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.

A province is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.

Return the total number of provinces.
* Input: isConnected = [[1,1,0]
*                       [1,1,0]
*                       [0,0,1]]
Output: 2*/

public class NumberOfProvincesSolution {
   public static void main(String[] args){
       int[][] answer = {{1,1,0,0,0},{1,1,1,0,0},{0,1,1,0,0}, {0, 0, 0, 1,1},{0,0,0,1,1}};
       System.out.println(findCircleNum(answer));
   }
    public static int findCircleNum(int[][] isConnected) {
        if(isConnected.length == 1) return 1;
        int provinceCounter = 0;
        int current = 0;
        int[] validPath = new int[isConnected.length];
        int cities = 0;
        for(int i = 0; i < isConnected.length; i++){
            if(IntStream.of(isConnected[i]).sum() == 1){
                provinceCounter++;
                cities++;
                validPath[i] = 1;
                continue;
            }
        }
        if(cities >= isConnected.length) return provinceCounter;
        while(cities != isConnected[current].length){
            current = getFirstCity(validPath);
            validPath[current] = 1;
            for(int i = 0; i < isConnected[current].length; i++){
                if(current == i){
                    if(current == isConnected[current].length-1 && IntStream.of(isConnected[current]).sum() != 1){
                        provinceCounter++;
                        break;
                    }
                    continue;
                }
                if(isConnected[current][i] == 1 && validPath[i] == 0){
                    validPath[current] = 1;
                    current = i;
                    if(IntStream.of(Arrays.copyOfRange(isConnected[current], current+1, isConnected.length)).sum() == 0){
                        validPath[current] = 1;
                        provinceCounter++;
                    }
                    break;
                }
            }
            cities++;
        }
        return provinceCounter;
    }
    public static int getFirstCity(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) return i;
        }
        return 0;
    }
}
