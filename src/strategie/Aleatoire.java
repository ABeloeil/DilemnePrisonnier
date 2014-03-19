package strategie;

import partie.Partie;
import java.util.Random;

/**
 *
 * @author Arnaud
 */
public class Aleatoire extends Strategie {

    public Aleatoire() {
    }

    @Override
    public boolean vaCooperer(Partie unePartie) {
        Random r = new Random();
        int random = r.nextInt(100);
        if (random%2 == 1) {
            choix = true;
        } else {
            choix = false;
        }
        return choix;
    }
}
