import java.lang.ref.WeakReference;

public class Garbage_Collection {
    public static void main(String[] args) {


        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Apple", "16 Pro Max"));
        System.out.println(phoneWeakReference.get());
        System.gc();
       try{
           Thread.sleep(10000);

       }catch (Exception e){
       }
        System.out.println(phoneWeakReference.get());

    }
}


class Phone{
    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + '}';
    }
}
