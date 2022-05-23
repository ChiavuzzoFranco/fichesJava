Maintenant que nous connaissons les différents types de valeurs et comment les stocker , découvrons ensemble comment les manipuler à l'aide d'opérateur.

Il existe différentes catégories d'opérateurs classés selon leurs utiltés :

- Les opérateurs arithmétiques.
- Les opérateurs d'affectations.
- Les opérateurs de comparaisons.
- Les opérateurs logiques.


## Opérateurs Arithmétiques 

Il existe 7 opérateurs arithmétique :
  Opérateur d'addition concaténation  :  " +"
  	Exemple : 
  ```java
// Additions
	byte a = 7 + 6; // return 13.
	byte b = 7;
	byte c = 6;
	byte d = b + c; // return 13.

//Concaténation 
	String hello = " Hello";
	String world = " World";
	String helloWorld = hello + " " + world; // return Hello World
  ```
  
  Opérateur de soustraction :  "-"
  Exemple :
   ```java
// Soustractions 
	byte a = 19 - 6; // return 13.
	byte b = 19;
	byte c = 6;
	byte d = b - c; // return 13.

  ```
  
  Opérateur de multiplication : "*"
  Exemple :
   ```java
// Multiplications 
	byte a = 2 * 13; // return 26.
	byte b = 2;
	byte c = 13;
	byte d = b * c; // return 26.

  ```

  Opérateur de division :  "/"
  C'est ici que ça commence à ce corser.;
  En effet, si nous souhaitons diviser deux nombres entiers, par exemple:
   ```java
// Divisions
	int a = 2 / 2 //return 1
  ```
Ici pas de problème,  on a une variable de type int à laquelle nous assignons une division de deux entiers retournant aussi un entier , facile.

Maintenant essayons une autre divisions :
```java
// Divisions
	int a = 1 / 2; // Essayez de deviner la valeur retournée.
  ```

On pourrait croire que cette opérations retournerait 0.5 , le résultat logique de l'oparation n'est ce pas? Mais non pas du tout , cela retourne 0. Qu'a t-on fait des 0.5 manquant? Etudions ça ensemble.
```java
// Divisions
	int a = 1 / 2; // return 0
// Nous avons déclarer une valeur de type int , souvenez vous , une variable de type int peut uniquement contenir un entier , de ce fait, le résultat de l'opération étant  une valeur décimale ( 0.5), une conversion automatique s'effectue et comme nous l'avons vu dans la partie conversion, lorsque nous voulons convertir un type float en int, il y a une perte de précision (toute la partie décimale).

  ```

Je me met à votre place, vous devez surement vous dire :
 - "Alors si je souhaite que l'oparation me retourne 0.5, il me suffit simplement de modifier le type de la variable avec le type float, facile."

Hé bah non mon poulet, ce n'est pas si simple ... mais essayons  pour comprendre pourquoi
```java
// Divisions
	float a = 1 / 2; // return 0.0
  ```

"Saperlipopette , toujours pasbon , qu'est ce que c'est que ce bordel !? C'est pourtant simple non!?"

Simple oui..mais un peu farfelu..

Pour commencer, nous pouvons voir que le résultat est bien de type float car il possède une décimale, certe pas la bonne mais c'est que ça marche.
Mais alors, comment faire pour avoir notre 0.5 manquant.

En Java, le type du résultat d'une division d'entier correspondra au type du numérateur.
Lorsque le numérateur est de type int (entier ), comme dans notre cas , alors si le résultat de la division est censé être une nombre décimal, alors il y aura une perte de précision du à la conversion automatique.

```java
// Divisions
	float a = 1 / 2;

  ```
- 1 est un entier donc le résultat sera un entier.
- (1 / 2 )= 0.5 mais sauvegardé en entier cela fera 0.
-  Nous avons donc a = 0 , mais vu que a est de type float, cela nous retournera 0.0.

Pour régler notre problème, il nous faut déclarer notre numérateur en type float.

```java
// Divisions
	float a = 1F / 2; //return 0.5

  ```

BINGO! Nous avons enfin réussi , bien joué les poulets.
Nous pouvons enfin passer à l'oparateur suivant :D


- Opérateur modulo : " %" :
	Cette opérateur permet aussi de réaliser une division mais plutot que de nous renvoyer le quotient il nous renvoie le reste.
	Exemple
	```java
// Divisions avec modulo
	int a = 9;
	int b = 4;
	int modulo = a % b; // return 1;

  ```
	
	Souvenez vous , effectuer une division euclidienne d'un nombre a (ici  par un autre nombre b, c'est trouver combien de fois il y a b (4 ) dans a ( 9) et combien il reste.
	
	Faisons le ensemble , dans 9 il y a une fois 2 x 4  ( 8) et reste 1 ( 8 + 1 = 9).
	
	Cette opérateur peut par exemple nous être utile pour savoir si un nombre entier est paire ou impair.
	Un nombre entier pair est un nombre divisible par 2 , c'est à dire qu'en utilisant le modulo le résultat doit être 0.
	
	Exemple
	```java
// Divisions avec modulo
	//Nombre pair
	int a = 8 % 2 // return 0 donc a est pair;
	int b = 9 % 2 // return 1 donc b est impair

  ```
	
### Opérateur d'incrémentation et décrémentation

