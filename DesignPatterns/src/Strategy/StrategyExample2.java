package Strategy;

import java.util.Arrays;

public class StrategyExample2 {
}

class StrategySorting{
    Sorting strategy;
    public void setStrategy(Sorting strategy){
        this.strategy = strategy;
    }
    public void performSort(int [] arr){
        strategy.sort(arr);
    }
}

 interface Sorting{
     void sort(int [] arr);
 }

class BubbleSort implements Sorting{
     public void sort(int[] arr) {
         System.out.println("Bubble sort");
         System.out.println("Before:\t"+Arrays.toString(arr));
         for (int i = 0; i < arr.length-1; i++) {
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
class SelectionSort implements Sorting{
    public void sort(int[] arr) {
        System.out.println("SelectionSort");
        System.out.println("before:\t"+ Arrays.toString(arr));
        for(int barrier = 0; barrier < arr.length - 1; barrier++ ){
            for (int i = barrier+1; i < arr.length; i++) {
                if (arr[i] < arr[barrier]) {
                    int tmp = arr[i];
                    arr[i] = arr[barrier];
                    arr[barrier] = tmp;
                    }
                }
            }
        System.out.println("After:\t"+Arrays.toString(arr));
    }
}
