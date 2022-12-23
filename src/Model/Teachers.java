package Model;

import java.util.UUID;

public class Teachers {
    public String password;
    public String surName;
    public String name;
    private UUID teacherId;



    public Teachers() {
        this.teacherId=UUID.randomUUID();
    }
    public Teachers(String name, String surName, String password){
        super();
    }
    public UUID getTeacherId(){
        return teacherId;
    }

}
