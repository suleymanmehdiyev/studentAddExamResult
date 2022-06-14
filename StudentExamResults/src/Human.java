import java.time.LocalDate;
import java.util.Date;

public class Human {
    private int age;
    private String name;
    private LocalDate birthdate;
    private String address;
    private Gender gender;


    public Human(){}

    public Human(int age, String name, LocalDate birthdate, String address, Gender gender) {
        this.age = age;
        this.name = name;
        this.birthdate = birthdate;
        this.address = address;
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getAddress() {
        return address;
    }

    public Gender getGender() {
        return gender;
    }
}
