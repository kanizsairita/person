package com.company;

import java.util.ArrayList;
import java.util.List;

public class Filter {


    public static ArrayList<Person> cityFilter(String city, List<Person> people){
        ArrayList<Person> locals = new ArrayList<>();
        for(Person p : people){
            if(p.getCity().equals(city)){
                locals.add(p);
            }
        }
        return locals;
    }
}
