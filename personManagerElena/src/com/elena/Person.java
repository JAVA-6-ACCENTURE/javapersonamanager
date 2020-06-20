package com.elena;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private boolean gender; //true - female; false - male
    private LocalDate birthday;

    public Person(String firstName, String middleName, String lastName, boolean gender, LocalDate birthday) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = birthday;
    }

    public Person(String firstName, String lastName, boolean gender, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return Period.between(this.birthday, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        String genderStr;
        if (gender) genderStr = "female";
        else genderStr = "male";
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + genderStr +
                ", birthday=" + birthday +
                ", age=" + getAge() +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return gender == person.gender &&
                firstName.equals(person.firstName) &&
                Objects.equals(middleName, person.middleName) &&
                lastName.equals(person.lastName) &&
                birthday.equals(person.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName, gender, birthday);
    }
}
