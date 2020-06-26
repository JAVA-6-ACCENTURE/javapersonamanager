package lv.ketija;

import java.time.LocalDate;
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
        System.out.println(lastChars);

        int personYear = Integer.parseInt(lastChars);
        int todayYear = today.getYear();
        int age = todayYear - personYear;

        System.out.println(lastChars);
        System.out.println(age);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Str1");
        System.out.println(arrayList);

        PersonData person = new PersonData("Jānis", "Toms","Ozols","male", "2000");
        ArrayList<PersonData> arrayList1 = new ArrayList<>();
        PersonManager personManager = new PersonManager(arrayList1);

        personManager.addPersonData(person);

    }
}
