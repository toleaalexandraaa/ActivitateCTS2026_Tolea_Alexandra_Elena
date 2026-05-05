package ro.ase.cts.main;


import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic=new Medic("Popescu");
        PersonalSpital asistenta=new Asistenta("Crina");

        Pacient pacient1=new Pacient("Ion");
        Pacient pacient2=new Pacient("Vasile");

        Command command1=new Internare(medic, pacient1);
        Command command2=new Tratare(asistenta, pacient2);

        Operator operator=new Operator();
        operator.inregistreaza(command1);
        operator.inregistreaza(command2);
        operator.executaFisa();

        operator.inregistreaza(new Tratare(asistenta, new Pacient("Aurora")));
        operator.executaFisa();
        operator.executaFisa();

    }
}