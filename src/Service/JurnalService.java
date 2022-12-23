package Service;

import Model.Jurnal;

public class JurnalService {
    public Jurnal[] jurnalList = new Jurnal[24];
    private int index = 0;
    private String curs;

    public boolean addCurs(String surname, int attendance, String studentSurname) {
        for (Jurnal journal : jurnalList) {
            if (journal != null) {
                if (journal.curs.equals(curs)) {
                    return false;
                }
            }
        }


        jurnalList[index++] = new Jurnal(curs, attendance, studentSurname);
        return true;
    }

    public int count=0;
    public String studentAttendance(String attendance, String studentSurname){
        for (Jurnal jurnal:jurnalList) {
            if (jurnal!=null){
                if(jurnal.studentName.equals(studentSurname) && count==3){
                    return studentSurname=null;
                }
            }
        }
        return studentSurname;
    }
}
