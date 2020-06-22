package lv.lauma;

import lv.lauma.control.PeopleManager;
import lv.lauma.data.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String birthDateOfAge = "10-05-1985";
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //noformatē datumu

        String formatDate = today.format(formatter);

        System.out.println(birthDateOfAge);
        System.out.println(today.getYear());
        System.out.println(formatDate);

        String lastChars = birthDateOfAge.substring(birthDateOfAge.length()-4); //lai dabūtu pēdējos 4 char no stringa, parāda cik tālu nogriež string

        int userYear = Integer.parseInt(lastChars); //pārveido par int
        int todayYear = today.getYear();
        int age = todayYear - userYear;

        System.out.println(lastChars);
        System.out.println(age);

        //pievieno sarakstam
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Janis");
        arrayList.add("Karlis");
        System.out.println(arrayList);

        //izdzēš no saraksta
        arrayList.remove("Janis");
        System.out.println(arrayList);

        Person person = new Person("Inga", "Ieva", "Krumina", "female", "15062000");
        ArrayList<Person> arrayList1 = new ArrayList<>();
        PeopleManager personManager = new PeopleManager(arrayList1);

        personManager.addPerson(person);
        System.out.println(arrayList1);
    }
}
