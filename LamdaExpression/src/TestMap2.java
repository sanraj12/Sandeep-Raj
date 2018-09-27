
 
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
 
public class TestMap2 {
 
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("A", "d");
        map.put("B", "f");
        map.put("C", "t");
      //  System.out.println(map);
 
        BiFunction<String, String, String> biFunction = (k, v) -> "fsffff";
 
        // "A" is already present in map, so its value will be incremented
        map.computeIfPresent("A", biFunction);
        System.out.println(map);
 
        // Since "D" is not present in map, the computation won't occur
        map.computeIfPresent("D", biFunction);
      //  System.out.println(map);
        
        
        // Check  bimap---------------------------------------------------
        
    }
 
}