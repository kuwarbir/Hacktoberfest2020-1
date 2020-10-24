import java.util.Arrays;

public class QuicksortAlgorithm {

	public static void main(String[] args) {

		int arr[] = { 7, 2, 1, 6, 5, 3, 8, 4 };
		quicksort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

	private static void quicksort(int[] arr, int start, int end) {
		if (start < end) {
			int p = partition(arr, start, end);
			quicksort(arr, 0, p - 1);
			quicksort(arr, p + 1, end);

		}

	}

	private static int partition(int[] arr, int start, int end) {
		int p = start;
		int pivot = arr[end];
		for (int i = start; i < end; i++) {
			if (arr[i] >= pivot) {
				int temp = arr[i];
				arr[i] = arr[p];
				arr[p] = temp;
				p++;

			}
		}
		int temp = arr[p];
		arr[p] = arr[end];
		arr[end] = temp;
		return p;
	}



}
