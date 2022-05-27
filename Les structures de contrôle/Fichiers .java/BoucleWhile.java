public class BoucleWhile {
    public static void main(String... args) {
        short compteur = 0;
        while(compteur <=12) {
            System.out.printf("Ceci est l'itération numéro %s\n", compteur+1);
            compteur++;
        }

        short compteur2 = 1;
        do {
            System.out.printf("Ceci est l'itération numéro %s de l'instruction do while\n ", compteur2);
            compteur2 ++;
        }
        while(compteur2 <1);
        System.out.println("Boucle do while terminée");
    }
}
