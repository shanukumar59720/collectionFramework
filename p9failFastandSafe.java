import java.util.*;
import java.util.concurrent.*;

public class p9failFastandSafe {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add("java");
        al.add(400);
        al.add("pw");
        al.add(600);
        al.add(500);
        System.out.println(al);

        // fail Fast
        // Iterator itr = al.iterator();
        // while (itr.hasNext()) {
        // System.out.println(itr.next());
        // al.add(100);
        // }

        // fail safe
        CopyOnWriteArrayList al1 = new CopyOnWriteArrayList();
        al1.add(100);
        al1.add("java");
        al1.add(400);
        al1.add("pw");
        al1.add(600);
        al1.add(500);
        System.out.println(al1);

        Iterator itr1 = al1.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
            al1.add(100);
        }

    }
}