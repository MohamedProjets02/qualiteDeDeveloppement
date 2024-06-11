import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VoitureTest {

    public static void main(String[] args) {
        Voiture voiture = new Voiture();
        voiture.setMarque("Peugeot");
        voiture.setPrix(2000);
        assert "Peugeot".equals(voiture.getMarque()) : "Erreur, la marque devrait être 'Peugeot'";
        assert 2000 == voiture.getPrix() : "Erreur: le prix devrait être '2000'";
    }

    @Test
    public void testGetMarque() {
        Voiture voiture = new Voiture("Toyota", 20000);
        assertEquals("Toyota", voiture.getMarque());
    }

    @Test
    public void testSetMarque() {
        Voiture voiture = new Voiture("Toyota", 20000);
        voiture.setMarque("Honda");
        assertEquals("Honda", voiture.getMarque());
    }

    /*
    // Une bonne façon de faire proposé M.LEMAIRE
    void when_getprix_should_return_correct_price(){

        // Arrange
        Voiture voiture = new Voiture(marque: "Ferrari", prix: 5000);

        // Act
        int expectedPrice = 5000;
        int price = Voiture.getPrix();

        // Verify
        Assert.isTrue(expression: voiture.getPrix() == expectedPrice, message: "Doit être " + expectedPrice)
    }
*/

}