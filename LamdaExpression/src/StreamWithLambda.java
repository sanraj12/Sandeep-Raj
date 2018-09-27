import java.security.acl.Permission;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamWithLambda {

	public static void main(String[] args) {

		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		Person person6 = new Person();
		Person person7 = new Person();

		person1.setAge(12);
		person2.setAge(35);
		person3.setAge(55);
		person4.setAge(45);
		person5.setAge(29);
		person6.setAge(22);
		person7.setAge(18);

		List<Person> list = Arrays.asList(person1, person2, person3, person4, person5, person6, person7);

		/*
		 * list.stream().filter(pers->pers.getAge()>12).map(person8->person8.getAge())
		 * 
		 * .forEach(System.out::println);;
		 */

		Function<Person, Integer> persons = person -> person.getAge();
		Function<Person, String> personss = persont -> persont.getName();
		// list.stream().filter(pers->pers.getAge()>12).map(persons.andThen(personss). ;

		String str = list.stream().filter(pers -> pers.getAge() > 20).map(person8 -> person8.getName())
				.collect(Collectors.joining(","));

		System.out.print(str);

		list.stream().filter(pers -> pers.getAge() > 20).map(person8 -> person8.getName()).collect(Collectors.toList())
				.forEach(System.out::println);

		Map<Integer, List<Person>> result = list.stream().filter(pers -> pers.getAge() > 20)
				.collect(Collectors.groupingBy(Person::getAge));

		Long per = list.stream().filter(pers -> pers.getAge() > 20).collect(Collectors.counting());
		System.out.println(result);

	}

}
