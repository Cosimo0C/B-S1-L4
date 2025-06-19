package Es1;

public class Main {
    public static void main(String[] args) {
        Dipendente dip1= new Dipendente(1, Dipartimento.VENDITE, 10);
        System.out.println(dip1.getMatricola() +" "+ dip1.getPagaOrario());
        dip1.getDipartimento();
        System.out.println(dip1);
        System.out.println(dip1.calculateSalary(10, dip1.pagaOrario));
    }
}
