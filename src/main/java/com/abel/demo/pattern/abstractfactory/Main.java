package com.abel.demo.pattern.abstractfactory;


/**
 * Created by abel.chan on 17/6/3.
 */
public class Main {
    public static void main(String[] args) {

        try {
            ACreator a = new CreatorA();
            System.out.println("creator");
            a.printA("a-A-1");
            System.out.println("product");
            IProductA product = a.creatorA("a-a-2");
            product.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
