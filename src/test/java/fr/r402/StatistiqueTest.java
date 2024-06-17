package fr.r402;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class StatistiqueTest {

    @Test
    public void testAjouter() {
        StatistiqueVoiture stats = new StatistiqueVoiture();
        Voiture voiture1 = new Voiture("Renault", 20000);

        stats.ajouter(voiture1);

        // Vérifie que la voiture a bien été ajoutée (on suppose que la liste est accessible, sinon vous pouvez ajouter un getter pour la liste des voitures)
        List<Voiture> voitures = stats.getVoitures();
        assertEquals(1, voitures.size());
        assertEquals("Renault", voitures.get(0).getMarque());
    }

    @Test
    public void testPrixSansVoiture() {
        StatistiqueVoiture stats = new StatistiqueVoiture();

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            stats.prix();
        });

        String expectedMessage = "Il n'y a pas de voiture";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testPrixAvecVoitures() {
        StatistiqueVoiture stats = new StatistiqueVoiture();

        Voiture voiture1 = new Voiture("Renault", 20000);
        Voiture voiture2 = new Voiture("Peugeot", 25000);
        Voiture voiture3 = new Voiture("Citroen", 30000);

        stats.ajouter(voiture1);
        stats.ajouter(voiture2);
        stats.ajouter(voiture3);

        int expectedPrix = 20000 + 25000 + 30000; // Pas de remise car moins de 5 voitures
        assertEquals(expectedPrix, stats.prix());
    }

    @Test
    public void testPrixAvecRemise() {
        // à finir
    }
}

