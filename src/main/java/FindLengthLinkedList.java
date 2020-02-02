import java.util.Iterator;
import java.util.LinkedList;

public class FindLengthLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");
        System.out.println(linkedList.size());
        Iterator<String> iterator = linkedList.iterator();
        int size = 0;
        while (iterator.hasNext()) {
            size++;
            System.out.println(iterator.next());
        }
        System.out.println(size);
    }
}
