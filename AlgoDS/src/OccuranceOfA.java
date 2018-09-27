import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class OccuranceOfA {


    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long aoccur ;
        long div ;
        long rem ;
        long occur=0;
    	
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        
 for(char letter : s.toCharArray())
            {
     if(letter=='a'){
                if(map.containsKey(letter))
                    map.put(letter, map.get(letter) + 1);
                else
                    map.put(letter, 1);
            }
            }
      aoccur = map.get('a');
     div =n/s.length();
      rem = n%s.length();
      occur = div*aoccur;
     for(int i =0; i<rem; i++)
     {
         if(arr[0]=='a')
         {
             occur++;
         }
     }
     
     
 
 return occur;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);


        scanner.close();
    }
}
