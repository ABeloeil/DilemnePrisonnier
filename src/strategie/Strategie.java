package strategie;

import partie.Partie;

/**
 *
 * @author Arnaud
 */
public abstract class Strategie {
    protected boolean choix;
    
    
    public boolean vaCooperer(Partie unePartie) {
        return choix;
    }
}
