import java.util.*;

class BinarySearch {
	public static int binarySearch(int[] arr, int key) {
		int l = 0;
		int r = arr.length - 1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		var scn = new Scanner(System.in);
		System.out.println(
				"First enter n in first line. In next n lines enter a number in each line. In last line enter target number");
		System.out.println("Enter size of array");
		int n = scn.nextInt();
		System.out.println("Enter n integers");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		Arrays.sort(arr);
		scn.close();
		System.out.println("Enter target number");
		int target = scn.nextInt();
		System.out.println("the target is at : " + binarySearch(arr, target));
	}
}
