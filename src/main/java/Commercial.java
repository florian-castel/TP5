public abstract class Commercial extends Employe {
    private double chiffreAffaires;
    private double tauxCommission;

    public Commercial(Employe e, double chiffreAffaires, double tauxCommission) {
        super(e.numSecu, e.nom, e.prenom, e.echelon, e.base, e.nbHeure);
        this.chiffreAffaires = chiffreAffaires;
        this.tauxCommission = tauxCommission;
        this.calculerSalaire();
    }

    public abstract void negocierTranscation();

    public void calculerSalaire(){
        this. salaireBrut = this.base + this.chiffreAffaires * this.tauxCommission;
        this. salaire = coeff * this.salaireBrut;
    }
}
