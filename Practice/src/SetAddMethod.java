import java.util.HashSet;
import java.util.Set;

public class SetAddMethod {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		boolean s=set.add("abc");
		boolean t= set.add("abc");
		
		System.out.println(s);
		System.out.println(t);
		
		String str = "My God is the 	Ram";
		//str.replaceAll('\t');
		char[] ch =str.toCharArray();
		
		System.out.println(ch.length);
		
	}
}