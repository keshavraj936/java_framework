import java.util.Arrays;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {


        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);

        linkedlist.addLast(4);
        linkedlist.addFirst(0);

        linkedlist.get(2); //O(n)
        linkedlist.getFirst();
        linkedlist.getLast();

        System.out.println(linkedlist);

        linkedlist.removeIf(x -> x % 2 == 0);
        System.out.println(linkedlist);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Lion"));

        animals.removeAll(animalsToRemove);
        System.out.println(animals);



    }
}
