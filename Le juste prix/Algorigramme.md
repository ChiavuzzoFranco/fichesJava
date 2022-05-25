

Maintenant que nous avons vu les instructions conditionnelles , je pense que c’est le bon moment pour vous présenter un outil important lorsque nous souhaitons créer un programme complexe.
 
## Algorigramme

L'algorigramme est un outils / moyen permettant de schématiser l’éxécution d’un programme .
Plutot que de vous écrire de grandes lignes, voyons à quoi ressemble l'algorigramme d'un programme permettant de savoir si l'un nombre est pair ou impar :

![[Pasted image 20220525180507.png]]
https://ibb.co/89RBLLZ

Je suis sur qu'à peine avoir jetter un oeil à l'image, la logique du programme vous à sauté aux yeux , n'est ce pas?
C'est à cela que les logigramme servent, simplifier la lecture et la comprehension de la logique d'un programme.
Les logigrammes peuvent être utiliser dans différents domaines, même dans le developpement informatique, que ce soit pour schématiser le fonctionnement d'un site web, d'un jeu , qu'importe. Vous avez de la logique ? Utilisez un logigramme !


## Les symboles
Chaque symboles à une signification particulière. 

![[Pasted image 20220525181924.png]]
Les flèches indiquent les différents chemins de notre programme.

![[Pasted image 20220525181309.png]]
Ce symbole représente le point de départ et le points d'arrivé d'un chemin.

![[Pasted image 20220525182145.png]]
Ce symbole représente l'entrée et/ou la sortie de donnée, par exemple afficher quelques choses dans la console ou récuperer une valeur entrée par l'utilisateur.

![[Pasted image 20220525182347.png]]
Ce symbole représente les instructions conditionnelles.

![[Pasted image 20220525182609.png]]
Ce symbole indique une action de notre part, dans l'exercice que nous verrons tout à l'heure, nous l'utiliserons pour génerer un nombre aléatoire.

Biensûr, il existe pleins d'autres symboles mais avec ceux que nous venons de voir nous allons pouvoir réaliser un petit exercice sympathique , allons-y

## Exercice : Le juste prix.

Le juste prix est un jeu dans lequel notre programme génère un nombre entier  aléatoire entre 0 et 100. Notre objectif est de réussir à trouver le nombre géneré en entrant des valeurs dans la console.Le programme nous indiquera si la valeur que nous avons entré est inférieur, supérieur ou égal au nombre aléatoire généré.

Notre exercice consiste à créer un logigramme schématisant la logique de notre jeu Le juste prix.Puis l'utiliser afin de coder notre jeu en java.

Vous êtes prêts?Allons y.

### Le logigramme
Logigramme le juste prix :

![[Pasted image 20220525185656.png]]

Utilisons le pour créer notre programme :

### Génerer un nombre aléatoire.

Pour génerer un nombre aléatoire nous pouvons utiliser la méthode __random()__ se trouvant dans la classe __java.lang.Math__ . La méthode retourne un double positif supèrieur à 0 et inférieur à 1.
Pour notre jeu, nous avons besoin d'un nombre entier compris entre 0 et 100.Pour ce faire multiplier la valeur générer par random() par 100 puis utiiliser un cast short.
Ca donne ceci :
```java
public class JustePrix {  
    public static void main(String... args) {  
  
        //Génerer un nombre aléatoire  
        short random = (short)(Math.random() *100);  
        System.out.println(random);  //return valeur comprise entre 0 et 100.
  
    }}
```

Maintenant, nous devons indiquer à l'utilisateur que le nombre aléatoire à été généré et lui demander d'entré un nombre dans la console.

```java
public class JustePrix {  
    public static void main(String... args) {  
  
        //Etape 1 : Génerer un nombre aléatoire  
        short random = (short)(Math.random() *100);  
        //Etape 2 : Demander à l'utilisateur d'entrer une valeur  
        System.out.println("Le juste prix à été générer, entrez une valeur entre 0 et 100.");  
  
    }}

```


