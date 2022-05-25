
Jusqu'à maintenant, toutes les instructions que nous avons vu étaient interpretés de façon sequentielles , c'est à dire qu'elles étaient éxécutés les une après les autres.

Dans cet article nous allons voir comment écrire des instructions qui seront éxécutés uniquement si une ou plusieurs conditions soient remplies, aussi appelé **instructions conditionnelles**

_Exemple en pseudo code:_

```
monAge = 33
Si monAge est > à 18
	afficher "Vous êtes majeur"

Sinon
	afficher " Vous êtes mineur"

```

Pour commencer , ce qu'est _un bloc d'instruction_ ainsi que_ la portée (scope)_ des variables lorsqu'elles sont imbriqués dans un bloc.

## Bloc D'instructions

Comme son nom l'indique, _un bloc d'instruction_ est un _container_ pouvant contenir une ou plusieurs instructions. Un bloc commence et se termine par des accolades (**{ }**)

### Portée d'une variable

La _portée(scope)_ d'une variable est la partie du programme dans laquelle une variable est accessible. Sa portée est lié au bloc dans laquelle elle est déclarée.

Étudions cela ensemble, pour ce faire nous allons créer un premier block dans lequel nous allons _imbriquer_ un deuxième.
Imbriquons aussi un troisième bloc dans le deuxième.

```java
{// début du premier bloc
  { // debut du troisième bloc
    {// début du troisième bloc

    } // fin du troisième bloc
  } // fin du deuxième bloc 

  {//début du quatrieme bloc , enfant du premier
  }//fin du quatrième bloc
} // fin du premier bloc
```

Le deuxieme bloc etant imbriqué dans le premier, on peut dire qu’il est_ l’élement enfant_ de ce dernier, qui lui est _l’élement parent._

A son tour, le deuxieme bloc est_ l’élement parent_ du troisieme bloc.

Vous pouvoir voir aussi qu’a chaque niveau de parenté, il y a une tabulation supplémentaire qui se met en place, cela s'appelle_ l'indentation_.

Celle-ci n’est pas obligatoire mais cela nous facilite la lecture du code.

Maintenant que nous savons ce qu’est un bloc et comment ils peuvent s’imbriquer , regardons comment se comportent les variables à travers les différents blocs.

Pour commencer, je déclare une variable dans mon premier bloc et l’affiche dans la console, chose que nous avons l'habitude de faire depuis le premier article.

Regardons maintenant _la portée de la variable_ varPremierBloc, c’est à dire_ la partie du programme dans laquelle notre variable est accessible._

Pour cela essayons de l’afficher dans nos 2 autres blocs

```java
{// debut du premier bloc 
	  String varPremierBloc = "Je suis la variable du premier bloc";
		System.out.println = "varPremierBloc"

   { // debut du deuxieme bloc
      String varDeuxiemeBloc = "Je suis la variable du deuxieme bloc";
			System.out.println = "varPremierBloc" // return Je suis la variable du premier bloc

      { // debut du troisième bloc       
          String varTroisiemeBloc = "Je suis la variable du premier bloc";
					System.out.println = "varPremierBloc" // return Je suis la variable du premier bloc
      } // fin du troisième bloc

   } //fin du deuxième bloc

}//fin du premier bloc
```

Comme vous pouvez le voir, la variable varPremierBloc est accessible dans tous les blocs, pourquoi?

Car une **variable déclarée dans un bloc est disponible dans tous ses blocs enfants**, c’est à dire dans tous les blocs imbriquer dans lui même.

Voyons avec la variable varDeuxiemeBloc ce que ça donne.

```java
{// debut du premier bloc 
	  String varPremierBloc = "Je suis la variable du premier bloc";
		System.out.println = "varPremierBloc"
    System.out.println = "varPremierBloc" // return Erreur

   { // debut du deuxieme bloc
      String varDeuxiemeBloc = "Je suis la variable du deuxieme bloc";
			System.out.println = "varPremierBloc" // return Je suis la variable du premier bloc

      { // debut du troisième bloc       
          String varTroisiemeBloc = "Je suis la variable du premier bloc";
					System.out.println = "varPremierBloc" // return Je suis la variable du premier bloc
					System.out.println = "varDeuxiemeBloc" // return Je suis la variable du premier bloc
      } // fin du troisième bloc

   } //fin du deuxième bloc

}//fin du premier bloc
```

Comme nous l’avons vu tout à l’heure, le deuxième bloc étant parent du troisième, aucun problème pour afficher notre varDeuxiemeBloc.

Par contre nous avons une erreur dans notre premier bloc, en effet, __une variable est disponible uniquement pour ses blocs enfants, la transmission est uniquement descendente , c’est à dire qu’un bloc parent n’a pas connaissance de ce qu’il se passe dans un bloc enfant.__

Si ce n’est pas très clair, essayez de le refaire seul et voyez ça comme un arbre généalogique dans lequel l’histoire (les variables) se transmettent uniquement des parents aux enfants.

## Instruction conditionnelle

Les _instructions conditionnelles_ permettent d’executer du code sous réserve d'une condition.

