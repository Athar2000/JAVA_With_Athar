
import java.util.*;
class Day8BinTree5 {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    private int countNodes(TreeNode node) {
        if (node == null)
            return 0;
        else
            return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public int countNodes() {
        return countNodes(root);
    }

    // Other methods to manipulate the binary tree
}
