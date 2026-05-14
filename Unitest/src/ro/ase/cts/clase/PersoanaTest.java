package ro.ase.cts.clase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetGen() {
        Persoana persoana= new Persoana("Matei", "123456789");
        Assert.assertEquals("M", persoana.getGen());


    }

    @Test
    public void testCheckCNP() {
        Persoana persoana = new Persoana("Matei", "1930805019731");
        assertEquals(true, persoana.checkCNP());
        assertTrue(persoana.checkCNP());
    }


    @Test
    public void testGetGenFdupa2000() {
        Persoana persoana1=new Persoana("Ana", "6011005011732");
        Assert.assertEquals("F", persoana1.getGen());
    }

    @Test
    public void testGetGenBoundaryInferior2000() {
        Persoana persoana2= new Persoana ("Mircea", "50001010234455");
        assertEquals("M", persoana2.getGen());
    }

    @Test
    public void testGetVarstaPersoanaNascutaAzi(){
        Persoana persoana3= new Persoana("Mihai","52605142321312" );
        assertEquals(0, persoana3.getVarsta());
    }

    @Test
    public void tetsGetGenCrossCheck() {
        String cnp = "6040814444241";
        Persoana persoana5 = new Persoana("Dariana", cnp);
        String expected;
        if (cnp.charAt(0) % 2 == 0) {
            expected = "F";
        } else {
            expected = "M";
        }
        ;
        String actual = persoana5.getGen();
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckLungimeCNP(){
        Persoana persoana4= new Persoana("Mihai","526051422" );
        persoana4.checkCNP();
    }
}