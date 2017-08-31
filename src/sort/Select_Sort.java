package sort;

public class Select_Sort {
	public static void sort(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			int mix = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[j] < arr[mix]){
					mix = j;
				}
			}
			swap(arr,i,mix);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

	public static void main(String[] args) {
		int[] arr = {6, 5, 4, 3, 2, 1};
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
	}
}

