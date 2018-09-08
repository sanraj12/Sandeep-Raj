
public class RecurrsionMethod {
	public static void main(String[] args) {

		System.out.println(recurssivesum(10));
	}

	public static int recurssivesum(int n) {
		int sum = 0;
		if (n == 0) {
			System.out.println("do nothing");
		} else {
			sum = n + recurssivesum(n - 1);
		}
		return sum;
	}
}
