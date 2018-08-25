import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.sandeep.person.ComparartorExample;
import com.sandeep.person.Person;

public class ComaparatorJava8 {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "Mahesh"));
		list.add(new Person(4, "Mahesh"));
		list.add(new Person(2, "Ram"));
		list.add(new Person(3, "Krishna"));

		Comparator<Person> comparator = Comparator.comparing(Person::getName);
		Comparator<Person> comparator1 = Comparator.comparing(Person::getPid);

		list.sort(comparator1);
		list.sort(comparator);

		System.out.println(list);
		// Another way
		Comparator<Person> comparator2 = Comparator.comparing(Person::getName).thenComparing(Person::getPid);

		list.sort(comparator2);

		System.out.println(list);

		Comparator<Person> comparator3 = comparator.reversed();
		list.sort(comparator3);

		System.out.println(list);

	}

}
