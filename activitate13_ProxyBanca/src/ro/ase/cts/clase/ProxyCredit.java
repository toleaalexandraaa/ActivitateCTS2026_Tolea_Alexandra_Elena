package ro.ase.cts.clase;

public class ProxyCredit implements AbstractCredit{
   private Credit credit;


    public ProxyCredit(Credit credit) {
        this.credit = credit;
    }

    @Override
    public void realizeazaCredit(String moneda) {
        if(moneda.equals("RON")){
            System.out.println("Moneda este acceptata. Creditul poate fi realizat.");
            credit.realizeazaCredit(moneda);
        }else{
            System.out.println("Creditul nu poate fi realizat.");
        }
    }
}
