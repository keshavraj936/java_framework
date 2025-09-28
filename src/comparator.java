import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


//class StringLengthComparator implements Comparator<String> {
//
//
//    @Override
//    public int compare(String o1, String o2) {
//        return o1.length() - o2.length();// negative, o1 comes before o2
//    }
//}

// o1   o2
//"ok" "bye"


//    class myComparator implements Comparator<Integer> {
//
//        @Override
//        public int compare(Integer o1, Integer o2) {
//            return o2 - o1;
//        }
//    }
/*
 * Ascending (o1 - o2):
 *   o1 < o2 → negative → o1 before o2
 *   o1 > o2 → positive → o1 after o2
 *   => {3, 5}
 *
 * Descending (o2 - o1):
 *   o1 < o2 → positive → o1 after o2
 *   o1 > o2 → negative → o1 before o2
 *   => {5, 3}
 */




public class comparator {
    public static void main(String[] args) {

        // Comaparotor is interface

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(2);

        list.sort((a, b) -> b - a);
        System.out.println(list);

        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort((a, b) -> a.length() - b.length());
        System.out.println(words);





        List<Student> students =new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Akshit" ,3.9));

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        students.sort(comparator);
        for (Student s : students) {
            System.out.println(s.getName() + ": " + s.getGpa());

        }
    }

}

class Student implements Comparable<Student>{
    private String name;
    private double gpa;

    public Student(String name, double gpa)  {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getGpa(), this.getGpa());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}