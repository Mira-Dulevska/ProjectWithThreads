package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ProductThread extends Thread{
    private String name;
    public ProductThread(String name){
        super();
        this.name=name;
    }

    public ProductThread() {
    }

    public void run(String name, PriorityQueue<Product> pq){

        try {
            File file = new File("ThreadsExercises/" + name + ".txt");
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                String name1 = input.next();
                String type = input.next();
                double price = input.nextDouble();
                Product product = new Product(name1, type, price);
                pq.add(product);
            }

            input.close();


        } catch (Exception e) {
            System.out.println("An error occurred!");
        }
    }
}
