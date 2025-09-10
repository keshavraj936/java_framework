import java.util.Arrays;
import java.util.Vector;

public class frame_vector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector(5,3);


        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);

        System.out.println(vector.capacity());

        vector.add(1);
        System.out.println(vector.capacity());

        Vector<Integer> vector1 = new Vector<>(Arrays.asList(2, 4, 5));
        System.out.println(vector1);





    }
}
