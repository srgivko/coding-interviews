package Vending_Machine;

public enum Item {

    PEPSI("Pepsi", 25), COCA("Coca", 10), SODA("soda", 5);

    private String name;
    private int cost;

    private Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public int getCost() {
        return this.cost;
    }
}
