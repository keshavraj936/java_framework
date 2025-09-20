import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
// Hey there how are you? let's go
public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11,0.3f,true);


        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Guava", 15);

        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange"); //access order when true then it will give the acessed elements at last


        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
