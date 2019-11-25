package com.company;

import java.util.Comparator;

public class Person implements Comparable<Person>{

    private String name;
    private String city;
    private String email;

    public Person(String name, String city, String email) {
        this.name = name;
        this.city = city;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.getName());
    }
}
