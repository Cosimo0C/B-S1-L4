package Es2;

import Es2.Dipartimento;
import Es2.Dipendente;

public class DipendenteFullTime extends Dipendente {
    private final int matricola;
    private double stipendio=2000;
     final double pagaOrario=60;
    Dipartimento dipartimento;

    DipendenteFullTime(int matricola, Dipartimento dipartimento){
        this.matricola=matricola;
        this.dipartimento=dipartimento;
    }
    @Override
    public String toString() {
        String stringa = this.matricola + " " + this.dipartimento + " " + stipendio;
        return stringa;
    }
    public int getMatricola(){
        return this.matricola;
    }
    public double getStipendio(){
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }
}
