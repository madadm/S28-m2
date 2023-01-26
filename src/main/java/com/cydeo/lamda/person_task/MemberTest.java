package com.cydeo.lamda.person_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest
{
    public static void main(String[] args) {

        Person p1 = new Person( "mike", 35, Gender.MALE);
        Person p2 = new Person( "ozzy", 25, Gender.MALE);
        Person p3 = new Person( "olya", 37, Gender.FEMALE);
        Person p4 = new Person( "tanya", 45, Gender.MALE);

        List<Person> personList = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));

        print(personList, p->p.getAge()>25);


    }

    private static void print(List<Person> personList, CheckMember check){
        List<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if(check.test(person)){
                result.add(person);
            }
        }
        System.out.println(result);
    }
}
