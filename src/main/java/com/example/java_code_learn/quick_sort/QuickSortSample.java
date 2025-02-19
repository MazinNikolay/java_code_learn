package com.example.java_code_learn.quick_sort;

public class QuickSortSample {
    public static void main(String[] args) {
        int[] array = {3, 1, 7, 5, 6, 4, 8, 2, 9};
        quickSort(array, 0, array.length - 1);
        System.out.println("Отсортированный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int left = low + 1;
        int right = high;
        while (true) {
            while (left <= right && arr[left] <= pivot) {
                left++;
            }
            while (right >= left && arr[right] >= pivot) {
                right--;
            }
            if (right < left) {
                break;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[right];
        arr[right] = temp;
        return right;
    }
}
