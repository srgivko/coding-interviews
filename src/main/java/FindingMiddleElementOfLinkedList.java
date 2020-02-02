import java.util.Iterator;
import java.util.LinkedList;

public class FindingMiddleElementOfLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new LinkedList.Node("1"));
        linkedList.add(new LinkedList.Node("2"));
        linkedList.add(new LinkedList.Node("3"));
        linkedList.add(new LinkedList.Node("4"));
        linkedList.add(new LinkedList.Node("5"));
        java.util.LinkedList<String> stringLinkedList = new java.util.LinkedList<String>();
        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.add("3");
        stringLinkedList.add("4");
        stringLinkedList.add("5");
        stringLinkedList.add("6");
        stringLinkedList.add("7");
        stringLinkedList.add("8");
        stringLinkedList.add("9");
        System.out.println(findMiddleElement(linkedList));
        System.out.println(findMiddleElement2(stringLinkedList));
    }

    private static String findMiddleElement2(java.util.LinkedList<String> stringLinkedList) {
        Iterator<String> current = stringLinkedList.iterator();
        Iterator<String> middle = stringLinkedList.iterator();
        String middleNode = "";
        int length = 0;
        while (current.hasNext()) {
            length++;
            current.next();
            if (length % 2 == 0) middleNode = middle.next();
        }
        if (length % 2 == 1) middleNode = middle.next();
        return middleNode;
    }

    private static LinkedList.Node findMiddleElement(LinkedList linkedList) {
        LinkedList.Node head = linkedList.head();
        LinkedList.Node current = head;
        LinkedList.Node middle = head;
        int lenght = 0;
        while (current.next() != null) {
            lenght++;
            if (lenght % 2 == 0) middle = middle.next();
            current = current.next();
        }
        if (lenght % 2 == 1) {
            middle = middle.next();
        }
        System.out.println(lenght);
        return middle;
    }


    static class LinkedList {
        private Node head;
        private Node tail;

        public LinkedList() {
            this.head = new Node("head");
            tail = head;
        }

        public Node head() {
            return head;
        }

        public void add(Node node) {
            tail.next = node;
            tail = node;
        }

        public static class Node {
            private Node next;
            private String data;

            public Node(String data) {
                this.data = data;
            }

            public String data() {
                return data;
            }

            public void setData(String data) {
                this.data = data;
            }

            public Node next() {
                return next;
            }

            public void setNext(Node next) {
                this.next = next;
            }

            public String toString() {
                return this.data;
            }
        }
    }
}

