package StrategyExample2;

import java.util.Arrays;

class BubbleSort implements Sorting{
     public void sort(int[] arr) {
         System.out.println("Bubble sort");
         System.out.println("Before:\t"+ Arrays.toString(arr));
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr.length - i - 1; j++) {
                 if (arr[j]>arr[j+1]){
                     int tmp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1]= tmp;
                 }
             }
         }
         System.out.println("After:\t"+Arrays.toString(arr));
     }
}
