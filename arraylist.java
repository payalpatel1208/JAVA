import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(2);
        list.add(9);
        list.add(20);
        list.add(22);
        list.add(23);
        System.out.println(list);
        list.set(0, 1);
        list.set(2, 5);
        list.set(3, 8);
        System.out.println("Modify array list is");
        System.out.println(list);
    }
}
