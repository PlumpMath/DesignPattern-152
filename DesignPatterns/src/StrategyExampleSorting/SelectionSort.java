package StrategyExampleSorting;

import java.util.Arrays;

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
