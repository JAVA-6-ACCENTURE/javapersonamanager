package lv.laine;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    //LocalDate dob = LocalDate.of(1991, 04, 19);
//    LocalDate date = LocalDate.now();
//    Period diff = Period.between(dob, LocalDate.now());
    private Period diff;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private LocalDate dob;



    public Person(String firstName, String middleName, String lastName, String gender, LocalDate dob) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;

    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Period getAge(){
        Period diff = Period.between(dob, LocalDate.now());
        return diff;


    }
     public String getAgeString(){
        Period diff2 = getAge();
        return(diff2.getYears()+" years, "+diff2.getMonths()+" months, "+diff2.getDays()+" days");
     }

    @Override
    public String toString() {
        return "Person{" +
                "firstname: " + firstName +
                ", middlename: " + middleName +
                ", lastname: " + lastName +
                ", gender: " + gender  +
                ", birth date: " + dob  +
                ", age today: " + getAgeString() +
                '}';
    }
}
