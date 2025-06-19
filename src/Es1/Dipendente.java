package Es1;

public class Dipendente {
    private final int matricola;
    private double stipendio;
   private Dipartimento dipartimento;

Dipendente(int matricola, Dipartimento dipartimento, double stipendio){
    this.matricola=matricola;
    this.dipartimento=dipartimento;
    this.stipendio=stipendio;
}
 @Override
   public String toString(){
 String stringa = this.matricola+ " "+this.dipartimento+ " "+this.stipendio;
 return stringa;
  }
  public int getMatricola(){
    return this.matricola;
  }
public double getStipendio(){
    return this.stipendio;
}

    public Dipartimento getDipartimento() {
        return dipartimento;
    }
}
