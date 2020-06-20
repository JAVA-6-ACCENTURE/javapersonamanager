package lv.raimonds.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String birthDate;

    public Person(String firstName, String middleName, String lastName, String gender, String birthDate){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAge(){
        String birthDateOfAge = this.birthDate;
        LocalDate today = LocalDate.now();
        String lastChars = birthDateOfAge.substring(birthDateOfAge.length()-4);
        int userYear = Integer.parseInt(lastChars);
        int todayYear = today.getYear();
        int age = todayYear - userYear;
        return ""+age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
