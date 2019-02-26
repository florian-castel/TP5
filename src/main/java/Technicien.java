public class Technicien extends Employe{
    public Technicien(Employe e) {
        super(e.numSecu, e.nom, e.prenom, e.echelon, e.base, e.nbHeure);
        this.calculerSalaire();
    }

    public void effectuerTacheTechnique(){ System.out.println("J'effectue une tâche technique"); }

    public void calculerSalaire(){
        this. salaireBrut = this.base * this.nbHeure + this.echelon * 100;
        this. salaire = coeff * this.salaireBrut;
    }
}
