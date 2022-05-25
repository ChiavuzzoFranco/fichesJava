public class BlocScope {
    public static void main(String... args) {
        {// debut du premier bloc
            System.out.println("Début du premier bloc");

            String varPremierBloc = "Je suis la variable du premier bloc";
            System.out.println(varPremierBloc); //return Je suis la variable du premier bloc
//        System.out.println(varDeuximeBloc); // return Erreur

            { // début du deuxième bloc
                System.out.println("_________________________");
                System.out.println("Début du deuxième bloc");
                String varDeuxiemeBloc = "Je suis la variable du deuxième bloc";
                System.out.println(varPremierBloc); // return Je suis la variable du premier bloc

                { // début du troisième bloc
                    System.out.println("_________________________");
                    System.out.println("Début du troisième bloc");
                    String varTroisiemeBloc = "Je suis la variable du troisième bloc";
                    System.out.println( varPremierBloc); // return Je suis la variable du premier bloc
                    System.out.println(varDeuxiemeBloc); // return Je suis la variable du deuxième bloc
                    System.out.println(varTroisiemeBloc); // return Je suis la variable du troisieme bloc
                } // fin du troisième bloc
            } //fin du deuxième bloc
        }//fin du premier bloc
    }
}
