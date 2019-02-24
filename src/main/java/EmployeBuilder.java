public class EmployeBuilder {
    private int numSecu;
    private String nom;
    private String prenom;
    private int echelon;
    private double base;
    private double nbHeure;

    public EmployeBuilder setNumSecu(int numSecu) {
        this.numSecu = numSecu;
        return this;
    }

    public EmployeBuilder setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public EmployeBuilder setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public EmployeBuilder setEchelon(int echelon) {
        this.echelon = echelon;
        return this;
    }

    public EmployeBuilder setBase(double base) {
        this.base = base;
        return this;
    }

    public EmployeBuilder setNbHeure(double nbHeure) {
        this.nbHeure = nbHeure;
        return this;
    }

    public Employe createEmploye() {
        return new Employe(numSecu, nom, prenom, echelon, base, nbHeure);
    }
}