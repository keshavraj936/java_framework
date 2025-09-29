import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {

        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(5, "Five");
        navigableMap.put(1, "One");
        navigableMap.put(3, "Three");

        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(4));
        System.out.println(navigableMap.ceilingKey(4));

    }
}
