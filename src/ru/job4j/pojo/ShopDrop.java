package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        if (index > 0) {
            Product[] buffer = new Product[products.length];
            for (int i = index; i < products.length; i++) {
                buffer[i - 1] = products[i];
                products[index] = null;
            }
        }
        if (index == 0) {
            products[index] = products[index + 1];
            products[index + 1] = null;
        }
        return products;
    }
}