package lv.madara.taskPM;


import java.util.ArrayList;

public class PeopleManager{

    //class attributes (array of Person objects):
    private ArrayList<Person> arrayOfPerson;

    //create constructor:
    public PeopleManager(ArrayList<Person> arrayOfPerson) {
        this.arrayOfPerson = arrayOfPerson;
    }

    //method to add pax to list:
    public void addPerson(Person person){
        this.arrayOfPerson.add(person);
    }
    //method to remove pax:
    public void removePerson(Person person){
        this.arrayOfPerson.remove(person);
    }
    //method to print list of pax to terminal:
    public void printPaxList (){
        System.out.println(arrayOfPerson);
    }
}
