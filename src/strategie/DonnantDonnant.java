package strategie;

import partie.Partie;

/**
 *
 * @author Arnaud
 */
public class DonnantDonnant extends Strategie{
   public DonnantDonnant() {
      choix = true; 
   }
   
   @Override
   public boolean vaCooperer(Partie unePartie) {
      if (unePartie.getNbTours()> 0) {
         choix = unePartie.getTours().get(unePartie.getNbTours()-1).isACoop();
      }
       return choix;
   }
}
