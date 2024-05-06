import java.util.*;

public class p2LinkedList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(100);
        l1.add(200);
        l1.add(300);
        System.out.println(l1);

        LinkedList l2 = new LinkedList();
        l2.add("PW skill");
        l2.add(1);
        l2.add(112);
        System.out.println(l2);

        LinkedList l3 = new LinkedList();
        l3.add(10);
        l3.add(20);
        l3.add(300);

        System.out.println(l3);

        l3.addFirst("Pw skills");
        l3.addLast("Java");
        System.out.println(l3);
        System.out.println(l3.peek());
        System.out.println(l3);
        System.out.println(l3.poll());
        System.out.println(l3);


    }
}
