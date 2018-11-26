package dsalgo;

import java.util.LinkedList;
import java.util.Scanner;

public class Prog {

    public static void main(String args[]){

        LinkedList list = new LinkedList();
        Scanner in1 = new Scanner(System.in);
        System.out.println("enter number of nodes");
        int no = in1.nextInt();

        System.out.println("enter node");
            Scanner in = new Scanner(System.in);
          while(!in.hasNextInt()) in.next();


            for(int i=0; i< no;i++) {
                int n = in.nextInt();
                list.add(n);
                }
        System.out.println("ll insertion" + list);


            Scanner r =  new Scanner (System.in);
        System.out.println("enter node position to delete");
        int ro = r.nextInt();
        list.remove(ro);

        System.out.println("ll deletion"+list);


        }
    }

