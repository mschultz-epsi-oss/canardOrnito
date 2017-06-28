package whichdesignpattern;

/**
 * Created by melvin on 28/06/17.
 */
public class Colvert extends Canard implements EmissionSonore {

    public Colvert() {
        setMaFaconDeVoler(new VolAvecAiles());
    }

    @Override
    public void afficheToi() {
        System.out.println("Je suis un Colvert !");
    }

    @Override
    public void emetUnSon() {
        System.out.println("Coin coin");
    }
}
