package com.elena;

import java.util.ArrayList;
import java.util.List;

public class PeopleManager {
    private List<Person> persons;

    public PeopleManager() {
        this.persons = new ArrayList<>();
    }

    public void addPerson(Person p) {
        if (!persons.contains(p)) persons.add(p);
    }

    public void removePerson(Person p) {
        persons.remove(p);
    }

    public void printPersons() {
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
