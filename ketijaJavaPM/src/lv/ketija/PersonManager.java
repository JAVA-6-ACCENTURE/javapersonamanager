package lv.ketija;

import lv.ketija.PersonData;

import java.util.ArrayList;

public class PersonManager {
    private ArrayList<PersonData> arrayOfPerson;

    public PersonManager(ArrayList<PersonData> arrayOfPerson) {
        this.arrayOfPerson = arrayOfPerson;
    }

    public void setArrayOfPerson(ArrayList<PersonData> arrayOfPerson) {
        this.arrayOfPerson = arrayOfPerson;
    }

    public void addPersonData(PersonData person) {
        this.arrayOfPerson.add(person);

    }

    public void deletePerson(PersonData person) {
        this.arrayOfPerson.remove(person);
    }
}
