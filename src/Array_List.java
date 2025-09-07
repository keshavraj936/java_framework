import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Array_List {
    public static void main(String[] args) {

        //LEARNING FRAMEWORK
        ArrayList<Integer> list1 = new ArrayList<>();
//        list.add(1);
//        list.add(4);
//        list.add(76);

//        System.out.println(list.get(2));
//        System.out.println(list.size());

//        for(int i = 0; i < list.size() ; i++){
//            System.out.println(list.get(i));
//        }


//        for(int x : list){
//            System.out.println(x);
//        }
//        System.out.println(list.contains(4));
//        System.out.println(list.contains(50));

//        list.remove(2);
//        System.out.println(list.size());

//        list.add(2,50);
//        for(int x : list){
//            System.out.println(x);
//        }


//        list.set(2,40);
//        System.out.println(list);


        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(2);
        list2.add(3);
        list2.add(0,0);
        System.out.println(list2);

        List<Integer> list3 = List.of(4,5,6,7,8,9);

        list2.addAll(list3);
        System.out.println(list2);

        Object[] array = list2.toArray();
        list2.toArray(new Integer[0]);


        list2.remove(Integer.valueOf(1));
        System.out.println(list2);

       list2.sort(null);
        System.out.println(list2);


        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("Coconut");
        fruits.add("Date");

        fruits.remove("Apple");

        System.out.println(fruits);



    }
}
