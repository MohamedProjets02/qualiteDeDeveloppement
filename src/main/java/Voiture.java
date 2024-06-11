public class Voiture {

    private String marque;
    private double prix;

    // Constructeur sans paramètres
    public Voiture(){
        this.marque = marque;
        this.prix = prix;
    }

    // Constructeur avec paramètres
    public Voiture(String marque, float prix){
        this.marque = marque;
        this.prix = prix;
    }

    //Getter pour la marque
    public String getMarque(){
        return marque;
    }

    // Setter pour la marque
    public void setMarque(String marque){
        this.marque = marque;
    }

    // Getter pour le prix
    public double getPrix(){
        return prix;
    }

    //Setter pour le prix
    public void setPrix(double prix){
        this.prix = prix;
    }

    // Méthode toString pour retourner les détails de la voiture sous forme de chaîne de caractères
    @Override
    public String toString(){
        String result = "";
        return "Marque:" + this.marque + "Prix:" + this.prix + "€";
    }

}