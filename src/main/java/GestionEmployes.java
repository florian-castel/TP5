public class GestionEmployes {

    public static void main(String[] args) {
        Employe flo = new EmployeBuilder()
                .setNom("Florian")
                .setPrenom("Castel")
                .setNumSecu(3482)
                .setEchelon(2)
                .setBase(11)
                .setNbHeure(140)
                .createEmploye();
        System.out.println(flo.toString());
    }

}
