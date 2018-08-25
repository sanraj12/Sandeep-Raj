
import java.util.HashMap;
import java.util.Map;
 
public class MapReplaceAll {
 
    public static void main(String[] args) {
        Map<Integer,Integer> numbers = new HashMap<>();
        for (int i = 1; i <= 10; ++i) {
            numbers.put(i, i);
        }
        System.out.println("Original: " + numbers);
 
        numbers.replaceAll((key, oldValue) -> oldValue * oldValue);
        System.out.println("Squared: " + numbers);
        
        numbers.replace(1, 19);
        System.out.println("Replace One : " + numbers);
    }
}