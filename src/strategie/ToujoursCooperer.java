package strategie;

import partie.Partie;

/**
 *
 * @author Arnaud
 */
public class ToujoursCooperer extends Strategie {

    public ToujoursCooperer() {
        choix = true;
    }

    @Override
    public boolean vaCooperer(Partie unePartie) {
        return choix;
    }
}
