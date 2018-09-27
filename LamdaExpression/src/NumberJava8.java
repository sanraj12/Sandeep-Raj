import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

import com.sandeep.person.Person;

public class NumberJava8 {

	public static void main(String[] args){
	Long long1 = new Long(123);
	Long long2 = new Long(456);
	
long l = Long.max(long1, long2);
	
BinaryOperator<Long> binaryOperator = Long::sum;

Map<String, Person> map = new HashMap<>();
	
map.put("1", new Person(1, "Mahesh")) ;
map.put("2", new Person(2, "Ram"));
map.put("3", new Person(3, "Krishna"));
map.put("4",null) ;



Person person =new Person(9,"Shyam");

map.forEach((String,Person)->System.out.println(String+Person));




}
}
