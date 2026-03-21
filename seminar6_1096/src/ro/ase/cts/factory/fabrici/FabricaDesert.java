package ro.ase.cts.factory.fabrici;

import ro.ase.cts.factory.clase.Clatite;
import ro.ase.cts.factory.clase.FelDeMancare;
import ro.ase.cts.factory.clase.Papanasi;
import ro.ase.cts.factory.enums.TipDesert;
import ro.ase.cts.factory.enums.TipFelDeMancare;

public class FabricaDesert implements FabricaFelDeMancare{
    @Override
    public FelDeMancare createFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret) {
        return createFelDeMancare(tipFelDeMancare, gramaj, pret, 500);
    }

    @Override
    public FelDeMancare createFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret, int nrCalorii) {
        return switch(tipFelDeMancare) {
            case TipDesert.Clatite -> new Clatite(nrCalorii,gramaj,pret);
            case TipDesert.Papanasi -> new Papanasi(nrCalorii,gramaj,pret);
            default -> null;
        };
    }

}
