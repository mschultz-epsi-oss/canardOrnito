package whichdesignpattern;

/**
 * Created by melvin on 28/06/17.
 */
public class Morillon extends Canard implements EmissionSonore {

    public Morillon() {
        setMaFaconDeVoler(new VolAvecAiles());
    }

    @Override
    public void afficheToi() {
        System.out.println("Je suis un Morillon !");
    }

    @Override
    public void emetUnSon() {
        System.out.println("Coin coin");
    }
}