Voyons ça en pseudo code:

```java
monAge = 33;
majorite = 18;

SI monAge >= majorité // instruction conditionnelle 
	AFFICHER Vous êtes majeur. // s'execute uniquement si monAge est >= à majorité
SINON // instruction conditionnelle
	AFFICHER Vous êtes mineur. // s'execute si l'instruction cond. précedente n'est pas vérifiée (false).
```

### Les instructions if - else

L’instruction __if__ permet d’executer une instruction_ si la condition est vérifiée_.Une condition retourne_ un booléen (true false)_ et pour qu’elle _soit vérifiée_ elle doit retourner la _valeur true._

Si elle _n’est pas vérifiée_ ce sera la condtion __else__ qui sera éxécutée.

Reprenons le pseudo code du dessus et appliquons notre instruction conditionnelle __if-else__

```java
short monAge = 33;
short majorite = 18;

if (monAge >= majorite) { //instruction conditionnelle if
	System.out.println("Vous êtes majeur"); //s'execute uniquement si monAge est >= à majorité
} else { instruction conditionnelle else 
		System.out.println("Vous êtes mineur"); //// s'execute si l'instruction cond. précedente n'est pas vérifiée (false).
}
```

### Les instructions if - else if

Nous venons de voir les instructions _if - else_ qui sont utiles lorsqu’il y a qu'une seule condition à vérifier, dès lors qu’il y en a plusieurs, nous pouvons utiliser l’instruction __else if__ autant de fois qu’il y a de conditions.

Dans la condition, il est possible d’utiliser tous les Opérateurs d’égalité et de comparaison mais aussi les Opéarateurs logiques.

Exemple :

```java
short monAge = 33;
if (monAge <= 10) { // SI la condition est vrai , 
	System.out.println("Vous avez 10% de remise"); // ALORS vous avez 10%
} else if ( monAge <= 20) { // SINON SI la condition est vrai
	System.out.println("Vous avez 20% de remise"); // ALORS vous avez 20%
} else if (monAge <= 30) { // SINON SI la condition est vrai
	System.out.println("Vous avez 30% de remise"); // ALORS vous avez 30%
} else if ( monAge >= 80 && monAge <= 100) {  // SINON SI condition ET conditon
	System.out.println("Vous avez une remise de 80%"); // ALORS
}else { // SI AUCUNE des conditions précédentes n'a été vérifiée
	System.out.println("Vous avez 50% de remise"); // ALORS vous avez 50%
}
```

### Opérateur ternaire

__L’opérateur ternaire__ est un opérateur qui comporte _3 opérandes_. Il est utilisé comme _un raccourcis_ de nos instructions conditionnelles_ if-else_.
Exemple :
```java
short monAge = 15;       
System.out.println(monAge < 18 ? "Vous êtes mineur" : " Vous etes majeur");
							    
```

_L’instruction ternaire_ de notre exemple peut se lire comme ceci :

Est ce que (monAge < 18 ) ? Si oui _(symbole (”__?__”)_ , afficher “Vous êtes mineur “, sinon_ (symbole(”__:__”)_ afficher “Vous êtes majeur.

Voici d’autres exemple pour mieux comprendre , entrainez vous à les lire comme la précédente et essayez de deviner la valeur qui sera retournée :

```java
short nombre1 = -15;
short nombre2 = 30;
System.out.println(nombre1 >= 0 ? "C'est un nombre positif" : " C'est un nombre nétatif");
System.out.println(nombre2 < 0 ? "C'est un nombre négatif" : " C'est un nombre positif");

```

_Bon à savoir :_

_Opérateur unaire_ : Opéarateur avec _un seul opérandes._
_Opérateurs binaire_ : Opéarateur avec _deux opérandes._
_Opérateurs ternaire_ : Opéarateur avec _trois opérandes_

## Instruction switch

L’instruction _switch_ n’est ni plus ni moins qu’une manière différente d’écrire une instructon if - else if - else.

Exemple:

```java
short nombre = 3; 
switch (nombre){ // evalue  la valeur puis execute directement le case correspondant
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
```

Dans une instruction switch, nous passons l’expression à évalué en argument du switch , ensuite le programme exécute directement le case correspondant à notre à cette valeur puis execute l’instruction break , qui permet de quitter notre instruction switch, nous y reviendrons en fin d’article.

Il est aussi possible de combiner plusieurs valeurs dans un case ainsi qu’ajouter une valeur par défault si aucun case correspond à notre valeur.

Exemple :
```java
short nombre = 4; // 
switch (nombre){ // evaluation de la valeur puis execute directement le case correspondant
    case 0 :
		System.out.println("La valeur est égale à 0");
	case  1 ,2 ,3 , 4 , 5 :
        System.out.println("La valeur est inférieur  ou égale à 5");
        break;
    case 6 ,7 ,8 ,9 , 10 :
        System.out.println("La valeur est suppérieur à 5 et inférieur ou égale à 10.");
        break;
    default : // case par défault, il n'est pas obligatoire.
				System.out.println("La valeur est inférieur à zéro ou suppérieur à 10.");
}
```