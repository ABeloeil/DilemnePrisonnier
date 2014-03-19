package partie;

/**
 *
 * @author Arnaud
 */
public class TourDePartie {
    private boolean ACoop, BCoop;
    private String choixA, choixB;
    private int gainA, gainB;
    
    public TourDePartie(boolean unChoixA, boolean unChoixB, int unGainA, int unGainB ) {
        ACoop = unChoixA;
        BCoop = unChoixB;
        gainA = unGainA;
        gainB = unGainB;
        if (unChoixA) {
            choixA = "Coopère";
        } else {
            choixA = "Fait défaut";
        }
        if (unChoixB) {
            choixB = "Coopère";
        }else {
            choixB = "Fait défaut";
        }
    }

    public boolean isACoop() {
        return ACoop;
    }

    public boolean isBCoop() {
        return BCoop;
    }

    public String getChoixA() {
        return choixA;
    }

    public String getChoixB() {
        return choixB;
    }

    public int getGainA() {
        return gainA;
    }

    public int getGainB() {
        return gainB;
    }
}
