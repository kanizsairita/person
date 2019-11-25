package com.company;

import java.util.*;

import java.io.FileNotFoundException;


public class Main {

    private  static List<Person> sortedPeople;


    public static void main(String[] args) throws FileNotFoundException {

        sortedPeople=Reader.read("src/us-500.csv");
        Set<Person> sortedPeopleSet=new TreeSet<>();
        sortedPeopleSet.addAll(sortedPeople);


        System.out.println("A Chicago-ban élő emberek email-címei:");
        printEmails("Chicago");

    }

    public static void printEmails(String city){

        List<Person> cityList= Filter.cityFilter(city, sortedPeople);
        for (Person person : cityList) {
            System.out.println(person.getEmail());
        }
    }


}