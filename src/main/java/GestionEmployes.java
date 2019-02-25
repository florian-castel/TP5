public class GestionEmployes {

    public static void main(String[] args) {
        Technicien flo = new Technicien (
                new EmployeBuilder()
                .setNom("Florian")
                .setPrenom("Castel")
                .setNumSecu(3482)
                .setEchelon(2)
                .setBase(11)
                .setNbHeure(140)
                .createEmploye());
        flo.effectuerTacheTechnique();

        Commercial adrien = new Commercial(
                new EmployeBuilder()
                .setNom("Adrien")
                .setPrenom("Autef")
                .setNumSecu(2154)
                .setEchelon(1)
                .setBase(12)
                .setNbHeure(130)
                .createEmploye(),
                1500,
                2);
        adrien.negocierTranscation();

        Fabricant sacha = new Fabricant(
                new EmployeBuilder()
                        .setNom("Sacha")
                        .setPrenom("Trigrine")
                        .setNumSecu(1547)
                        .setEchelon(2)
                        .setBase(10)
                        .setNbHeure(150)
                        .createEmploye(),
                50,
                3);
        sacha.fabriquerProduit();

    }

}
