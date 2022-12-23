package Service;

import Model.Curs;
import Model.Jurnal;

public class CursService {
    Curs[] curList=new Curs[10];
    private  int index=0;
    private Curs[] cursList;

    public boolean addCurs(String cursName, double quantity) {
        for (Curs curs: curList) {
            if (curs!=null) {
                if (curs.cursName.equals(cursName)) {
                    return false;
                }
            }
        }
        cursList[index++]=new Curs(cursName,quantity);
        return true;
    }
}
