package ro.ase.cts.main;

import ro.ase.cts.clase.AdapterBar;
import ro.ase.cts.clase.SoftBar;
import ro.ase.cts.clase.SoftBucatarie;
import ro.ase.cts.clase.SoftFacturi;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SoftFacturi softVechi = new SoftBucatarie();
        softVechi.printeazaFacturi("Paste Carbonara");
        SoftFacturi adapter = new AdapterBar(new SoftBar());
        adapter.printeazaFacturi("Sampanie Moet");
        adapter.printeazaFacturi("Gin");
        adapter.printeazaFacturi("Cocktail");
    }
}