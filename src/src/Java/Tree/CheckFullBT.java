package Java.Tree;

public class CheckFullBT {
    static Node root;

    public static boolean isFullBinaryTree(Node node) {
        if (node == null)
            return true;
        if (node.left.left == null && node.right.right == null)
            return true;
        if ((node.left.left != null) && (node.right.right != null))
            return isFullBinaryTree(node.left.left) && isFullBinaryTree(node.right.right);
        return false;
    }

    private static Node createTree() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        return null;
    }

    public static void main(String[] args) {
        Node root = createTree();
        isFullBinaryTree(root);
        System.out.println(isFullBinaryTree(root));

    }
}
