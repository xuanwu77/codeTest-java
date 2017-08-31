package sort;
import java.util.*;
public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 -i;  j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

	public static void main(String[] args) {
		int[] arr = {3,1,2};
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
