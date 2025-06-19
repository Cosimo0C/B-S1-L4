package Es1;

public class Dipendente {
    private final int matricola;
    final double pagaOrario=60;
    Dipartimento dipartimento;
    Dipendente(int matricola, Dipartimento dipartimento, double pagaOrario){
        this.matricola=matricola;
        this.dipartimento=dipartimento;
    }
    @Override
    public String toString() {
        return this.matricola + " " + this.dipartimento + " " + pagaOrario;
    }
    public int getMatricola(){
        return this.matricola;
    }
    public double getPagaOrario(){
        return pagaOrario;
    }

    public void getDipartimento() {
        System.out.println(this.dipartimento);
    }
    public void saluta(){
        System.out.println("Ciao sono un dipendente");
    }
    public double calculateSalary(double ore, double pagaOraria){
        return ore*pagaOraria*22;
    }
}
