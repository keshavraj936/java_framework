import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCACHE<K, V> extends LinkedHashMap<K, V> {

    private int capacity;


    public LRUCACHE(int capacity){
        super(capacity,0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCACHE<String, Integer> studentMap = new LRUCACHE<>(3);
        studentMap.put("Bob", 99);
        studentMap.put("Alice", 89);
        studentMap.put("Ram", 91);

        studentMap.get("Bob");

        studentMap.put("Vipul", 88);

        studentMap.get("Bob");
        System.out.println(studentMap);
    }
}
