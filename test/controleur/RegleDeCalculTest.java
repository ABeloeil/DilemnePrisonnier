/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import partie.RegleDeCalcul;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author greta
 */
public class RegleDeCalculTest {
    private RegleDeCalcul regle;
    
    
    
    @Before
    public void construction() {
        regle = new RegleDeCalcul(0, 1, 3, 5);
    }

    @Test
    public void testGetVALEUR_DEFAUT_DUPE() {
        assertEquals(0, regle.getVALEUR_DEFAUT_DUPE());
    }

    @Test
    public void testGetVALEUR_DEFAUT_RECOMPENSE() {
        assertEquals(3, regle.getVALEUR_DEFAUT_RECOMPENSE());
    }

    @Test
    public void testGetVALEUR_DEFAUT_TENTATION() {
        assertEquals(5,regle.getVALEUR_DEFAUT_TENTATION());
    }

    @Test
    public void testGetVALEUR_DEFAUT_PUNITION() {
        assertEquals(1, regle.getVALEUR_DEFAUT_PUNITION());
    }


    @Test
    public void testSetValeur() {
        regle.setValeur(1, 4, 18, 20);
        assertEquals(1, regle.getValeurDupe());
        assertEquals(4, regle.getValeurPunition());
        assertEquals(18, regle.getValeurRecompense());
        assertEquals(20, regle.getValeurTentation());        
    }
    
    @Test
    public void testSetValeurDefaut() {
        regle.setValeurDefaut();
        assertEquals(regle.getVALEUR_DEFAUT_DUPE(),regle.getValeurDupe());
        assertEquals(regle.getVALEUR_DEFAUT_PUNITION(),regle.getValeurPunition());
        assertEquals(regle.getVALEUR_DEFAUT_RECOMPENSE(),regle.getValeurRecompense());
        assertEquals(regle.getVALEUR_DEFAUT_TENTATION(),regle.getValeurTentation());
    }
    
    @Test
    public void testSetValeurFail() {
        regle.setValeur(1, 1, 2, 5);
    }
}