import java.util.*;

public class p8Iterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add("java");
        al.add(400);
        al.add("pw");
        al.add(600);
        al.add(500);
        System.out.println(al);

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            // Integer i  = (Integer)itr.next(); 
            System.out.println(itr.next());
        }

        ListIterator litr = al.listIterator(al.size());
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}
