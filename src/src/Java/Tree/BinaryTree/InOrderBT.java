package Java.Tree.BinaryTree;

public class InOrderBT {
    Node root;

    InOrderBT() {
        root = null;
    }

    public static void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + "->");

    }

    public static void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + "->");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + "->");
        inOrder(node.right);
    }

    private static Node createTree() {
        InOrderBT tree = new InOrderBT();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("InOrder:");
        inOrder(tree.root);
        System.out.println(" ");
        System.out.println("PreOrder:");
        preOrder(tree.root);
        System.out.println(" ");
        System.out.println("PostOrder:");
        postOrder(tree.root);
        return null;
    }

    public static void main(String[] args) {
        Node root = createTree();
        inOrder(root);
        preOrder(root);
    }
}

