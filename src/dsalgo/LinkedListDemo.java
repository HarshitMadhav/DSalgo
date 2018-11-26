package dsalgo;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.add("F");
        ll.add("madhav");
        ll.addFirst("A");
        System.out.println("ll insertion"+ll);

        ll.remove("F");
        ll.remove(1);
        System.out.println("ll deletion "+ll);


    }
}
