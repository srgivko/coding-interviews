public class TreeToDll {

    public static void main(String[] args) {
        BinarySearchTree<Integer> integerBinarySearchTree = new BinarySearchTree<>();
        integerBinarySearchTree.insert(10);
        integerBinarySearchTree.insert(13);
        integerBinarySearchTree.insert(17);
        integerBinarySearchTree.insert(15);
        integerBinarySearchTree.insert(16);
        integerBinarySearchTree.insert(18);
        integerBinarySearchTree.insert(9);
    }

    public static class Contex {
        public TreeNode head;
        public TreeNode prev;
    }

    public void treeToDllRecursion(TreeNode root, Contex contex) {
        if (root == null) return;
        if (root.getLeft() != null) {
            treeToDllRecursion(root.getLeft(), contex);
        }
        process(root, contex);
        if (root.right != null) {
            treeToDllRecursion(root.getRight(), contex);
        }
    }

    private void process(TreeNode root, Contex contex) {
        if (contex.prev == null) {
            contex.head = root;
        } else {
            contex.prev.setRight(root);
        }
        root.setLeft(contex.prev);
        contex.prev = root;
    }


    public static class TreeNode<T> {
        private T value;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(T value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public T getValue() {
            return this.value;
        }

        public TreeNode getRight() {
            return this.right;
        }

        public TreeNode getLeft() {
            return this.left;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public void setRight(TreeNode node) {
            this.right = node;
        }

        public void setLeft(TreeNode node) {
            this.left = node;
        }
    }

    public static class BinarySearchTree<T> {

        private TreeNode<T> root;

        public void BinarySearchTree() {
            root = null;
        }

        public void insert(int value) {
            this.root = insertNode(this.root, value);
        }

        private TreeNode insertNode(TreeNode root, int value) {
            if (root == null) {
                //if this node is root of tree
                root = new TreeNode(value);
            } else {
                if ((int) root.getValue() > value) {
                /*If root is greater than value,
                node should be added to left subtree */
                    root.setLeft(insertNode(root.getLeft(), value));
                } else {
                /*If root is less than value,
                node should be added to right subtree */
                    root.setRight(insertNode(root.getRight(), value));
                }
            }
            return root;
        }

        public TreeNode getRoot() {
            return this.root;
        }

        public void setRoot(TreeNode node) {
            this.root = node;
        }
    }
}
