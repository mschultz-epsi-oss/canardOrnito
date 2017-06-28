package whichdesignpattern;

/**
 * Created by melvin on 28/06/17.
 */
public class CanardEnCaoutchouc extends Canard {

    public CanardEnCaoutchouc() {
        setMaFaconDeVoler(new NoVol());
    }

    @Override
    public void afficheToi() {
        System.out.println("Je suis un CanardEnCaoutchouc !");
    }
}
