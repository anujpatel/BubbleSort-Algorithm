package com.anuj.algorithms;

import java.util.Arrays;

/**
 *
 * @author Anuj Patel
 * @source goldenpackagebyanuj.blogspot.com
 */
public class BubbleSort {

    protected void doBubbleSort(int data[], String sortingType) {
        int temp;
        for (int i = 0; i < data.length; i++) {
            //data[i] - individual array values
            for (int j = 0; j < data.length - 1; j++) {
                if (sortingType.equalsIgnoreCase("Ascending")) {
                    if (data[j] > data[j + 1]) {
                        temp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = temp;                        
                    }                    
                } else if (sortingType.equalsIgnoreCase("Descending")) {
                    if (data[j] < data[j + 1]) {
                        temp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = temp;
                    }
                }
            }
        }
        System.out.println("After " + sortingType + " Sorting : " + Arrays.toString(data));
   }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        int data[] = {1, 2, 33, 56, 8, 31};
        System.out.println("Before Sorting : " + Arrays.toString(data));
        bubbleSort.doBubbleSort(data, "Ascending");
        bubbleSort.doBubbleSort(data, "Descending");
    }
}