Récuperons la valeur entrée dans la console par notre utilisateur et stockons là dans une variable.

```java
import java.util.Scanner;  
  
public class JustePrix {  
    public static void main(String... args) {  
        //Créer un objet scanner qui lit les données entrée par l'utilisateur"  
        Scanner scanner = new Scanner(System.in);  
  
        //Etape 1 : Génerer un nombre aléatoire  
        short random = (short)(Math.random() *100);  
  
        //Etape 2 : Demander à l'utilisateur d'entrer une valeur  
        System.out.println("Le juste prix à été générer, entrez une valeur entre 0 et 100.");  
  
        //Etape 3 : stocker la valeur entrée dans la console par l'utilisateur  
                //Enregistre la valeur entrée par l'utilisateur dans notre variable  
        short nbrUtilisateur = scanner.nextShort();  
        System.out.println(nbrUtilisateur);  
    }}
```

Si vous souhaitez plus d'informations concernant la classe Scanner : https://fr.tutorialcup.com/java/java-scanner.htm

Maintenant que nous avons récuperer la valeur de notre utilisateur, nous devons la comparer à notre nombre aléatoire puis gérer les différents cas.

```java
import java.util.Scanner;  
  
public class JustePrix {  
    public static void main(String... args) {  
        //Créer un objet scanner qui lit les données entrée par l'utilisateur"  
        Scanner scanner = new Scanner(System.in);  
  
        //Etape 1 : Génerer un nombre aléatoire  
        short random = (short)(Math.random() *100);  
  
        //Etape 2 : Demander à l'utilisateur d'entrer une valeur  
        System.out.println("Le juste prix à été générer, entrez une valeur entre 0 et 100.");  
  
        //Etape 3 : stocker la valeur entrée dans la console par l'utilisateur  
        //Enregistre la valeur entrée par l'utilisateur dans notre variable        short nbrUtilisateur = scanner.nextShort();  
  
        //Etpae 4 : Comparer le nombre aléatoire avec la valeur de l'utilisateur puis gérer les différents cas.  
        if(nbrUtilisateur < random){ 
            System.out.printf("Le juste prix est plus grand que %s", nbrUtilisateur);  
        } else if ( nbrUtilisateur > random) {  
            System.out.printf("Le juste prix est plus petit que %s", nbrUtilisateur);  
        } else {  
            System.out.printf("BRAVO! %s est le juste prix!!!!",nbrUtilisateur);  
        }    }}
```

Ca fonctionne mais nous avons un petit problème, le programme ne fonctionne qu'une seule fois ..règlons ce problème à l'aide d'une boucle while.

```java
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
            //Enregistre la valeur entrée par l'utilisateur dans notre variable            nbrUtilisateur = scanner.nextShort();  
            //Etpae 4 : Comparer le nombre aléatoire avec la valeur de l'utilisateur puis gérer les différents cas.  
            if (nbrUtilisateur < random) {  
                System.out.printf("Le juste prix est plus grand que %s \n", nbrUtilisateur);  
            } else if (nbrUtilisateur > random){  
                System.out.printf("Le juste prix est plus petit que %s \n", nbrUtilisateur);  
            }  
        };        System.out.printf("BRAVO! %s est bien le juste prix", nbrUtilisateur);  
  
    }}

```


Et voilà ! Nous avons crée notre Juste prix à l'aide du logigramme. 
Biensûr , faire un logigramme n'est pas obligatoire mais cela permet de réfléchir à la logique de notre programme en créeant le logigramme puis de simplifier sa mise en place en la décomposant par étape.

J'éspère que vous avez aimé ce format, je sais qu'on a utilisé pas mal de choses que nous n'avons pas encore abordé ensemble , si vous avez des zones d'ombres, faites une petite recherche sur google ou contactez moi via twitter, je vous aidera avec grand plaisir :)

Je vous dis à demain pour la deuxième partie des structures de contrôles.

Franco.