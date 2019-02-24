public class Technicien extends Employe{
    public Technicien(int numSecu, String nom, String prenom, int echelon, double base, double nbHeure) {
        super(numSecu, nom, prenom, echelon, base, nbHeure);
    }

    public void effectuerTacheTechnique(){
        System.out.println("J'effectue une tâche technique");
    }
}
