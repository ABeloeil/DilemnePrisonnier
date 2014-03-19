package partie;

/**
 *
 * @author Arnaud
 */
public class RegleDeCalcul {
    private int valeurDupe, valeurPunition, valeurRecompense, valeurTentation;
    private final int VALEUR_DEFAUT_DUPE, VALEUR_DEFAUT_RECOMPENSE, VALEUR_DEFAUT_TENTATION, VALEUR_DEFAUT_PUNITION;
    
    public RegleDeCalcul(int dupe, int punition, int recompense, int tentation) {
        this.setValeur(dupe, punition, recompense, tentation);
        VALEUR_DEFAUT_DUPE = dupe;
        VALEUR_DEFAUT_PUNITION = punition;
        VALEUR_DEFAUT_RECOMPENSE = recompense;
        VALEUR_DEFAUT_TENTATION = tentation;
    }

    public int getVALEUR_DEFAUT_DUPE() {
        return VALEUR_DEFAUT_DUPE;
    }

    public int getVALEUR_DEFAUT_RECOMPENSE() {
        return VALEUR_DEFAUT_RECOMPENSE;
    }

    public int getVALEUR_DEFAUT_TENTATION() {
        return VALEUR_DEFAUT_TENTATION;
    }

    public int getVALEUR_DEFAUT_PUNITION() {
        return VALEUR_DEFAUT_PUNITION;
    }

    public int getValeurDupe() {
        return valeurDupe;
    }

    public int getValeurPunition() {
        return valeurPunition;
    }

    public int getValeurRecompense() {
        return valeurRecompense;
    }

    public int getValeurTentation() {
        return valeurTentation;
    }
    
    public void setValeurDefaut() {
        valeurDupe = VALEUR_DEFAUT_DUPE;
        valeurPunition = VALEUR_DEFAUT_PUNITION;
        valeurRecompense = VALEUR_DEFAUT_RECOMPENSE;
        valeurTentation = VALEUR_DEFAUT_TENTATION;
    }
    
    public void setValeur(int dupe, int punition, int recompense, int tentation) {
        assert dupe < punition;
        assert punition < recompense;
        assert recompense < tentation;
        assert tentation + dupe < recompense*2;
        
        valeurDupe = dupe;
        valeurPunition = punition;
        valeurRecompense = recompense;
        valeurTentation = tentation;
    }
}
