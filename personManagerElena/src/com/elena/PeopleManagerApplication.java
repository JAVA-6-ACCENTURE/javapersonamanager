package com.elena;

import java.time.LocalDate;

public class PeopleManagerApplication {

    public static void main(String[] args) {
        Person person1 = new Person("Malfurion", "Stormrage", false, LocalDate.of(1520, 3, 15));
        Person person2 = new Person("Aranna", "Elaine", "Starsseker", true, LocalDate.of(1813, 6, 13));
        Person person3 = new Person("Elyse", "Starseeker", true, LocalDate.of(1734, 4, 12));
        Person person4 = new Person("Maiev", "Rogue", "Shadowsong", true, LocalDate.of(1700, 11, 13));
        Person person5 = new Person("Arthas", "Lightbringer", "Menethil", false, LocalDate.of(1805, 9, 9));

        PeopleManager peopleManager = new PeopleManager();
        peopleManager.addPerson(person1);
        peopleManager.addPerson(person2);
        peopleManager.addPerson(person3);
        peopleManager.addPerson(person4);
        peopleManager.addPerson(person2);
        peopleManager.addPerson(person5);
        peopleManager.printPersons();
        System.out.println("");

        peopleManager.removePerson(person1);
        peopleManager.printPersons();
        System.out.println("");

        peopleManager.removePerson(new Person("Elyse", "Starseeker", true, LocalDate.of(1734, 4, 12)));
        peopleManager.printPersons();
    }
}
