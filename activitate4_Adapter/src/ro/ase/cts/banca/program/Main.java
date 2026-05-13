package ro.ase.cts.banca.program;

import ro.ase.cts.banca.clase.CreditNevoiPersonale;
import ro.ase.cts.banca.clase.ICredit;
import ro.ase.cts.banca.clase.Leasing;
import ro.ase.cts.banca.clase.LeasingAdapter;

public class Main {
    public static void afiseazaCredit(ICredit credit){
        credit.oferaCredit();
    }
    public static void main(String[] args) {
        ICredit creditNevoiPersonale= new CreditNevoiPersonale("Ana Maria", 7000);
        afiseazaCredit(creditNevoiPersonale);

        Leasing leasing=new Leasing("Mincu Ioana", 98000);
        ICredit leasingAdapter= new LeasingAdapter(leasing);

        afiseazaCredit(leasingAdapter);
    }
}