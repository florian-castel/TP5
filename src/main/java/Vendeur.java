public class Vendeur extends Commercial {

    public Vendeur(Employe e, double chiffreAffaires, double tauxCommission) {
        super(e, chiffreAffaires, tauxCommission);
        this.calculerSalaire();
    }

    @Override
    public void negocierTranscation() {
        System.out.println("Je négocie une transaction en tant que vendeur");
    }
}
