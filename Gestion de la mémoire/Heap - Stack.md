 la _pile( Stack )_ et le _tas(Heap)_

Pour comprendre la différence entre _la pile(stack)_ et _le tas(heap)_, nous allons écrire ensemble un programme et décortiquer son fonctionnement.

Ouvrz votre IDE Favoris et créez un nouveau projet, ainsi qu'une classe Main, avec la méthode main(), qui est le point de départ de notre programme
```java
public class Main {
public static void main(String[] args) {

	}
}
```

Déclarons une premiere variable _vitesseAutoroute_ et donnons lui une valeur de _130_.
Ajoutons ensuite une deuxième variable _vitesseVille_ avec comme valeur _50_
Ce qui donne :
```java
public class Main {
public static void main(String[] args) {
		int vitesseAutoroute = 130;
		int vitesseVille = 50;
	}
}
```

Pour pouvoir utiliser nos deux variables nous allons déclarer une méthode _radar_ qui prendra en paramètre une variable _vitesseActuel_.

```java
public class Main {
	public static void radar(int vitesseActuel, int vitesseAutoroute) {
		if(vitesseActuel > vitesseAutoroute)
			System.out.println("Vous roulez trop vite!!!");
		else
			System.out.println("Bonne route :)");
	}
	
	public static void main(String[] args) {
		int vitesseAutoroute = 130;
		int vitesseActuel = 130;
		radar(vitesseActuel , vitesseAutoroute);
		
	}
}

```

Regardons en schématisant,comment fonctionne la mémoire avec ce petit bout de code.

