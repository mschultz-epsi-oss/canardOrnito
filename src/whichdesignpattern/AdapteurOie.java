package whichdesignpattern;

/**
 * Created by melvin on 28/06/17.
 */
public class AdapteurOie extends Canard {
    private Oie oie;

    public AdapteurOie(Oie o) {
        oie = o;
    }

    @Override
    public void afficheToi() {
        System.out.println("Je suis une oie !");
    }

    @Override
    public void envoleToi() {
        this.oie.deplaceToi();
    }
}
