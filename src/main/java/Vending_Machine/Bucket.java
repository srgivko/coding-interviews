package Vending_Machine;

public class Bucket<T, T1> {

    private T first;
    private T1 second;

    public Bucket(T first, T1 second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public T1 getSecond() {
        return this.second;
    }
}
