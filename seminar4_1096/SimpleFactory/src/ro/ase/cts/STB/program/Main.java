package ro.ase.cts.STB.program;

import ro.ase.cts.STB.factory.MijlocTransportFactory;
import ro.ase.cts.STB.factory.MijlocTransportType;
import ro.ase.cts.STB.vehicule.MijlocTransport;

public class Main {
    public static void afisareDescriere(MijlocTransport mijlocTransport)
    {
        System.out.println(mijlocTransport);
    }

    public static void main(String[] args) throws Exception {
        MijlocTransportFactory factory = MijlocTransportFactory.getInstance();
        MijlocTransport autobuz = factory.getMijlocTransport(
                "Mercedes",
                432,
                MijlocTransportType.AUTOBUZ
        );
        MijlocTransport tramvai = factory.getMijlocTransport(
                "Astra",
                101,
                MijlocTransportType.TRAMVAI
        );
        MijlocTransport troleibuz = factory.getMijlocTransport(
                "Otokar",
                44,
                MijlocTransportType.TROLEIBUZ
        );
        afisareDescriere(autobuz);
        afisareDescriere(tramvai);
        afisareDescriere(troleibuz);

    }
}