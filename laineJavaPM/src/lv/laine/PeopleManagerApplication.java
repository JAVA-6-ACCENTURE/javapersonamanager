package lv.laine;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class PeopleManagerApplication {

    public static void main(String[] args) {

        Person person = new Person("Laine", "Aleponija", "Balode", "f", LocalDate.of(1991,4,19));
        System.out.println(person);

        System.out.println("-------------");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Str1");
        System.out.println(arrayList);
        arrayList.remove("Str1");
        System.out.println(arrayList);

        Person person1 = new Person("Karlis", "Edmunds", "Baumanis", "m", LocalDate.of(1991,4,19));
        ArrayList<Person> arrayList1 = new ArrayList<>();
        PeopleManager peopleManager = new PeopleManager(arrayList1);

        peopleManager.addPerson(person1);
        System.out.println(arrayList1);

    }
}
