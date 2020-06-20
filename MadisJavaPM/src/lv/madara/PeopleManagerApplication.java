package lv.madara;

import lv.madara.taskPM.PeopleManager;
import lv.madara.taskPM.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class PeopleManagerApplication {

    public static void main(String[] args) {

        //String birthDate = "10-05-1989" ;
        //LocalDate today = LocalDate.now(); //pēc ISO metodes, te nederēs
        //DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        //String formatDate = today.format(format);

        //System.out.println(birthDate);
        //System.out.println(today.getYear());
        //System.out.println(formatDate);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Str1");
        System.out.println(arrayList);
        arrayList.remove("Str2");

        Person pax1 = new Person("Anna","Ieva", "Roze", "female","10-05-1990");
        ArrayList<Person> arrayList1 = new ArrayList<>();
        PeopleManager paxManager = new PeopleManager(arrayList1);
        paxManager.addPerson(pax1); //method from People Manager class
        System.out.println(arrayList1);




    }
}
