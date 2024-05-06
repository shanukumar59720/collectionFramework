import java.util.*;

public class p1ArrayList {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);

        System.out.println(al1);
        System.out.println(al1.contains(200));
        int index = al1.indexOf(300);
        System.out.println(index);
        System.out.println(al1.size());

        al1.ensureCapacity(10);
        System.out.println(al1);
        System.out.println(al1.size());

        al1.trimToSize();
        System.out.println(al1.size()); 
        al1.clear();
        System.out.println(al1);

        List al = new ArrayList();
        al.add(100);
        System.out.println(al);



        // ArrayList al2 = new ArrayList();

        // al2.add("PW skill");
        // al2.add(1);
        // al2.add("java");
        // al2.add(1.2);

        // System.out.println(al2);
        // al2.add(true);
        // System.out.println(al2);

        // al2.addAll(al1);
        // System.out.println(al2);

        // al2.add(2, "PW");
        // System.out.println(al2);

        for (int i = 0; i < al1.size(); i++) {
            Object ob = al1.get(i);
            System.out.print(ob + ", ");
        }
    }
}