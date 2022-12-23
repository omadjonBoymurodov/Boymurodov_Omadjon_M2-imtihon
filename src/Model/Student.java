package Model;

import javax.xml.namespace.QName;
import java.util.UUID;

public class Student extends User {
    private UUID studentId;
    public Student(){
        this.studentId=UUID.randomUUID();
    }
    public Student(String name, String SurName, String password) {
        super();
    }
    public UUID getStudentId(){
        return studentId;
    }
}
