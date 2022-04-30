public class RedBlackTree {
    Node root;
    static boolean RED = true;
    static boolean BLACK = false;

    public void instert(int data){
        Node node = root;
        Node parent = null;
        while (node!=root){
            if (data < node.data)
                node = node.left;
            else node = node.right;
        }
        Node newNode = new Node(data);
        newNode.color = RED;

        if (parent == null){
            this.root = newNode;
        }
    }
    public void print(Node n){

    }
    public void print(Node n){
        if (n == null) return;
        print(n.left);
        System.out.println(getColor(n));
        print(n.right);
    }

    public String getColor(Node n){
        if (n.color =RED) return n.data + " - red";
        else return n.data + " - black";
    }

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        tree.instert(5);
        tree.print();
    }
}
    class Node{
        int data;
        boolean color;
        Node parent,left,right;
        public Node(int data) {this.data = data;}

    }

