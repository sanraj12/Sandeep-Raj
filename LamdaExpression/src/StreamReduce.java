import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import javax.naming.CommunicationException;

public class StreamReduce {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		Optional<Integer> c = list.stream().reduce((a, b) -> a + b);
		System.out.println(c.get());

		List<String> list1 = Arrays.asList("abc", "def", "fghi", "adb");
		Optional<String> d = list1.stream().reduce((e, f) -> e.concat(f));
		System.out.println(d.get());

		;
	}

}
