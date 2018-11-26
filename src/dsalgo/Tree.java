package dsalgo;

import java.util.*;


class Node {
    int key;
    Node left, right;
    public Node(int item) {
    key =item;
    left = right =null;
    }
}

public class Tree{

    Node root;

    Tree(){
        root = null;
    }

    public void inorder(Node node){
        if (node ==null){
            return;
        }
        inorder(node.left);
        System.out.print(node.key+"");
        inorder(node.right);
    }

    public void postorder(Node node){
        if (node ==null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.key+" ");
    }

    public void preorder(Node node){
        if (node == null)
            return;
        System.out.print(node.key+" ");
        preorder(node.left);
        preorder(node.right);
    }

    void inorder(){
        inorder(root);
    }

    void postorder(){
        postorder(root);
    }

    void preorder(){
        preorder(root);
    }

    //level order starts
    public void printLevelOrder(){
        int h = height(root);
        int i;
        for(i=0;i<=h;i++){
            printGivenLevel(root,i);
        }

    }

    int height(Node root){
        if (root == null)
            return 0;
        else{
            int lheight = height(root.left);
            int rheight = height(root.right);
                if(lheight>rheight)
                    return lheight+1;
                    else
                        return (rheight+1);

        }
    }

    public void printGivenLevel(Node root, int level){
        if(root == null){
            return;
        }
        if(level ==1)
            System.out.println(root.key+" ");
        else if(level>1){
            printGivenLevel(root.left,level-1);
            printGivenLevel(root.right, level-1);
        }
    }
    // level order ends

    public int maxElement(Node root) {
        int max=0;
        if (root != null) {
            int leftMax = maxElement(root.left);
            int rightMax = maxElement(root.right);

            if (leftMax > rightMax)
                max= leftMax;
                else max =  rightMax;
            if(root.key>max)
                max= root.key;

        }
            return max;

        }

    int maxElement(){
        return maxElement(root);

    }

    public void searchElement(Node root, int data){
       if(root.key == data) {
           System.out.println("yes node is present " + data);
       }

        else {
           System.out.println("Not a node in tree");
       }
    }

    public int vertSumLeft(Node root){
        int sum=0;
        if (root== null)
            return 0;
        else
            sum= root.key+vertSumLeft(root.left);
        return sum;
    }

    public int vertSumRight(Node root){
        int sum=0;
        if(root==null)
            return 0;
        else
            sum= root.key+vertSumRight(root.right);
        return sum;
    }

    public int sizeTree(Node root){

        if(root == null)
            return 0;
        else
            return (sizeTree(root.left)+1+sizeTree(root.right));

    }
    int sizeTree(){
        return  sizeTree(root);
    }

    public void deleteTree(Node root){
        root = null;

    }

    public int heightTree(Node root){
        if(root==null)
            return 0;
        int lDepth=heightTree(root.left);
        int rDepth=heightTree(root.right);
        return (lDepth>rDepth)? lDepth+1:rDepth+1;

    }

    public int diameterTree(Node root){
        int l,r;
        int diameter=0;
        if(root==null)  return 0;
        l= diameterTree(root.left);
        r= diameterTree(root.right);
        if(l+r>diameter)
            diameter = l+r;
        return Math.max(l,r)+1;
    }

    public int sumTreeNodes(Node root){
        if(root==null)
            return 0;
        else
            return (root.key+sumTreeNodes(root.left)+sumTreeNodes(root.right));
    }

   /* public void insertNode(Node root, int data){
        if(root==null)
            root= new Node(data);
        else insertHelper(root,data);
        System.out.println(" "+root);

    }

    private void insertHelper(Node root, int data){
       if(root.key>=data) {
           if (root.left == null){
               root.left = new Node(data);}
           else
           {insertHelper(root.right, data);}

       }else {
           if(root.right==null){
               root.right=new Node(data);
           }else{
               insertHelper(root.right,data);
           }
       }
    }
*/

        public static void main (String args[]){

            Tree tree = new Tree();
            tree.root = new Node(5);
            tree.root.left = new Node(6);
            tree.root.left.left = new Node(7);
            tree.root.left.left.left = new Node(8);
            tree.root.left.left.right = new Node(9);

            tree.root.right = new Node(10);
            tree.root.right.left = new Node(11);
            tree.root.right.left.right = new Node(12);

            tree.root.right.right = new Node(13);
            tree.root.right.right.right = new Node(14);
            tree.root.right.right.right.left = new Node(15);

            tree.root.right.right.right.left.left = new Node(16);

            tree.root.right.right.right.left.right = new Node(17);

            tree.root.right.right.right.right = new Node(18);

            tree.root.right.right.right.right.left = new Node(19);
            tree.root.right.right.right.right.right = new Node(20);


            System.out.println("inorder is: ");
            tree.inorder();
            System.out.println("postorder is:");
            tree.postorder();
            System.out.println("preorder is :");
            tree.preorder();

            System.out.println("Level order traversal is:");
            tree.printLevelOrder();

            Random random = new Random();
            int n = random.nextInt(100);
            System.out.println("random no  is ---" + n);

            Scanner in = new Scanner(System.in);
            System.out.println("enter string");
            String inp = in.nextLine();

            System.out.println("Hello! " + inp);

            int c = tree.maxElement();
            System.out.println("max element is :" +c);

            //Scanner ina= new Scanner(System.in);
            System.out.println("enter node to check it exists in tree");
            int a = in.nextInt();
            tree.searchElement(tree.root,a);

            int size = tree.sizeTree();
            System.out.println("size of tree is " +size);


            //System.out.println("enter node to insert");
            //int ins = in.nextInt();
            //tree.insertNode(tree.root, ins);
            //System.out.println("");
            //System.out.print("tree is " + tree);
        /*Scanner in = new Scanner(System.in);
        System.out.println("enter no of nodes");
        int n = in.nextInt();
        System.out.println("enter nodes");
        for (int i =0 ;i<n; i++){
            int ins =  in.nextInt();

        }*/

        tree.deleteTree(tree.root);
        int depth = tree.heightTree(tree.root);
        System.out.println("depth or height is " +depth);

        int dia = tree.diameterTree(tree.root);
        System.out.println("diameter is "+ dia);


        int sumNodes =  tree.sumTreeNodes(tree.root);
        System.out.println("sum of all nodes is "+ sumNodes);

        double calc = Math.pow(2,size)-size;
        System.out.println("max possible comb possible : "+calc);

        int suml = tree.vertSumLeft(tree.root);
        System.out.println("vertical left sum is "+ suml);

        int sumr = tree.vertSumRight(tree.root);
        System.out.println("vertical right sum is "+ sumr);

        //int vsum = tree.vertNodesSum(tree.root);
        //System.out.println("vertical node sum is "+ vsum);

        //System.out.println("enter -1 for left or 1 for right");
        //int lorSum = in.nextInt();
        //tree.vertNodesSum(tree.root, lorSum);
        }

    }