package _OOP_DZ.DZ_1_OOP;

// Класс напиток
public class Drink extends Product {
    private Double volume;

    public Drink(String name, Double cost, Double volume) {
        super(name, cost);
        this.volume = volume;
    }

    @Override
    public String toString() {
        String res = String.format(" " + "Объём: " + volume);
        return super.toString() + res;
    }
}
