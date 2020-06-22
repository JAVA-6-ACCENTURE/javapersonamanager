package lv.lauma.control;

import lv.lauma.data.Person;

import java.util.ArrayList;

public class PeopleManager {
    private ArrayList<Person> arrayOfPerson; //saglabā masīva sarakstā Person

    //izveido konstruktoru
    public PeopleManager(ArrayList<Person> arrayOfPerson) {
        this.arrayOfPerson = arrayOfPerson;
    }

    //pievieno personu
    public void addPerson(Person person){
        this.arrayOfPerson.add(person);
    }

    //dzēst personu
    public void deletePerson(Person person){
        this.arrayOfPerson.remove(person);
    }

    public void listToTerminal(){
        System.out.println(arrayOfPerson);
    }


}
