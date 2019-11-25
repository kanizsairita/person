package com.company;

import java.util.*;

import java.io.FileNotFoundException;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        List<Person> sortedPeople=Reader.read("src/us-500.csv");
        Set<Person> sortedPeopleSet=new TreeSet<>();
        sortedPeopleSet.addAll(sortedPeople);


        System.out.println("A Chicago-ban élő emberek email-címei:");
        List<Person> chicagoList= Filter.cityFilter("Chicago", sortedPeople);
        for (Person person : chicagoList) {
            System.out.println(person.getEmail());
        }


    }



}