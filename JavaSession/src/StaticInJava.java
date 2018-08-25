
public class StaticInJava {

	public static void main(String[] args) {

		StaticExample example = new StaticExample();

		int t = example.Count++;
		int a = StaticExample.Total;

		StaticExample.getTotal();

		StaticExample example1 = new StaticExample();
		StaticExample example2 = new StaticExample();

		int b = example1.getTotal();
		int c = example2.getTotal();

		System.out.println(b);
		System.out.println(c);

		int d = example1.getCount();
		int e = example2.getCount();

		System.out.println(d);
		System.out.println(e);

	}

}

class ABC {
	static void def() {
		StaticExample example = new StaticExample();
		int h = example.Count;

	}

}

class StaticExample {
	int Count = 1;

	static int Total = 1;
	static StaticExample example = new StaticExample();

	int t = example.Count++;

	static int getTotal() {
		int t = example.Count++;
		return Total++;
	}

	int getCount() {
		return Count++;
	}
}
