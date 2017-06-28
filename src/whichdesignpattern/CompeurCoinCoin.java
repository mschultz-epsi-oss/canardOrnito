package whichdesignpattern;

/**
 * Created by melvin on 28/06/17.
 */
public class CompeurCoinCoin implements EmissionSonore {
    private static Integer compteur = 0;
    EmissionSonore decore;

    public CompeurCoinCoin(EmissionSonore es) {
        decore = es;
    }

    @Override
    public void emetUnSon() {
        decore.emetUnSon();
        compteur = getCompteur() + 1;
    }

    public static Integer getCompteur() {
        return compteur;
    }
}
