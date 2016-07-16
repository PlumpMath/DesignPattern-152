package Strategy;

import java.util.Arrays;
import java.util.Random;

public class StrategyExample2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new Random().nextInt(100);
        }
        StrategySorting client = new StrategySorting();
        client.setStrategy(new BubbleSort());
        client.performSort(arr1);

        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = new Random().nextInt(100);
        }
        client.setStrategy(new InsertingSort());
        client.performSort(arr2);

        int[] arr3 = new int[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = new Random().nextInt(100);
        }
        client.setStrategy(new SelectionSort());
        client.performSort(arr3);
    }
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
class InsertingSort implements Sorting{
    public void sort(int[] arr){
        System.out.println("SelectionSort");
        System.out.println("before:\t"+ Arrays.toString(arr));
        for (int barrier = 1; barrier < arr.length ; barrier++) {
            int index = barrier;
            while (index - 1 >= 0 && arr[index] < arr[index-1]){
                int tmp = arr[index];
                arr[index] = arr[index-1];
                arr[index-1] = tmp;
                index--;
            }
        }
        System.out.println("After:\t"+Arrays.toString(arr));
    }
}
