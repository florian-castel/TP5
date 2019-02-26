public abstract class Employe {
    protected int numSecu;
    protected String nom;
    protected String prenom;
    protected int echelon;
    protected double base;
    protected double nbHeure;
    protected double salaireBrut;
    protected double salaire;
    protected double coeff = 0.8;



    public Employe(int numSecu, String nom, String prenom, int echelon, double base, double nbHeure) {
        this.numSecu = numSecu;
        this.nom = nom;
        this.prenom = prenom;
        this.echelon = echelon;
        this.base = base;
        this.nbHeure = nbHeure;
        this.calculerSalaire();
    }

    public abstract void calculerSalaire();

    @Override
    public String toString() {
        return "Employe : " +
                "numSecu=" + numSecu +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", echelon=" + echelon +
                ", base=" + base +
                ", nbHeure=" + nbHeure +
                ", salaireBrut=" + salaireBrut +
                ", salaire=" + salaire;

    }

    public void setCoeff(double coeff) {
        this.coeff = coeff;
    }

    public double getCoeff() {
        return coeff;
    }
}
