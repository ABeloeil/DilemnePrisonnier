package strategie;

import partie.Partie;

/**
 *
 * @author Arnaud
 */
public class JamaisCooperer extends Strategie {

    public JamaisCooperer() {
        choix = false;
    }

    @Override
    public boolean vaCooperer(Partie unePartie) {
        return choix;
    }
}
