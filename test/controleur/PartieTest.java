/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import partie.Partie;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author greta
 */
public class PartieTest {

    private Partie partie;

    @Before
    public void constrution() {
        partie = new Partie();
    }
    
    @Test
    public void testJouerCC() {
        partie.jouer(true, true);        
        assertTrue(partie.getTours().get(0).getChoixA());
        assertTrue(partie.getTours().get(0).getChoixB());
        assertEquals(partie.getTours().get(0).getGainA(), partie.getTours().get(0).getGainB());
    }
    
    @Test
    public void testJouerCD() {
        partie.jouer(true, false);        
        assertTrue(partie.getTours().get(0).getChoixA());
        assertFalse(partie.getTours().get(0).getChoixB());
        assertEquals(partie.getRegleDeCalcul().getValeurDupe(), partie.getTours().get(0).getGainA());
        assertEquals(partie.getRegleDeCalcul().getValeurTentation(), partie.getTours().get(0).getGainB());
    }
    
    @Test
    public void testJouerDC() {
        partie.jouer(false, true);        
        assertTrue(partie.getTours().get(0).getChoixB());
        assertFalse(partie.getTours().get(0).getChoixA());
        assertEquals(partie.getRegleDeCalcul().getValeurDupe(), partie.getTours().get(0).getGainB());
        assertEquals(partie.getRegleDeCalcul().getValeurTentation(), partie.getTours().get(0).getGainA());
    }
    
    @Test
    public void testJouerDD() {
        partie.jouer(false, false);        
        assertEquals("Fait défaut",partie.getTours().get(0).getChoixA());
        assertEquals("Fait défaut",partie.getTours().get(0).getChoixB());
        assertEquals(partie.getRegleDeCalcul().getValeurPunition(), partie.getTours().get(0).getGainA());
        assertEquals(partie.getRegleDeCalcul().getValeurPunition(), partie.getTours().get(0).getGainB());
    }
    
}