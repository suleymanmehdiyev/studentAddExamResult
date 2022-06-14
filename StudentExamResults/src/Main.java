import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        // write your code here


        LocalDate birthDate = LocalDate.of(2005, 7, 10);
        LocalDate birthDate1 = LocalDate.of(2000, 8, 11);
        LocalDate birthDate2 = LocalDate.of(2002, 6, 1);
      //  LocalDate birthDate3 = LocalDate.of(2003,6,11);
        Student[] student = new Student[]{
                new Student(22, "Suleyman", birthDate, "Baku", Gender.MALE, 0, 0),
                new Student(25, "Aynur", birthDate1, "Baku", Gender.FEMALE, 0, 0),
             //   new Student(28, "Suleyman2", birthDate2, "Baku", Gender.MALE, 0, 0),

        };

        // for first Student
        student[0].addExamResult(60);
        student[0].addExamResult(70);
        student[0].addExamResult(80);
        System.out.println(" ");
        // for second Student
        student[1].addExamResult(60);
        student[1].addExamResult(50);
        student[1].addExamResult(30);
        System.out.println(" ");
        // for third Student
//        student[2].addExamResult(40);
//        student[2].addExamResult(100);
//        student[2].addExamResult(90);
//        System.out.println(" ");


        try{
            Path path = Path.of("files/text.csv");
            BufferedWriter writer = Files.newBufferedWriter(path);
            writer.write("#age;name;birthDate;address;gender;averageGrade;countOfExamsAttended" +"\n");
            for(int i =0;i< student.length-1;i++){
                writer.write(String.valueOf(student[i] + "\n"));
            }
            if(Student.isSame(student) == true){
                writer.write(String.valueOf(student[student.length-1]));
                // writer.flush();
            };

            writer.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }


        // to write the average on the screen
        for(int i = 0;i< student.length;i++){
             double average = student[i].getAverageGrade() / student[i].getCountOfExamsAttended();
             System.out.printf("Your averageGrade is: %.1f\n",average);
             System.out.println("Your countOfExamsAttended is: " + student[i].getCountOfExamsAttended());
        }


    }

}

