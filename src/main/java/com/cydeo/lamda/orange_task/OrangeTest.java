package com.cydeo.lamda.orange_task;

import com.cydeo.lamda.Color;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(100, Color.RED));
        inventory.add(new Orange(200, Color.GREEN));
        inventory.add(new Orange(50, Color.RED));

        OrangeFormatter orangeLamda = orange -> "An orange " + orange.getWeight() + "g";
        prettyPrintOrange(inventory, orangeLamda);


        OrangeFormatter fancyFormatter = orange -> {
            String str = orange.getWeight() > 200 ? "Heavy" : "Light";
            return "A " + str + " " + orange.getColor() + " orange";
        };
        prettyPrintOrange(inventory, fancyFormatter);

    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter format) {

        for (Orange orange : inventory) {
            String output = format.accept(orange);
            System.out.println(output);
        }
    }
}
