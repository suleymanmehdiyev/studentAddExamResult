import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

public class Student extends Human{
    private  double averageGrade;
    private int countOfExamsAttended;


    public Student(){}

    public Student(int age, String name, LocalDate birthdate, String address, Gender gender, double averageGrade, int countOfExamsAttended) {
        super(age, name, birthdate, address, gender);
        this.averageGrade = averageGrade;
        this.countOfExamsAttended = countOfExamsAttended;
    }


    public static boolean isSame(Student[] student){
        for (int i = 0;i< student.length-1;i++) {
            if(student[student.length-1].getName().equals(student[i].getName()) || (student[student.length-1].getBirthdate() == (student[i].getBirthdate()))){
                System.out.println("Bu adda ve yaxud dogum tarixinde biri artiq movcuddur");
                return false;
            }
        }
        return true;
    }


    private int noteExamAttendance(){
        countOfExamsAttended++;
        return countOfExamsAttended;
    }

    public  double addExamResult(int result){
        noteExamAttendance();
        averageGrade += result;
        System.out.println("Your exam result is: " + result);
        return averageGrade;
    }


    public double getAverageGrade() {
        return averageGrade;
    }

    public int getCountOfExamsAttended() {
        return countOfExamsAttended;
    }
    @Override
    public String toString(){
        return  getAge() + ";" + getName() + ";" + getBirthdate() + ";" + getAddress() + ";" + getGender() + ";"
                + String.format("%.1f",getAverageGrade() / getCountOfExamsAttended()) + ";" +  getCountOfExamsAttended();

    }


}
