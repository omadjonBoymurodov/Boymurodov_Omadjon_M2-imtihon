import Model.Jurnal;
import Model.Student;
import Model.Teachers;
import Service.JurnalService;
import Service.StudentService;
import Service.TeacherService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        JurnalService journalService = new JurnalService();
        TeacherService teacherService = new TeacherService();
        StudentService studentService = new StudentService();

        int stepCode = 1;
        while (stepCode != 0){
            System.out.println("1.Register Teacher, 2.Register Student, 3.Login Teacher, 4.Login Student");
            stepCode = scannerInt.nextInt();
            switch (stepCode) {
                case 1 -> {
                    System.out.println("Enter Name");
                    String name = scannerStr.nextLine();
                    System.out.println("Enter Surname");
                    String surname = scannerStr.nextLine();
                    System.out.println("Enter Password");
                    String password = scannerStr.nextLine();
                    System.out.println(teacherService.addTeacher(name, surname, password));
                }
                case 2 -> {
                    System.out.println("Enter Name");
                    String name = scannerStr.nextLine();
                    System.out.println("Enter Surname");
                    String surname = scannerStr.nextLine();
                    System.out.println("Enter Password");
                    String password = scannerStr.nextLine();
                    System.out.println(studentService.addStudent(name, surname, password));
                }
                case 3 -> {
                    System.out.println("Enter Name");
                    String name = scannerStr.nextLine();
                    System.out.println("Enter Surname");
                    String surname = scannerStr.nextLine();
                    System.out.println("Enter Password");
                    String password = scannerStr.nextLine();
                    Teachers currentTeacher = teacherService.loginTeacher(name, surname, password);
                    if(currentTeacher == null){
                        System.out.println("ERROR!");
                    }
                    else{
                        int stepCode1 = 4;
                        while(stepCode1 != 0){
                            System.out.println("1.Students, 0.Exit");
                            stepCode1 = scannerInt.nextInt();
                            switch (stepCode1){
                                case 1 ->{
                                    System.out.println("Enter attendance");
                                    int attendance = scannerInt.nextInt();
                                    System.out.println("Enter Student Surname");
                                    String studentSurname = scannerStr.nextLine();
                                    System.out.println(journalService.addCurs(surname,attendance, studentSurname));
                                }
                            }
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Enter Name");
                    String name = scannerStr.nextLine();
                    System.out.println("Enter Surname");
                    String surname = scannerStr.nextLine();
                    System.out.println("Enter Password");
                    String password = scannerStr.nextLine();
                    Student currentStudent = studentService.loginStudent(name, surname, password);
                    if(currentStudent != null){
                        System.out.println("ERROR!");
                    }
                    else{
                        int stepCode1 = 1;
                        while(stepCode1 != 0){
                            System.out.println("1.Curs, 0.Exit");
                            stepCode1 = scannerInt.nextInt();
                            switch (stepCode1){
                                case 1 ->{
                                    for (Jurnal journal: journalService.jurnalList) {
                                        if(journal != null){
                                            if(journal.studentSurname.equals(currentStudent.SurName)){
                                                System.out.println("Curs: " + journal.curs + " ===== Attendance: " + journal.attendance);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}