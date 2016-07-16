package StrategyExample2;

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

