package com.cydeo.lamda.apple_task;

import com.cydeo.lamda.apple_task.Apple;
import com.cydeo.lamda.apple_task.ApplePredicate;

public class AppleWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>200;
    }
}
