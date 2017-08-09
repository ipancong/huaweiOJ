package com.pancong.sort;

import java.util.Arrays;

/**
 * Created by Pan on 2017/8/5.
 */
public class Sort {
    public static void main(String[] args) {
        int array[] = {26, 53, 67, 48, 57, 12, 48, 32, 60, 50};
        //selectSort(array); //选择排序
        //insertSort(array); //插入排序
        //bubbleSort(array); //冒泡排序
        //mergeSort(array,0,array.length-1); //归并排序
        //quickSort(array); //快速排序
        shellSort(array); //希尔排序
        print(array);
    }

    public static void print(int array[]) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

    }

    //希尔排序
    public static void shellSort(int array[]){
        int len = array.length;
        int i = 0, j = 0;
        int step = 0, tmp = 0;
        for(step = len/2; step > 0; step = step/2){
            //根据步长进行直接插入排序
            for(i = step; i < len; i++){
                tmp = array[i];
                for(j = i-step; j >=0; j-=step){
                    if(tmp < array[j])
                        array[j+step] = array[j];
                    else
                        break;
                }
                array[j+step] = tmp;
            }
        }
    }


    //快速排序
    public static void quickSort(int[] arrays) {
        sort(arrays, 0, arrays.length - 1);
    }

    public static void sort(int[] arrays, int low, int high) {
        int i, j;
        if (low >= high)
            return;
        i = low;
        j = high;
        int tmp = 0;
        int key = arrays[i];
        while (i < j) {
            while (i < j && arrays[j] >= key)
                j--;
            if (i < j) {
                tmp = arrays[j];
                arrays[i] = arrays[j];
                arrays[j] = tmp;
            }
            while (i < j && arrays[i] <= key)
                i++;
            if (i < j) {
                tmp = arrays[i];
                arrays[i] = arrays[j];
                arrays[j] = tmp;
            }
        }
        arrays[i] = key;
        sort(arrays, low, i - 1);
        sort(arrays, i + 1, high);
    }

    //归并排序
    public static void mergeSort(int array[], int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(array, p, q);
            mergeSort(array, q + 1, r);
            merge(array, p, q, r);
        }
    }

    public static void merge(int array[], int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int i = 0, j = 0, k = 0;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (i = 0, k = p; i < n1; k++, i++)
            L[i] = array[k];
        for (i = 0, k = q + 1; i < n2; k++, i++)
            R[i] = array[k];
        for (k = p, i = 0, j = 0; i < n1 && j < n2; k++) {
            if (L[i] < R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
        }
        if (i < n1) {
            for (j = i; j < n1; j++, k++)
                array[k] = L[j];
        }
        if (j < n2) {
            for (i = j; i < n2; i++, k++)
                array[k] = R[i];
        }
        System.out.println(p + "," + q + "," + r + " " + Arrays.toString(array));
    }

    //冒泡排序
    public static void bubbleSort(int array[]) {
        System.out.println("冒泡排序");
        int len = array.length;
        int i = 0, j = 0;
        for (i = 0; i < len; i++) {
            for (j = len - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
    }


    //选择排序
    public static void selectSort(int array[]) {

        System.out.println("选择排序");
        int len = array.length;
        int i = 0, j = 0;
        for (i = 0; i < len; i++) {
            int tmp = array[i];
            int flag = i;
            for (j = i + 1; j < len; j++) {
                if (array[j] < tmp) {
                    tmp = array[j];
                    flag = j;
                }
            }
            if (flag != i) {
                array[flag] = array[i];
                array[i] = tmp;
            }
        }
    }

    //插入排序
    public static void insertSort(int array[]) {
        System.out.println("插入排序");
        int len = array.length;
        int i = 0, j = 0;
        for (i = 1; i < len; i++) {
            int tmp = array[i];
            j = i;
            if (array[j - 1] > tmp) {
                //找出插入的位置
                while (j >= 1 && array[j - 1] > tmp) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = tmp;
            }
        }
    }
}
