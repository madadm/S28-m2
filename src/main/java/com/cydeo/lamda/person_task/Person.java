package com.cydeo.lamda.person_task;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {
    private String name;
    private int age;
    private Gender gender;
   // private String email;
}
