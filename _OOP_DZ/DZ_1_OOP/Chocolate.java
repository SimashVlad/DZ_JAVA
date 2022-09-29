package _OOP_DZ.DZ_1_OOP;

public class Chocolate extends Product {
    private int netWeight;

    public Chocolate(String name, Double cost, int netWeight) {
        super(name, cost);
        this.netWeight = netWeight;
    }

    @Override
    public String toString() {
        String res = String.format(" " + "Масса нетто: " + netWeight);
        return super.toString() + res;
    }
}
