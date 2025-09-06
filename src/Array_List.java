import java.util.ArrayList;
import java.util.List;


public class Array_List {
    public static void main(String[] args) {

        //LEARNING FRAMEWORK
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(76);

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


        list.set(2,40);
        System.out.println(list);




    }
}
