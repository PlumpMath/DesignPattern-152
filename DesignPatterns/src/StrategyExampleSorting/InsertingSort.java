package StrategyExampleSorting;

import java.util.Arrays;

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
