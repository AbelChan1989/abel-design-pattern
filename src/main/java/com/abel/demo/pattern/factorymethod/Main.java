package com.abel.demo.pattern.factorymethod;

/**
 * Created by abel.chan on 17/6/3.
 */
public class Main {
    public static void main(String[] args) {

        try {
            ACreator a = new CreatorA();
            System.out.println("creator");
            a.print("a-b");
            System.out.println("product");
            IProduct product = a.creator("a-a");
            product.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
