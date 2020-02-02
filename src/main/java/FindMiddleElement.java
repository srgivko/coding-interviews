public class FindMiddleElement {

    public static void main(String[] args) {
        FindMiddleElement.LinkedList.ListNode node = new FindMiddleElement.LinkedList.ListNode("1");
        node.next = new FindMiddleElement.LinkedList.ListNode("2");
        node.next.next = new FindMiddleElement.LinkedList.ListNode("3");
        node.next.next.next = new FindMiddleElement.LinkedList.ListNode("4");
        node.next.next.next.next = new FindMiddleElement.LinkedList.ListNode("5");
        FindMiddleElement.LinkedList linkedList = new FindMiddleElement.LinkedList(node);
        LinkedList.ListNode current = linkedList.getRoot();
        LinkedList.ListNode middle = linkedList.getRoot();
        int i = 0;
        while (current.next != null) {
            current = current.next;
            i++;
            if (i % 2 == 0){
                middle = middle.next;
            }
        }
        System.out.println(middle.data);
    }

    static class LinkedList {

        private FindMiddleElement.LinkedList.ListNode root;

        public LinkedList(FindMiddleElement.LinkedList.ListNode root) {
            this.root = root;
        }

        public ListNode getRoot() {
            return this.root;
        }

        static class ListNode {
            FindMiddleElement.LinkedList.ListNode next;
            String data;

            public ListNode(String data) {
                this.data = data;
            }
        }

    }
}
