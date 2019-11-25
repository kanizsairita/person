package com.company;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Person> sortedPeople=new TreeSet<>();

        sortedPeople.addAll(Reader.read());



    }
}
