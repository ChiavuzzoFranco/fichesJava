import java.util.Scanner;

public class JustePrix {
    public static void main(String... args) {
        //Créer un objet scanner qui lit les données entrées par l'utilisateur"
        Scanner scanner = new Scanner(System.in);

        //Etape 1 : Génerer un nombre aléatoire
        short random = (short)(Math.random() *100);

        //Etape 2 : Demander à l'utilisateur d'entrer une valeur
        System.out.println("Le juste prix à été générer, entrez une valeur entre 0 et 100.");


        short nbrUtilisateur = 101;
        //Etape 5 : Répeter le programme jusqu'a que l'utilisateur trouve le juste prix
        while(nbrUtilisateur != random) {
            //Etape 3 : stocker la valeur entrée dans la console par l'utilisateur
            //Enregistre la valeur entrée par l'utilisateur dans notre variable
            nbrUtilisateur = scanner.nextShort();
            //Etpae 4 : Comparer le nombre aléatoire avec la valeur de l'utilisateur puis gérer les différents cas.
            if (nbrUtilisateur < random) {
                System.out.printf("Le juste prix est plus grand que %s \n", nbrUtilisateur);
            } else if (nbrUtilisateur > random){
                System.out.printf("Le juste prix est plus petit que %s \n", nbrUtilisateur);
            }

        };
        System.out.printf("BRAVO! %s est bien le juste prix", nbrUtilisateur);

    }
}



