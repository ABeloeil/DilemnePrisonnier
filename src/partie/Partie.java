package partie;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author Arnaud
 */
public class Partie extends Observable{

    private List<TourDePartie> tours;
    private RegleDeCalcul regleCalcul;

    public Partie() {
        tours = new ArrayList<>();
        regleCalcul = new RegleDeCalcul(0, 1, 3, 5);
    }

    public void jouer(boolean choixA, boolean choixB) {
        int gainA, gainB;

        if (choixA && choixB) {
            gainA = regleCalcul.getValeurRecompense();
            gainB = regleCalcul.getValeurRecompense();
        } else if (choixA && !choixB) {
            gainA = regleCalcul.getValeurDupe();
            gainB = regleCalcul.getValeurTentation();
        } else if (!choixA && choixB) {
            gainA = regleCalcul.getValeurTentation();
            gainB = regleCalcul.getValeurDupe();
        } else {
            gainA = regleCalcul.getValeurPunition();
            gainB = regleCalcul.getValeurPunition();
        }

        tours.add(new TourDePartie(choixA, choixB, gainA, gainB));
        setChanged();
        notifyObservers();
    }

    public int getNbTours() {
        return tours.size();
    }

    public RegleDeCalcul getRegleDeCalcul() {
        return regleCalcul;
    }

    public List<TourDePartie> getTours() {
        return tours;
    }
}
