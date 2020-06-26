package lv.ketija;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PersonData {
    private String personName;
    private String middleName;
    private String lastName;
    private String gender;
    private String birthDate;

    public PersonData(String personName, String middleName, String lastName, String gender, String birthDate) {
        this.personName = personName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String getPersonName() {
        return personName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
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
        int personYear = Integer.parseInt(lastChars);
        int todayYear = today.getYear();
        int age = todayYear - personYear;

        //11=01-2020 ievadītais datums

        //20-06-2020 esošais datums
        return"" +age;
    }
}
