public class FindTheerdElementFromTheTail {
    public static void main(String[] args) {
        FindTheerdElementFromTheTail.LinkedList.ListNode node = new FindTheerdElementFromTheTail.LinkedList.ListNode("1");
        node.next = new FindTheerdElementFromTheTail.LinkedList.ListNode("2");
        node.next.next = new FindTheerdElementFromTheTail.LinkedList.ListNode("3");
        node.next.next.next = new FindTheerdElementFromTheTail.LinkedList.ListNode("4");
        node.next.next.next.next = new FindTheerdElementFromTheTail.LinkedList.ListNode("5");
        FindTheerdElementFromTheTail.LinkedList linkedList = new FindTheerdElementFromTheTail.LinkedList(node);
        FindTheerdElementFromTheTail.LinkedList.ListNode current = linkedList.getRoot();
        FindTheerdElementFromTheTail.LinkedList.ListNode threerd = linkedList.getRoot();
        int i = 0;
        while (current.next != null) {
            i++;
            if (i > 2) {
                threerd = threerd.next;
            }
            current = current.next;
        }
        System.out.println(threerd.data);
    }

    static class LinkedList {

        private FindTheerdElementFromTheTail.LinkedList.ListNode root;

        public LinkedList(FindTheerdElementFromTheTail.LinkedList.ListNode root) {
            this.root = root;
        }

        public FindTheerdElementFromTheTail.LinkedList.ListNode getRoot() {
            return this.root;
        }

        static class ListNode {
            FindTheerdElementFromTheTail.LinkedList.ListNode next;
            String data;

            public ListNode(String data) {
                this.data = data;
            }
        }

    }
}
