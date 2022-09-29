package _OOP_DZ.DZ_1_OOP;

public class DrinkGas extends Drink {
    private String gas;

    public DrinkGas(String name, Double cost, Double volume, String gas) {
        super(name, cost, volume);
        this.gas = gas;
    }

    @Override
    public String toString() {
        String res = String.format(" " + gas);
        return super.toString() + res;
    }
}
