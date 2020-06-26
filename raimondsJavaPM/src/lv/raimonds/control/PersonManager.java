package lv.raimonds.control;

import lv.raimonds.data.Person;

import java.util.ArrayList;

public class PersonManager {
    private ArrayList<Person> arrayOfPerson;

    public PersonManager(ArrayList<Person> arrayOfPerson) {
        this.arrayOfPerson = arrayOfPerson;
    }

    public void addPerson(Person person){
        this.arrayOfPerson.add(person);
    }

    //contains
    public void deletePerson(Person person){
        this.arrayOfPerson.remove(person);
    }

    public void listToTerminal(){
        System.out.println(arrayOfPerson);
    }


}
