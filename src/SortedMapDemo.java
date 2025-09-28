import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>((a, b) -> b -a);
        map.put(91, "Vivek");
        map.put(88, "Shubham");
        map.put(78, "Mohit");
        map.put(75, "Vipul");

        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(80));
        System.out.println(map.tailMap(80));

        System.out.println(map.reversed());




    }
}
