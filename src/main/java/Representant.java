public class Representant extends Commercial {

    public Representant(Employe e, double chiffreAffaires, double tauxCommission) {
        super(e, chiffreAffaires, tauxCommission);
        this.calculerSalaire();
    }

    @Override
    public void negocierTranscation() {
        System.out.println("Je négocie une transaction en tant que représentant");
    }

    public void calculerSalaire(){
        this. salaireBrut = this.base * this.nbHeure + this.echelon * 100;
        this. salaire = coeff * this.salaireBrut;
    }
}
