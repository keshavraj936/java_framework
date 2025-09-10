import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class frame_Stack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);

        Integer removedElement = stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        stack.search(3); // find index from top indexing starting from 1


        // linkedlist as stack

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addLast(1); // push
        linkedList.addLast(2);
        linkedList.getLast();  // peek
        linkedList.removeLast(); // pop

        System.out.println(linkedList);


        //arraylist as stack

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.get(arrayList.size() - 1); //peek
        arrayList.remove(arrayList.size() - 1); // pop

        System.out.println(arrayList);


    }
}
