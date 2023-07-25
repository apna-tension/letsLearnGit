import java.util.*;
public class iteratorList {
    public static void main(String[] args) {
        // System.out.println("Java");
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int num = it.next();
            System.out.print(num + " ");
            // it.next();
            if (num % 2 == 1) it.remove();
        }
        System.out.println();
        System.out.println(list);
    }
}