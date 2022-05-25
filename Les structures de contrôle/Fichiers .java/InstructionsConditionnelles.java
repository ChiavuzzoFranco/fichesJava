public class InstructionsConditionnelles {
    public static void main(String... args) {

        // Instruction if-else
        System.out.println("_________________________");
        System.out.println("IF-ELSE");
        short monAge = 33;
        short majorite = 18;
        if (monAge >= majorite) { //instruction conditionnelle if
            System.out.println("Vous êtes majeur"); //s'exécute uniquement si montage est >= à majorité
        } else { //instruction conditionnelle else
            System.out.println("Vous êtes mineur"); //// s'exécute si l'instruction cond. précédente n'est pas vérifiée (false).
        }
        // ________________________________________________________________________________________________________________
        //Instruction if -else if
        System.out.println("_________________________");
        System.out.println("IF-ELSE IF- ELSE");
        if (monAge <= 10) { // SI la condition est vrai ,
            System.out.println("Vous avez 10% de remise"); // ALORS vous avez 10%
        } else if ( monAge <= 20) { // SINON SI la condition est vrai
            System.out.println("Vous avez 20% de remise"); // ALORS vous avez 20%
        } else if (monAge <= 30) { // SINON SI la condition est vrai
            System.out.println("Vous avez 30% de remise"); // ALORS vous avez 30%
        } else if ( monAge >= 80 && monAge <= 100) {  // SINON SI condition ET condition
            System.out.println("Vous avez une remise de 80%"); // ALORS
        }else { // SI AUCUNE des conditions précédentes n'a été vérifiée
            System.out.println("Vous avez 50% de remise"); // ALORS vous avez 50%
        }

        //_____________________________________________________________________
        //Opérateur ternaire
        System.out.println("_________________________");
        System.out.println("Opérateur Ternaire");
        System.out.println(monAge < 18 ? "Vous êtes mineur" : "Vous êtes majeur");

        System.out.println("Opérateur Ternaire 2");
        short nombre1 = -15;
        short nombre2 = 30;
        System.out.println(nombre1 >= 0 ? "C'est un nombre positif" : "C'est un nombre négatif");
        System.out.println(nombre2 < 0 ? "C'est un nombre négatif" : "C'est un nombre positif");


        //______________________________________________________________________
        //Instruction switch
        System.out.println("_________________________");
        System.out.println("Instruction Switch");
        short nombre = 3;
        switch (nombre){ // évalue  la valeur puis exécute directement le case correspondant
            case  1 :
                System.out.println("Un");
                break;
            case 2 :
                System.out.println("Deux");
                break;
            case 3 :
                System.out.println("Trois");
                break;
            case 4 :
                System.out.println("Quatre");
                break;
            case 5 :
                System.out.println("Cinq");
                break;
        }

        System.out.println("Instruction Switch 2");
        switch (nombre){ // évaluation de la valeur puis exécute directement le case correspondant
            case 0 :
                System.out.println("La valeur est égale à 0");
                break;
            case  1 ,2 ,3 , 4 , 5 :
                System.out.println("La valeur est inférieur ou égale à 5");
                break;
            case 6 ,7 ,8 ,9 , 10 :
                System.out.println("La valeur est supérieur à 5 et inférieur ou égale à 10.");
                break;
            default : // case par défaut, il n'est pas obligatoire.
                System.out.println("La valeur est inférieur à zéro ou supérieur à 10.");
                break;
        }


    }
}
