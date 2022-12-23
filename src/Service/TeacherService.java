package Service;

import Model.Teachers;

public class TeacherService {
    public Teachers[] teacherList = new Teachers[100];
    private int index = 0;

    public Teachers checkTeacher(String teacherName, String teacherSurname){
        for (Teachers teacher: teacherList) {
            if(teacher != null){
                if(teacher.name.equals(teacherName) && teacher.surName.equals(teacherSurname)){
                    return teacher;
                }
            }
        }
        return null;
    }
    public boolean addTeacher(String teacherName, String teacherSurname, String password){
        if(checkTeacher(teacherName, teacherSurname) != null){
            teacherList[index++] = new Teachers(teacherName, teacherSurname, password);
            return false;
        }
        return true;
    }
    public Teachers loginTeacher(String teacherName, String teacherSurname, String password){
        Teachers teacher = checkTeacher(teacherName, teacherSurname);
        if(teacher != null){
            if(teacher.password.equals(password)){
                return teacher;
            }
        }
        return null;
    }
}
