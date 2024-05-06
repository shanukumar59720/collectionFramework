import java.util.*;

public class p3Deque {
    public static void main(String[] args) {
        ArrayDeque dq = new ArrayDeque();
        dq.add(100);     
        dq.add("PW");
        dq.offer(500);
        dq.offerFirst(1);
        dq.offerLast(10);
        System.out.println(dq);
        dq.addFirst(10);
        dq.addLast(1000);
        System.out.println(dq);
        

        // LinkedList l1 = new LinkedList();
        // l1.add(10);
        // l1.add(20);
        // l1.add(30);
        // l1.add(40);

        // System.out.println(l1.get(2));
    }
}
