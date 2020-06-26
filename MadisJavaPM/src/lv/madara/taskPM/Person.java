package lv.madara.taskPM;

import java.time.LocalDate;

public class Person {

    //class attributes:
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String birthDate;

    //constructor:
    public Person(String firstName, String middleName, String lastName, String gender, String birthDate) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    //create getters and setters to all attributes:
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

    //method to get pax age:
    public String getAge(){
        String birthDate = this.birthDate;
        LocalDate today = LocalDate.now();
        String lastChars = birthDate.substring(birthDate.length() - 4); //pēdējie 4 char no String
        int userYear = Integer.parseInt(lastChars);
        int todayYear = today.getYear();
        int paxAge = todayYear - userYear;

        return ""+paxAge;
    }

    //toString method:
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
