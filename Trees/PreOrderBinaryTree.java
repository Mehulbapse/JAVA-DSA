package Trees;

class Node {
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

class PreOrderBinaryTree {
    // Root of Binary Tree
    Node root;

    PreOrderBinaryTree() { root = null; }

    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(Node node)
    {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.key + " ");

        /* then recur on left subtree */
        printPreorder(node.left);

        /* now recur on right subtree */
        printPreorder(node.right);
    }

    // Wrappers over above recursive functions
    void printPreorder() { printPreorder(root); }

    // Driver code
    public static void main(String[] args)
    {
        PreOrderBinaryTree tree = new PreOrderBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Function call
        System.out.println(
                "Preorder traversal of binary tree is ");
        tree.printPreorder();
    }
}