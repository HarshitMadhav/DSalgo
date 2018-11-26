package dsalgo;

class test{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next= null;
        }
    }

    public void push(int new_node){
        Node new_data_node = new Node(new_node);
        new_data_node.next = head;
        head = new_data_node;
    }

    public void printList(){
        Node tnode = head;
        while (tnode!=null)
        {
            System.out.println(tnode.data+"");
            tnode =tnode.next;
        }
    }
    public static void main(String[] args){
        test testee = new test();
        testee.push(2);
        testee.push(3);
        System.out.println("list is ");
        testee.printList();
    }
}