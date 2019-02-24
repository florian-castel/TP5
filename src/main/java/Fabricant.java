public class Fabricant extends Employe {
    private int nbUnitesProduites;
    private double tauxCommissionUnite;

    public Fabricant(int numSecu, String nom, String prenom, int echelon, double base, double nbHeure, int nbUnitesProduites, double tauxCommissionUnite) {
        super(numSecu, nom, prenom, echelon, base, nbHeure);
        this.nbUnitesProduites = nbUnitesProduites;
        this.tauxCommissionUnite = tauxCommissionUnite;
    }

    public void fabriquerProduit(){
        System.out.println("Je fabrique un produit");
    }
}
