public class Commercial extends Employe {
    private double chiffreAffaires;
    private double tauxCommission;

    public Commercial(int numSecu, String nom, String prenom, int echelon, double base, double nbHeure, double chiffreAffaires, double tauxCommission) {
        super(numSecu, nom, prenom, echelon, base, nbHeure);
        this.chiffreAffaires = chiffreAffaires;
        this.tauxCommission = tauxCommission;
    }

    public void negocierTranscation(){
        System.out.println("Je négocie une transaction");
    }
}
