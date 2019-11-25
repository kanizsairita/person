package com.company;

import java.util.Set;
import java.util.TreeSet;
import java.io.FileNotFoundException;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Set<Person> sortedPeople = new TreeSet<>();

        sortedPeople.addAll(Reader.read("src/us-500.csv"));


    }
}