
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SumOfMaxAndMin {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
/*		int max = 0;
		int min = arr[0];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < min) {
				min = arr[j];
			}

		}

		for (int k = 0; k < arr.length; k++) {
			sum = sum + arr[k];
		}
		System.out.println(sum - max);
		System.out.println(sum - min);

	}
*/
		int sum=0;
	
		Arrays.sort(arr);
		
		for (int k = 0; k < arr.length; k++) {
			sum = sum + arr[k];
		}
		System.out.println(sum - arr[arr.length-1]);
		System.out.println(sum - arr[0]);
	}
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		miniMaxSum(arr);

		scanner.close();
	}
}