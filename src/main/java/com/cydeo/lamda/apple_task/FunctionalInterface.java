package com.cydeo.lamda.apple_task;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterface {


    public static void main(String[] args) {

        System.out.println("*****************PREDICATE***************");


        Predicate<Integer> lessThan = i -> i<18;
        System.out.println(lessThan.test(20));


        System.out.println("*****************CONSUMER***************");
        Consumer<Integer> display = i-> System.out.println("Consumer " + i);
        display.accept(20);



    }
}
