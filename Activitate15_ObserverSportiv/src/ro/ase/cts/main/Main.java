package ro.ase.cts.main;


import ro.ase.cts.clase.ClientAbonat;
import ro.ase.cts.clase.SalaSport;

public class Main {
    public static void main(String[] args) {
        SalaSport salaSport=new SalaSport("Polivalenta");

        ClientAbonat clientAbonat1=new ClientAbonat("Crina");
        ClientAbonat clientAbonat2=new ClientAbonat("Moraru");
        ClientAbonat clientAbonat3=new ClientAbonat("Irina");

        salaSport.aboneazaClient(clientAbonat1);
        salaSport.aboneazaClient(clientAbonat2);
        salaSport.aboneazaClient(clientAbonat3);

        salaSport.notificaMeciFotbal();
        System.out.println();

        salaSport.dezaboneazaClient(clientAbonat2);
        salaSport.notificaMeciFotbal();
    }
}