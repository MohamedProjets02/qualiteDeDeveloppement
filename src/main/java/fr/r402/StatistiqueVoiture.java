package fr.r402;

import java.util.ArrayList;
import java.util.List;

public class StatistiqueVoiture implements Statistique {

    private List<Voiture> voitures;

    public StatistiqueVoiture() {
        this.voitures = new ArrayList<>();
    }

    @Override
    public void ajouter(Voiture voiture) {
        this.voitures.add(voiture);
    }

    @Override
    public int prix() throws ArithmeticException {
        if (voitures.isEmpty()) {
            throw new ArithmeticException("Il n'y a pas de voiture");
        }

        double prixTotal = 0.0;
        int nombreDeVoitures = voitures.size();
        double remiseParVoiture = 0.05;
        double remiseMaxi = 20000.0;

        for (Voiture voiture : voitures) {
            double prixVoiture = voiture.getPrix();
            int nombreDeRemises = nombreDeVoitures / 5;
            double remiseTotale = Math.min(nombreDeRemises * remiseParVoiture * prixVoiture, remiseMaxi);
            prixTotal += (prixVoiture - remiseTotale);
        }

        return (int) prixTotal;
    }

    public static void main(String[] args) {
        StatistiqueVoiture stats = new StatistiqueVoiture();

        Voiture voiture1 = new Voiture("Renault", 20000);
        Voiture voiture2 = new Voiture("Peugeot", 25000);
        Voiture voiture3 = new Voiture("Citroen", 30000);

        stats.ajouter(voiture1);
        stats.ajouter(voiture2);
        stats.ajouter(voiture3);

        try {
            System.out.println("Prix total des voitures: " + stats.prix() + "€");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

