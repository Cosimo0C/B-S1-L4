package Es1;

public class Main {
    public static void main(String[] args) {
        Dipendente dip1= new Dipendente(10, Dipartimento.AMMINISTRAZIONE, 2000);
        System.out.println(dip1);
        System.out.println(dip1.getMatricola());
        System.out.println(dip1.getStipendio());
    }
}
