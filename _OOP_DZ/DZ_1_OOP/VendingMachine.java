package _OOP_DZ.DZ_1_OOP;

import java.util.ArrayList;

public class VendingMachine {
    public VendingMachine() { // конструктор по умолчанию
        products.add(new Product("Pivo", 78.0));
        products.add(new Product("Vino", 272.0));
        products.add(new Product("Liker", 89.5));

    }

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }

    public Product getProductByCost(Double cost) {
        for (Product product : products) {
            if (product.getCost().equals(cost))
                return product;
        }
        return null;
    }

    static ArrayList<Product> products = new ArrayList<>();

    // метод который вернет напиток
    public Drink getDrink(String name, Double cost, Double volume) {
        return new Drink(name, cost, volume);
    }

    // метод который вернет напиток и укажет с газом он или без
    public DrinkGas getDrinkgas(String name, Double cost, Double volume, String gas) {
        return new DrinkGas(name, cost, volume, gas);
    }

    // метод который вернет Шоколадку и её вес
    public Chocolate getChocolate(String name, Double cost, int netWeight) {
        return new Chocolate(name, cost, netWeight);
    }

}