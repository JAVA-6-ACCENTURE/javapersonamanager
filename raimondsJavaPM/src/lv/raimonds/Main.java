package lv.raimonds;

import lv.raimonds.control.PersonManager;
import lv.raimonds.data.Person;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String birthDateOfAge = "10-05-2000";
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formatDate = today.format(formatter);

        System.out.println(birthDateOfAge);
        System.out.println(today.getYear());
        System.out.println(formatDate);

        String lastChars = birthDateOfAge.substring(birthDateOfAge.length()-4);

        int userYear = Integer.parseInt(lastChars);
        int todayYear = today.getYear();
        int age = todayYear - userYear;

        System.out.println(lastChars);
        System.out.println(age);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Str1");
        System.out.println(arrayList);
        arrayList.remove("Str1");
        System.out.println(arrayList);


        Person person = new Person("asd", "asd", "asd", "asd", "asd");
        ArrayList<Person> arrayList1 = new ArrayList<>();
        PersonManager personManager = new PersonManager(arrayList1);

        personManager.addPerson(person);
        System.out.println(arrayList1);

    }
}
