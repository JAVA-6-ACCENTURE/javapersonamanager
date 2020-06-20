package lv.laine;

import java.util.ArrayList;

public class PeopleManager {

    private ArrayList<Person> arrayOfPerson;

    public PeopleManager(ArrayList<Person> arrayOfPerson){
        this.arrayOfPerson = arrayOfPerson;

    }
    public void addPerson(Person person){
        this.arrayOfPerson.add(person);
    }
    public void deletePerson(Person person){
        this.arrayOfPerson.remove(person);
    }
    public void listToTerminal(){

    }
}
