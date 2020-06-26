package lv.lauma.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String birthDate;

    //taisa konstruktoru
    public Person(String firstName, String middleName, String lastName, String gender, String birthDate) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    // ģenerē getterus un setterus
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

    public String getAge() {
        String birthDateOfAge = this.birthDate;
        LocalDate today = LocalDate.now(); // atgriež šodienas datumu
        String lastChars = birthDateOfAge.substring(birthDateOfAge.length() - 4); //lai dabūtu pēdējos 4 char no stringa, parāda cik tālu nogriež string
        int userYear = Integer.parseInt(lastChars); //pārveido par int
        int todayYear = today.getYear();
        int age = todayYear - userYear;
        return "" + age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", ageToday='" + getAge() + '\'' +
                '}';
    }
}
