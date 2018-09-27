import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SpecialPalindrom{

static class Point {
    public char key;
    public long count;

    public Point(char x, long y) {
        key = x;
        count = y;
    }
}
    static long substrCount(int n, String s) {
    s = s + " ";
    ArrayList<Point> list = new ArrayList<Point>();
    long count = 1;
    char ch = s.charAt(0);
    for(int i = 1; i <= n ; i++) {
        if(ch == s.charAt(i))
            count++;
        else {
            list.add(new Point(ch, count));
            count = 1;
            ch = s.charAt(i);
        }
    }
    count = 0;
    if(list.size() >= 3) {   
        Iterator<Point> itr = list.iterator();
        Point prev, curr, next;
        curr = (Point)itr.next();
        next = (Point)itr.next();		
        count = (curr.count * (curr.count + 1)) / 2;
        for(int i = 1; i < list.size() - 1; i++) {
            prev = curr;
            curr = next;
            next = itr.next();
            count += (curr.count * (curr.count + 1)) / 2;
            if(prev.key == next.key && curr.count == 1)
                count += prev.count > next.count ? next.count : prev.count;
        }
        count += (next.count * (next.count + 1)) / 2;
    } else {
        for(Point curr:list){
        	System.out.println();
            count += (curr.count * (curr.count + 1)) / 2;
        }
    } 
    return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	 String str = "abccba";
    	    System.out.print(substrCount(6,str));
    }
    }