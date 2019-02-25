public class Fabricant extends Employe {
    private int nbUnitesProduites;
    private double tauxCommissionUnite;

    public Fabricant(Employe e, int nbUnitesProduites, double tauxCommissionUnite) {
        super(e.numSecu, e.nom, e.prenom, e.echelon, e.base, e.nbHeure);
        this.nbUnitesProduites = nbUnitesProduites;
        this.tauxCommissionUnite = tauxCommissionUnite;
        this.calculerSalaire();
    }

    public void fabriquerProduit(){
        System.out.println("Je fabrique un produit");
    }

    private void calculerSalaire(){
        this. salaireBrut = this.base * this.nbHeure + this.nbUnitesProduites * this.tauxCommissionUnite;
        this. salaire = coeff * this.salaireBrut;
    }
}
