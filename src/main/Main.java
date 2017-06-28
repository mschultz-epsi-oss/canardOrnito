package main;

import whichdesignpattern.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<EmissionSonore> listES = new ArrayList<>();
        EmissionSonore es = new CompeurCoinCoin(new Colvert());
        listES.add(es);

        listES.add(new CompeurCoinCoin(new Morillon()));

        for(EmissionSonore e : listES) {
            e.emetUnSon();
        }

        System.out.println("Compteur = " + ((CompeurCoinCoin) es).getCompteur());
    }
}
