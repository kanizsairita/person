package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

    public static ArrayList<Person> read(String path) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));
        //címsor átugrása
        sc.nextLine();
        ArrayList<Person> people = new ArrayList<>();
        while (sc.hasNextLine()){
            String[] lineparts = sc.nextLine().split(",");
            String name = lineparts[0] + " " + lineparts[1];
            String city = lineparts[4];
            String email = lineparts[10];
            people.add(new Person(name, city, email));
        }
        return people;
    }


}
