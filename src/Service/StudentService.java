package Service;

import Model.Student;

public class StudentService {
    public Student[] studentList = new Student[24];
    private int index = 0;

    public Student checkStudent(String studentName, String studentSurname) {
        for (Student student : studentList) {
            if (student != null) {
                if (student.name.equals(studentName) && student.SurName.equals(studentSurname)) {
                    return student;
                }
            }
        }
        return null;
    }

    private int count = 0;

    public boolean addStudent(String studentName, String studentSurname, String password) {
        for (Student student : studentList) {
            if (student != null) {
                if (student.name.equals(studentName) && student.SurName.equals(studentSurname)) {
                    count++;
                }
            }
        }
        if (count < 24) {
            if (checkStudent(studentName, studentSurname) != null) {
                studentList[index++] = new Student(studentName, studentSurname, password);
                return false;
            }
        }
        return true;
    }

    public Student loginStudent(String studentName, String studentSurname, String password) {
        Student student=checkStudent(studentName,studentSurname);
        if(student!=null){
            if(student.password.equals(password)){
                return student;
            }
        }

        return null;
    }
}


