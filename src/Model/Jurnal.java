package Model;

public class Jurnal {
    public String curs;
    public String studentSurname;
    public int attendance; // davomat
    private String stuedentSurName;
    public String studentName;

    public Jurnal( String curs, int attendance, String stuedentSurName) {
        this.attendance = attendance;
        this.stuedentSurName = stuedentSurName;
    }

}
