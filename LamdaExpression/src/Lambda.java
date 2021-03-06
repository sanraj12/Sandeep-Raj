import java.util.List;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Lambda {
	public static void main(String[] args) throws InterruptedException {

		/*
		 * FileFilter fileFilter = new FileFilter() {
		 * 
		 * @Override public boolean accept(File file) { // TODO Auto-generated method
		 * stub return file.getName().endsWith(".jpg"); } };
		 */

		// FileFilter fileFilter = File->File.getName().endsWith(".jpg");

		File dir = new File("d:Bittu");
		File[] file = dir.listFiles(File -> File.getName().endsWith(".jpg"));
		System.out.println(file[0]);
		//////////////////////////////////////////////////////////////
		Runnable runnable = () -> {
			for (int i = 0; i < 6; i++) {
				System.out.println(i);
			}

		};

		Thread t = new Thread(runnable);
		t.start();
		////////////////////////////////////////////////////////////////////

		Comparator<String> comparator1 = (a, b) -> a.compareTo(b);
		Comparator<String> comparator2 = String::compareTo;
		// Comparator<Integer> comparator3 = Integer::compare;

		List<String> list = Arrays.asList("abc", "def", "fghi", "adb");
		Collections.sort(list, comparator1);

		list.forEach(System.out::println);

		List list1 = new ArrayList<>();

		list.forEach(list1::add);

		System.out.println(list);

		System.out.println(list1);
	}
}
