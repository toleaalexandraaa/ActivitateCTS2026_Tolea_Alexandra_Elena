import ro.ase.cts.clase.ComandaOcupareMasa;
import ro.ase.cts.clase.ComandaRezervareMasa;
import ro.ase.cts.clase.Masa;
import ro.ase.cts.clase.Operator;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(1);
        Masa masa2 = new Masa(2);
        Masa masa3 = new Masa(3);

        Operator operator = new Operator();

        operator.preiaComanda(new ComandaRezervareMasa(masa1));
        operator.preiaComanda(new ComandaOcupareMasa(masa2));
        operator.preiaComanda(new ComandaRezervareMasa(masa3));
        operator.preiaComanda(new ComandaOcupareMasa(masa1));

        operator.executaComenzi();
    }
}