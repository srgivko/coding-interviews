package Vending_Machine;

import java.util.HashMap;
import java.util.Map;

public class Inventory<T> {

    private Map<T, Integer> iventory = new HashMap<T, Integer>();

    public int getQuantity(T item) {
        return iventory.get(item);
    }

    public void add(T item) {
        int count = this.getQuantity(item);
        iventory.put(item, ++count);
    }

    public void deduct(T item) {
        if (hasItem(item)) {
            int count = this.getQuantity(item);
            iventory.put(item, --count);
        }
    }

    public void reset() {
        iventory.clear();
    }

    public void put(T item, int quantity) {
        iventory.put(item, quantity);
    }

    public boolean hasItem(T item) {
        return getQuantity(item) > 0;
    }

}
