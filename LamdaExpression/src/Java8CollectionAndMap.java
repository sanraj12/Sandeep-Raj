import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Java8CollectionAndMap {

	public static void main(String[] args) {
		// Note : Two ne methods in Java8 Collection Stream() and ParrallelStream()
		// Also spliterator()
		// foreach() iterable

		/// When you call Arrays.asList it does not return a java.util.ArrayList. It
		/// returns a java.util.Arrays$ArrayList which is an immutable list.
		// You cannot add to it and you cannot remove from it.

		List<String> list = Arrays.asList("abc", "defgh", "ijklmn", "opqrstuv");

		List<String> list1 = new ArrayList<>();

		list1.add("uhh");
		list1.add("uuerdl;kpigwqddfekf");

		System.out.println(list);

//list.forEach(System.out::println);

		Predicate<String> predicate = l -> l.length() > 4;

		list.stream().filter(predicate).forEach(System.out::println);

		list1.removeIf(predicate);

		System.out.println(list1.size());

		list.sort(Comparator.naturalOrder());

		list.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
		list.sort(Comparator.nullsFirst(Comparator.naturalOrder()));

		list.forEach(System.out::println);

	}

}
