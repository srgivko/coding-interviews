import java.util.Stack;

public class PreOrderTraversalTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        BinaryTree.TreeNode root = new BinaryTree.TreeNode("1");
        binaryTree.root = root;
        root.left = new BinaryTree.TreeNode("2");
        root.left.left = new BinaryTree.TreeNode("3");
        root.left.right = new BinaryTree.TreeNode("4");
        root.right = new BinaryTree.TreeNode("5");
        root.right.left = new BinaryTree.TreeNode("6");
        root.right.right = new BinaryTree.TreeNode("7");
        binaryTree.preOrder();
        System.out.println();
        binaryTree.preOrderWithoutRecursive();
        System.out.println();
        binaryTree.inOrder();
        System.out.println();
        binaryTree.inOrderWithoutRecursive();
    }

    public static class BinaryTree {

        TreeNode root;

        public void preOrder() {
            preOrder(root);
        }

        public void inOrder() {
            inOrder(root);
        }

        private void inOrder(TreeNode current) {
            if (current == null) return;
            if (current.left != null) inOrder(current.left);
            System.out.printf("%s ", current.data);
            if (current.right != null) inOrder(current.right);
        }

        public void inOrderWithoutRecursive() {
            Stack<TreeNode> nodes = new Stack<TreeNode>();
            TreeNode currentNode = this.root;
            while (!nodes.empty() || currentNode != null) {
                if (currentNode != null) {
                    nodes.push(currentNode);
                    currentNode = currentNode.left;
                } else {
                    TreeNode pop = nodes.pop();
                    System.out.printf("%s ", pop.data);
                    currentNode = pop.right;
                }
            }
        }

        private void preOrder(TreeNode current) {
            if (current == null) return;
            System.out.printf("%s ", current.data);
            if (current.left != null) preOrder(current.left);
            if (current.right != null) preOrder(current.right);
        }

        public void preOrderWithoutRecursive() {
            Stack<TreeNode> nodes = new Stack<TreeNode>();
            nodes.push(this.root);
            while (!nodes.empty()) {
                TreeNode node = nodes.pop();
                System.out.printf("%s ", node.data);
                if (node.right != null) nodes.push(node.right);
                if (node.left != null) nodes.push(node.left);
            }
        }

        public static class TreeNode {
            String data;
            TreeNode left, right;

            public TreeNode(String data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }

            boolean isLeaf() {
                return left == null ? right == null : false;
            }
        }
    }
}
