package Vending_Machine;

public enum Coin {

    PENNY(1), NICKLE(5), DINE(10), QUARTER(25);

    private int denomination;

    private Coin(int denomination) {
        this.denomination = denomination;
    }

    public int getDenomination() {
        return this.denomination;
    }
}