Lorsque nous clickons sur _Run_ pour éxecuter notre programme, le compilateur va rechercher notre _méthode main_, qui est l'entrée de notre programme et lui réserver un espace mémoire sur _la pile(stack)_.
La _pile_ fonctionne de manière ordonnée,plus précisement en __LIFO (Last In First Out__ , c'est comme si on posait un lot d'assiettes imbriqués sur la table, la première posée (celle tout en dessous de la pile) serait la dernière à être rangé.

![[StackMain.png]]
Mettons nous à la palce du compilateur et continuation à avancer dans notre programme ligne par ligne.
une fois à l'interieur de notre méthode main(),
nous arrivons sur les déclarations des variables _vitesseAutorouse_ et _vitesseActuel_.

Comment ça s'passe côté mémoire?

Un éspace mémoire leurs est aloués  à _l'interieur de l'espace mémoire aloué à la méthode main()_ comme sur le schéma ci-dessous.

![[Stack - Variables.png]]

Ligne suivante, nous arrivons sur l'appel de la méthode _radar_.
Nouvelle méthode, dit nouvelle couche sur notre _pile_ donc directement sur notre couche main.
Notre compilateur ayant détécté l'appel de notre nouvelle méthode, va aller entrer dans celle-ci afin de l'éxecuter.Ici méthode très simple, elle prend deux arguments et les soumets à une structure conditionnelle.
Les variables utilisés dans la méthode seront enregistré dans la mémoire aloué à la méthode, comme pour les variables de notre méthodes main().
Schématisons tout ça:
![[Stack - radar().png]]

Une fois notre condition vérifié, notre méthode retournera "Bonne route".N'ayantplus rien à éxecuter dans cet méthode, notre compilateur libera l'espace aloué à la méthode radar() et continuera l'éxécution de la méthode main().
notre stack ressemblerait à nouveau à ça :
![[Stack - Variables.png]]

Etant de retour dans notre méthode main() et n'ayant plus rien à éxecuter, l'espace mémoire lui étant aloué est lui aussi libéré et notre programme prend fin.

Maintenant que nous avons éclaircit le fonctionnement de la _pile_ , nous pouvons étudier le _tas_, qui lui est utilisé pour stocker les instances de nos classes.

Retournons à notre programme , créons une nouvelle classe Voiture, avec deux attributs.Le premier sera un String modele, le second sera un int vitesse ainsi qu'un constructeur permettant de les intialiser à la creation de l'instance.
```java
public class Voiture {
    String modele;
    int vitesse;
		Voiture(int vitesse, String modele) {
        this.vitesse = vitesse;
        this.modele = modele ;
    }
    }
```

Retournons dans notre fichier Main.java afin d'y déclarer une nouvelle variable de type voiture et afficher sa valeur dans la console
```java
public class Main {
	public static void radar(int vitesseActuel, int vitesseAutoroute) {
		if(vitesseActuel > vitesseAutoroute)
			System.out.println("Vous roulez trop vite!!!");
		else
			System.out.println("Bonne route :)");
	}
	
	public static void main(String[] args) {
		int vitesseAutoroute = 130;
		int vitesseActuel = 130;
		radar(vitesseActuel , vitesseAutoroute);
			
	Voiture peugeot308 = new Voiture(130, "Peugeot 308"); 
	System.out.println(peugeot308); // retourne l'adresse de l'objet
		
	}
}

```

Lorsque le compilateur arrive à la ligne où nous initialisons notre instance de la classe Voiture, un espace mémoire est aloué dans _le tas(heap)_ . La variable quant à elle sera stocker dans notre couche main() situé dans notre stack mais plutôt que de stocker directement notre objet, la variable stockera l'adresse à laquelle notre instance sera stocké ou en langage technique , la _reference de l'objet_.

En schématisant cela donnerait quelque chose comme ça:
![[Heap - Voiture.png]]

Pour bien comprendre ce principe de réference , nous pouvons essayer de créer une nouvelle variable de type Voiture en lui donant la valeur de notre variable peugeot308 et affichons la référence stocké dans chaques variables.

```java
public class Main {
	public static void radar(int vitesseActuel, int vitesseAutoroute) {
		if(vitesseActuel > vitesseAutoroute)
			System.out.println("Vous roulez trop vite!!!");
		else
			System.out.println("Bonne route :)");
	}
	
	public static void main(String[] args) {
		int vitesseAutoroute = 130;
		int vitesseActuel = 130;
		radar(vitesseActuel , vitesseAutoroute);
			
	Voiture peugeot308 = new Voiture(130, "Peugeot 308"); 
	System.out.println(peugeot308); // retourne l'adresse de l'objet
			
	Voiture nouvellePeugeot308 = peugeot308
	System.out.println(peugeot308);
	System.out.println(nouvellePeugeot308);
			
		
	}
}

```

Les deux variables devraient vous pointer vers la même adresse et donc vers la même instance, comme ci-dessous:
![[Heap - Double ref.png]]

Pour le vérifier et comprendre pourquoi cela peut nous poser problème, essayons de modifier les attributs de notre instance via nos deux variables et regardons ce qu'il se passe.

```java
public class Main {
	public static void radar(int vitesseActuel, int vitesseAutoroute) {
		if(vitesseActuel > vitesseAutoroute)
			System.out.println("Vous roulez trop vite!!!");
		else
			System.out.println("Bonne route :)");
	}
	
	public static void main(String[] args) {
		int vitesseAutoroute = 130;
		int vitesseActuel = 130;
		radar(vitesseActuel , vitesseAutoroute);
			
	Voiture peugeot308 = new Voiture(130, "Peugeot 308"); 
	System.out.println(peugeot308); // retourne l'adresse de l'objet
			
	Voiture nouvellePeugeot308 = peugeot308
	System.out.println(peugeot308);
	System.out.println(nouvellePeugeot308);
			
	System.out.println(peugeot308.modele + " " + nouvellePeugeot308.modele);		
	nouvellePeugeot308.modele = "Nouvelle peugeot 308";
  System.out.println(peugeot308.modele + " " + nouvellePeugeot308.modele);
	}
}

```

Vous voyez?Les deux variables pointant vers la même instance, il nous est possible de lui modifier ses attributs à partir des deux variables.
Cependant c'est quelques choses que nous souhaitons éviter, alors pour corriger ça, nous allons rompre le lien entre une variable et l'instance.
```java
public class Main {
	public static void radar(int vitesseActuel, int vitesseAutoroute) {
		if(vitesseActuel > vitesseAutoroute)
			System.out.println("Vous roulez trop vite!!!");
		else
			System.out.println("Bonne route :)");
	}
	
	public static void main(String[] args) {
		int vitesseAutoroute = 130;
		int vitesseActuel = 130;
		radar(vitesseActuel , vitesseAutoroute);
			
	Voiture peugeot308 = new Voiture(130, "Peugeot 308"); 
	System.out.println(peugeot308); // retourne l'adresse de l'objet
			
	Voiture nouvellePeugeot308 = peugeot308
	System.out.println(peugeot308);
	System.out.println(nouvellePeugeot308);
			
	System.out.println(peugeot308.modele + " " + nouvellePeugeot308.modele);		
	nouvellePeugeot308.modele = "Nouvelle peugeot 308";
  System.out.println(peugeot308.modele + " " + nouvellePeugeot308.modele);
	
	peugeot308 = null;
	}
}

```

Attribuer la valeur _null_ à notre variable permet de romptre le lien qui la lie à l'instance.


J'éspère que tout ceci vous aura permis de comprendre les bases de la gestion de la mémoire. Il est vraiment important de prendre le temps de le comprendre, cela facilitera l'apprentissage de la suite.D'ailleurs nous le verrons rapidement car le prochain article parlera de la Récursivité, ce qui nous permettera de réviser le principe de fonctionnement de notre _stack_.

Comme d'habitude n'hésitez pas à me dire ce que vous en pensez et me corriger si besoin.

Merci à vous <3
Franco