Ces deux opérateurs permettent d'ajouter ou de soustraire 1 à une valeur.
Ils sont utilisables sous deux formes, forme suffixe et forme préfixe.
La différence entre les deux formes concerne le moment où l'effet de bord est appliqué. Avec la forme préfixe, il est appliqué avant que l'opérateur ait fait son opération. Pour la forme suffixe, l'opération est effectuée et l'effet de bord est ensuite appliqué. Voyons tout de suite une illustration de cette différence avec l'exemple de la figure 8 qui affiche ce qui suit à l'écran lors de son exécution
Exemple :
```java
// Incrémentation et décrémentation suffixe
	int a = 1;
	System.out.println(a++);//return 1
	System.out.println(a--);//return 2

// Incrémentation et décrémentation préfixe
	System.out.println(++a);//return 2
	System.out.println(--a);//return 1

  ```

## Opérateurs d'égalité et de comparaison

Ces opérateurs renvoient une valeur de type booléen ( true ou false).
Ils nous seront utiles pour afficher des données sous conditions qu'une variable est égale à une autre par exemple, mais nous verrons ça plus tard.

Il existe 2 opérateurs d'égalités et 4 de comparaisons :
	Opérateurs d'égalité:
	Opérateurs égal : " == "
	Exemple
```java
//Opérateur égal
String a = "Hello";
String b = "World";
System.out.println(a==b); // return false

int c = 2;
int d = 2;
System.out.println(c==d); // return true

char e = 'a';
char f = 'A';
System.out.println(e == f) // return  false
	
char e = 'a';
char f = 'a';
System.out.println(e == f) // return  true
```
Opérateurs différent de  : " != "
	Exemple
```java
//Opérateur différent de
String a = "Hello";
String b = "World";
System.out.println(a!=b); // return true

int c = 2;
int d = 2;
System.out.println(c!d); // return false


```
		
Opérateurs de comparaisons:
	Opérateurs plus petit que  : " < "
	Exemple
```java
//Opérateur plus petit que

int c = 1;
int d = 2;
System.out.println(c < d); // return true

```
		
	
Opérateurs plus petit ou égal à   : " <= "
	Exemple
```java
//Opérateur plus petit ou égal à

int c = 2;
int d = 2;
System.out.println(c <= d); // return true

```

Opérateurs plus grand que  : " > "
	Exemple
```java
//Opérateur plus grand que

int c = 1;
int d = 2;
System.out.println(c > d); // return false

```

Opérateurs plus grand ou égal à  : " >= "
	Exemple
```java
//Opérateur plus grand ou égal à

int c = 3;
int d = 2;
System.out.println(c <=d); // return true

```
		
## Opérateurs logique

Les opérateurs logiques s'appliquent sur des opérandes booléens et produisent un résultat qui est également booléen.
Il existe 6 opérateurs logique, 1 de unaire et 5 binaire.
Opérateurs logique unaire :
Opérateur NON logique : " !"
Permet d'inverser la valeur de son opérande.
Exemple :
```java
//Opérateur plus grand ou égal à

boolean a = true;
System.out.println(!a) // return false

```
	
Opérateurs logique binaire:
Opérateur ET logique : "&"
Exemple :
```java
//Opérateur plus grand ou égal à

boolean a = true;
boolean b =true;
boolean c = false;
System.out.println(a & b) // return true
System.out.println(a & c) // return false

```
	
Pour que le résultat du ET logique soit true, il faut que les deux opérandes valent true.

Opérateur OU logique inclusif  : "|"
Exemple :
```java
//Opérateur plus grand ou égal à

boolean a = true;
boolean b =true;
boolean c = false;
boolean d = false
System.out.println(a | b) // return true
System.out.println(c | d) // return false
System.out.println(a | d) // return true

```
	
Pour que le résultat du OU logique inclusif  soit true,  il faut au moins qu'un des deux opérandes vaut true.

Opérateur OU logique exclusif  : "^"
Exemple :
```java
//Opérateur plus grand ou égal à

boolean a = true;
boolean b =true;
boolean c = false;
boolean d = false
System.out.println(a | b) // return false
System.out.println(c | d) // return false
System.out.println(a | d) // return true

```
	
Pour que le résultat du OU logique exclusif  soit true,  il faut uniquement qu'un seul des deux opérandes vaut true.

Les 2 opérateurs restant sont une version "amélioré" du ET logique (&) et du OU logique ( | ) qui s'écrivent sous la forme  && et || .

Quel est la différence entre la version logique ( & et |) et la version court-circuit (&& et ||).

Lorsque nous utilisons les opérateurs logique & et | , le compilateur étudiera la valeur des deux opérandes même si cela n'est pas nécessaires.
Exempe :
```java
// ET logique
boolean a = false
boolean b = true;
System.out.printlg(a & b) // return false
```

Rappelez vous, pour que le résultat d'un opérateur ET logique soit true , il faut que les deu opérandes soit de valeurs true.
Dans notre cas, notre variable a vaut false donc il nous d'étudier la valeur du premier opérande àfin de savoir que notre opérateur ET logique nous retournera false.
Pourtant en utilisant le ET logique(&), le compilateur ira quand même étudier la valeur de b , ce qui est inutile bien entendu et ce qui niveau perfomance n'est pas bon du tout, enfin ce n'est plus forcément vrai aujourd'hui, ça l'était surtout avant java 8 mais nous y reviendrons dans un autre article.

Pour remédier à ce problème, nous pouvons utiliser  l'opérateur court-circuit du ET logique.

Exempe :
```java
// ET logique
boolean a = false
boolean b = true;
System.out.printlg(a && b) // return false
```

Cette fois ci , le compilateur , sachant que la variable a vaut false , n'ira pas tester la variable b car il sait que le résultat dans notre opérateur court-circuit ET logique sera de toute manière false.

Biensûr la même chose est valable  avec l'opérateur OU logique.

Je vous conseil de ne pas trop vous poser de question  et de toujours privilégier le && et || plutot que leur version simple.








