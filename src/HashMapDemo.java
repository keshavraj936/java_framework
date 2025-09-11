import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Akshit");
        map.put(2, "Neha");
        map.put(3, "Shubham");

        System.out.println(map);

        System.out.println(map.get(3));

        System.out.println(map.get(27));

        System.out.println(map.containsKey(20));
        System.out.println(map.containsValue("Shubham"));

        


        for(int i: map.keySet()){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for(Map.Entry<Integer, String> entry :entries){
            System.out.println(entry.getKey() + ": " + entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());
        }

        System.out.println(map);

        map.remove(3);
        System.out.println(map);



    }
}
