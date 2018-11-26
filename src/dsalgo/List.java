package dsalgo;

import java.util.Scanner;

class List{
    Node head;
    class Node{
        int data;
        Node next;
        Node (int d){
            data= d;
            next=null;
        }
    }



    public void push(int new_node_data){
        Node new_node =  new Node(new_node_data);
        new_node.next = head;
        head= new_node;
    }

    public void deleteNode(int position){
        if(head == null)
            return;

        Node temp = head;

        if (position ==0){
            head= temp.next;
            return;
        }

        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;
        if(temp==null || temp.next == null)
            return;
        Node next = temp.next.next;
        temp.next = next;
    }

    public void displayList(Node node){
        Node tr = head;
        while(tr!=null){
            System.out.print(tr.data+" ");
            tr = tr.next;
        }
    }

    public Node reverse(Node head){
        Node curr= head;
        Node prev =null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }

    public Node middleEl(Node head){
        Node p1,p2;
        p1=p2=head;
        int i=0;

        while(p1.next!=null){
            if(i==0){
                p1=p1.next;
                i=1;
            }
            else if(i==1){
                p1=p1.next;
                p2=p2.next;
                i=0;
            }
        }
        return p2;
    }

    public int lengthEvenOrOdd(Node head){
        while(head!=null && head.next!=null)
            head = head.next.next;
        if(head==null)
            return 0;
        return 1;

    }

    public void palindromeList(){
        Node p1, p2;
        int i=0;
        p1=head;
        p2=head;
        while(p1.next!=null){
            if(i==0){
                p1=p1.next;
                i=1;
            }
            else if(i==1){
                p1=p1.next;
                p2=p2.next;
                i=0;
            }
        }
        p2= head;
        Node prev = null;
        Node next;
        while(p2!=null){
            next = p2.next;
            p2.next= prev;
            prev= p2;
            p2= next;
        }

    }

    public void bubbleSort() {
        int count = 0;
        Node current = head;
        while (current != null) {
            current = current.next;
            count++;
        }
        if (count > 1) {
            for (int i = 0; i < count; i++) {
                Node curr = head;
                Node n = head.next;
                for (int j = 0; j < count - 1; j++) {
                    if (curr.data > n.data) {
                        int temp = curr.data;
                        curr.data = n.data;
                        n.data = temp;
                    }
                    curr = n;
                    n = n.next;

                    displayList(n);
                }

            }
        }
    }


    public void setMiddleAsHead(){
        if(head ==null)
            return;
        Node p1= head;
        Node p2 = head;
        Node prev= null;
        while(p2!=null && p2.next!=null){
            prev= p1;
            p2=p2.next.next;
            p1=p1.next;
        }
        prev.next =prev.next.next;
        p1.next = head;
        head= p1;
        displayList(head);
    }

    public int countOccur(int sear){
        int count= 0;
        Node current = head;
        while(current!=null){
            if(current.data ==sear)
                count++;
            current = current.next;
        }
        return count;

    }

    public void nthNode(int n){
        int len = 0;
        Node current = head;
        while(current!=null)
        {
            current = current.next;
            len++;
        }
        if(len<n)
            return;

        current =head;
        for (int i=1;i<len-n+1;i++)
            current = current.next;

        System.out.println("position of entered node from last " +current.data);
    }

    public void swapPairwise(Node n){
        Node current = head;
        while(current!=null && current.next!=null){
            int k = current.data;
            current.data = current.next.data;
            current.next.data = k;
            current = current.next.next;
        }
        displayList(current);
    }

    public void moveLastToFirst(){
        if(head == null || head.next==null)
            return;

        Node secLast = null;
        Node last  = head;
        while(last.next!=null){
            secLast = last;
            last = last.next;
        }
        secLast.next=null;
        last.next= head;
        head = last;
        displayList(head);

    }

    public void insertAtMiddle(Node node){

    }


    /*public Node modularNode(Node head, int value){
        Node modNode=null;
        int i  =0;
        if(value<=0)
            return null;
        for(i=0;i<value;i++) {
            if (head != null)
                head = head.next;
            else
                return null;
        }
        while (head!=null) {
            modNode = modNode.next;
            head = head.next;
        }
        return modNode;

    }
*/

    public static void main(String[] args){

        List ll = new List();
        Scanner in  = new Scanner(System.in);
        System.out.println("size of ll?");
        int s = in.nextInt();
        System.out.println("Enter "+s+" Nodes");

        for (int i=0 ; i<s;i++) {
            int n = in.nextInt();
            ll.push(n);
        }
        //ll.push(5);
        //ll.push(6);
        //ll.push(9);

        System.out.println("ll is");
        ll.displayList(ll.head);


        Node n= ll.middleEl(ll.head);
        System.out.println("middle element is :"+n.data);


        int c=ll.lengthEvenOrOdd(ll.head);
        if(c==1)
            System.out.println("Odd length");
        else
            System.out.println("Even length");


        /*System.out.println("Enter the value of k for modular node");
        int k =in.nextInt();
        Node mo = ll.modularNode(ll.head,k);
        System.out.println("modular node is " +mo.data);
        */

        System.out.println("Pairwise swap elements ");
       ll.swapPairwise(ll.head);

        System.out.println("enter the element to know its occurrences");
        int z = in.nextInt();
        int co = ll.countOccur(z);
        System.out.println("ocurrences of "+z +" are "+co);

        System.out.println("enter the nth node ");
        int nth = in.nextInt();
        ll.nthNode(nth);

        System.out.println("Move last to first");
        ll.moveLastToFirst();

        System.out.println("Move middle element to first");
        ll.setMiddleAsHead();

        System.out.println("Sorted linked list is: ");
        ll.bubbleSort();

        System.out.println("\nenter position of node to be deleted");
        int d = in.nextInt();
        ll.deleteNode(d);

        System.out.println("ll after deletion at position " + d +" entered is");
        ll.displayList(ll.head);

        Node p=ll.reverse(ll.head);
        System.out.println("\nreverse of ll is ");
        while(p!=null){
            System.out.println(p.data+" ");
            p=p.next;
        }



    }
}
