# Les instructions de boucles

Ressources de l'article :


Les_ instructions de boucles_ permettent de répeter un certain nombre de fois une instruction ou un bloc de code.
Il existe 4 types de boucle en Java :
-L'instruction for
-L'instruction while
-L'instruction do while
-L'instruction for-each

Pour l'instant laissons de côté l'instruction for-each et étudions ensemble les 3 premières.

## L'instruction for
L'instruction __for__ nous permet de _répeter_ un bloc d'instructions autant de fois que nous le souhaitons.

Exemple :
```java
public class BoucleFor {  
    public static void main(String... args) {  
        for( short i=0; i<=12 ;i++ ) {  
            System.out.printf("Ceci est l'itération numéro %s \n", i+1);  
        }    }}

```

L'instruction __for__ commence par le mot réservé _for_, _suivi d'une parenthese_ comprenant 3 éléments optionnelles.
En effet il est possible d'initialiser une boucle for sans aucun élément mais cela génére une boucle infini, chose quenous souhaitons éviter.

Le premier élement de notre boucle for ,est __l'initialisation__, aussi appelé_ variable d'initialisation_.Dans celui ci, nous pouvons affecter une valeur à une variable déclarée à l'exterieur de notre boucle  soit d'y déclarer et initialiser une nouvelle variable.
Cet élement sera _exécuté une seul fois_, au début de la première itération.
En géneral nous utilisons une variable qui agit comme un compteur et que nous incrémenterons/décrémenterons à chaque itération.

Exemple:
```java
public class BoucleFor {  
    public static void main(String... args) {  
        //Déclaration d'une variable à l'exterieur de la boucle  
		short i;
        for( i=0; i<=12 ;i++ ) {  
            System.out.printf("Ceci est l'itération numéro %s \n", i+1);  
        }        //Déclaration et initialisation d'une nouvelle variable  
        for( short j=0; j<= 12; j++) {  
            System.out.printf("Ceci est l'itération numéro %s \n", j+1);  
        }  
    }}

```

Le second élement est __la condition__ à vérifier .Dans l'exemple ci-dessus, notre boucle __for__ s'éxecute t_ant que i est inférieur ou égal à 12_.
La condition est vérifiée avant chaque nouvelle itération.

Le troisième élement est_ l'expression finale_, qui est éxécutée à la fin de chaque itération.Cette expression est utilisée pour_ incrémenter ou décrémenter_ notre variable d'initialisation.
Exemple :
```java
public class BoucleFor {  
    public static void main(String... args) {  
  
        for( short i=0; i<1 ;i++ ) {  
            System.out.printf("Ceci est l'itération numéro %s \n", i+1);  
        }    }}
```

Dans cet exemple ,avant d'éxercuter la premiere itération, la condition_ i< 1_ est évaluée.Etant donné que notre variable_ i à comme valeur 0_ , la condition est vérifiée. Notre bloc d'instruction sera executé.
Une fois arrivé à la fin du bloc d'instruction, l'expression finale est éxécutée, notre variable_ i vaut maintenant 1._
Avant d'éxecuter à nouveau notre bloc d'instruction, la condition est évaluée,_ i valant 1_ , la condition retourne false ce qui met fin à notre boucle.

## L'instruction While

L'instruction__ While__ permet de répéter un bloc d'instruction _tant qu'une condition est vérifiée._

Exemple:
```java
public class BoucleWhile {  
    public static void main(String... args) {  
        short compteur = 0;  
        while(compteur <=12) {  
            System.out.printf("Ceci est l'itération numéro %s\n", compteur+1);  
            compteur++;  
        }    }}
```

L'instruction __while__ commence avec le mot-réservé_ while_ suivi d'une parenthese comprenant _la condition à évaluée_.
Son fonctionnement est _identique_ à la boucle _for_, une variable qui nous sert de compteur est déclarée et initialisée.
Ensuite elle sera évaluée. Si elle est vérifiée alors le bloc d'instruction sera éxécutée, dans le cas contraire la boucle prendra fin.

Autre exemple :
```java
import java.util.Scanner;  
  
public class TableMultiplication {  
    public static void main(String... args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Veuillez selectionner une table de multiplication :"); 
		
        short table = scanner.nextShort();  
        short multiplicateur = 0;  
		
        while(multiplicateur<=10){  
            System.out.printf("%s * %s = %s\n", table , multiplicateur,(short)(table * multiplicateur));  
            multiplicateur++;  
        }  
    }}
```


## L'instruction Do While

L'instruction __Do while__ fonctionne comme l'instruction __while__, à la seule différence que dans l'instruction __do while__ _la condition est évaluée à la fin du bloc d'instruction_.
De ce fait, le bloc d'instruction sera _éxécuté au minimum une fois._
Exemple :
```java
public class BoucleWhile {  
    public static void main(String... args) {  
        short compteur = 1;  
        do {  
            System.out.printf("Ceci est l'itération numéro %s de l'instruction do while\n ", compteur+1);  
            compteur2 ;  
        }       
		while(compteur <1);  
        System.out.println("Boucle do while terminée");  
    }
}
```

Nous voyons ici que malgré le fait que notre condition retourne _false_, notre instruction do est éxécutée.Pourquoi?
Car la condition sera évaluée uniquement après la première éxécution de l'instruction do.


## Imbriquation

Il est nous est possible d'imbriquer une boucle dans une autre.Ca nous sera très utile lorsque nous souhaiterons parcourir des tableaux.
Mais pour le moment reprenons le code de notre table de multiplication et ajoutons y un décompte entre chaque multiplication :
```java
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
```


Nous voici arrivé à la fin de cette deuxième partie.

J'éspère que ces deux articles vous aurons aidé à comprendre le fonctionnement des différentes structures de contrôle.
Il est vraiment important de bien les comprendres, n'hésitez pas à les revoirs toutes, une par une.
Surtout ne vous contentez pas de me lire, __exercez__ vous , faites vous des petits programmes, inventez vous des petits jeux, __pratiquez__ encore et encore jusqu'a ce que ce soit compris.

Comme me l'a dit récemment un ami dev :_La programmation est un marathon, pas un sprint_.

Merci d'avoir pris de votre temps pour me lire <3

Franco
