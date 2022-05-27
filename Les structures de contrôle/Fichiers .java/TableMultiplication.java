import java.util.Scanner;

public class TableMultiplication {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez selectionner une table de multiplication :");
        short table = scanner.nextShort();
        short multiplicateur = 0;

        while(multiplicateur<=10){
            System.out.println("----------Boucle While----------");
            System.out.printf("%s * %s = %s\n", table , multiplicateur,(short)(table * multiplicateur));
            System.out.println("Décompte avant la prochaine multiplication");
                for(short i=5; i>0;i--){
                    if(i==0){
                        System.out.println("----------Boucle For----------");
                    }
                    System.out.printf("%s \n", i);
            }
            multiplicateur++;
        }

    }
}
