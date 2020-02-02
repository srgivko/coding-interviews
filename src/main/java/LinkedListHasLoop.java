import java.util.HashSet;

public class LinkedListHasLoop {

    public static void main(String[] args) {

        LinkedList.ListNode node = new LinkedList.ListNode("1");
        node.next = new LinkedList.ListNode("2");
        node.next.next = new LinkedList.ListNode("3");
        node.next.next.next = new LinkedList.ListNode("4");

        LinkedList linkedList = new LinkedList(node);

        LinkedList.ListNode node2 = new LinkedList.ListNode("12");
        node2.next = new LinkedList.ListNode("22");
        node2.next.next = new LinkedList.ListNode("32");
        LinkedList.ListNode loopNode = new LinkedList.ListNode("42");
        node2.next.next.next = loopNode;
        node2.next.next.next.next = new LinkedList.ListNode("52");
        node2.next.next.next.next.next = loopNode;
        LinkedList linkedList2 = new LinkedList(node2);

        System.out.println(linkedList.hasLoop());
        System.out.println(linkedList2.hasLoop());


        System.out.println(linkedList.isCyclic());
        System.out.println(linkedList2.isCyclic());
    }

    static class LinkedList {

        ListNode root;

        public LinkedList(ListNode root) {
            this.root = root;
        }

        public boolean hasLoop() {
            HashSet<ListNode> listNodes = new HashSet<>();
            ListNode node = root;
            while (node != null) {
                if (!listNodes.add(node)) {
                    return true;
                }
                node = node.next;
            }
            return false;
        }


        static class ListNode {
            ListNode next;
            String data;

            public ListNode(String data) {
                this.data = data;
            }
        }

        public boolean isCyclic() {
            ListNode fast = root;
            ListNode slow = root;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) {
                    return true;
                }
            }
            return false;
        }
    }
}
