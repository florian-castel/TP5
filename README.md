# ![](ressources/logo.jpeg) Bases de la programmation orientée objet 

### IUT Montpellier-Sète – Département Informatique

* **Cours:** [M2103](http://cache.media.enseignementsup-recherche.gouv.fr/file/25/09/7/PPN_INFORMATIQUE_256097.pdf) - support [ici](https://github.com/IUTInfoMontp-M2103/Ressources)
* **Enseignants:** [Marin Bougeret](mailto:marin.bougeret@umontpellier.fr), [Sébastien Gagné](mailto:sebastien.gagne@umontpellier.fr), [Victor Poupet](mailto:victor.poupet@umontpellier.fr), [Petru Valicov](mailto:petru.valicov@umontpellier.fr), [Bruno Yun](mailto:bruno.yun@umontpellier.fr) 
* Le [forum Piazza](https://piazza.com/class/jpv7gf0lltk4kc) de ce cours pour poser vos questions
* [Email](mailto:petru.valicov@umontpellier.fr) pour une question d'ordre privée concernant le cours.
* Le [sujet du TP](http://pageperso.lif.univ-mrs.fr/~petru.valicov/Cours/M2103/TP5.pdf) en format .pdf téléchargeable et imprimable.

Avant de démarrer le TP, vérifiez que vous n'avez pas atteint votre quota d'espace de stockage autorisé :

* placez-vous dans votre `$HOME` et utilisez les commandes suivantes :
    * `du -sh` pour voir combien d'espace vous avez déjà utilisé
    * `du -sh *` pour voir combien d'espace vous avez déjà utilisé pour chaque fichier (sans fichiers cachés)
    * `du -sch .[!.]* *` pour voir combien d'espace vous avez déjà utilisé pour chaque fichier, y compris les fichiers cachés
* Supprimez les fichiers inutiles.
* Pour éviter des problèmes durant vos TPs d'informatique, vous devriez toujours **garder 300-400 Mo d'espace libre**.


### Consignes
- Sauf indication contraire, **tous** les attributs que vous allez déclarer dans ce TP (et dans les TPs qui suivent) doivent être privés (`private`).
- A priori, la plupart des méthodes devraient être déclarées publiques (`public`). Vous pouvez tout de même déclarer et utiliser des méthodes `private` du moment qu'elles vous sont utiles et que votre programme fonctionne correctement.
- Pensez à respecter les conventions de nommage *Java* (vues en [cours](http://pageperso.lif.univ-mrs.fr/~petru.valicov/Cours/M2103/BPOO_Generalites_x4.pdf) ou disponibles sur le site d'Oracle)
- Dans ce TP, un principe important que vous devriez essayer de respecter dans votre code est le principe
[DRY](https://fr.wikipedia.org/wiki/Ne_vous_r%C3%A9p%C3%A9tez_pas)



## TP5
#### _Thème : Héritage : réutiliser, mais ne pas en abuser_

Cliquez sur le lien ci-dessous pour faire votre fork privé du TP :

LIEN GITHUB CLASSROOM À AJOUTER ICI

Vous êtes chargés de proposer une application de gestion des employés dans une entreprise.
L’objectif est de développer votre application de manière incrémentale, en ajoutant les fonctionnalités demandées au fur
et à mesure __sans modifier les fonctionnalités écrites précédemment__. Ce que l'on considère ici comme _modification_
c'est effacer et/ou réécrire du code précédemment écrit. _Ajouter_ du code sans modifier le code pécédent est donc
une opération valide. On dira ici, que pour chaque modification de votre programme (effacement et réécriture) la
[dette](https://fr.wikipedia.org/wiki/Dette_technique) de votre logiciel augmente.
Afin de respecter les divers principes en programmation orientée objets (encapsulation, DRY, YAGNI etc.), dans ce TP,
vous essayerez d'éviter au maximum de _modifier_ le programme écrit précédemment pour ne pas trop augmenter cette dette...


# Exercice 1

1. Dans un premier temps vous devez modéliser les employés qui sont représentés par les données suivantes : numéro de
sécurité sociale, nom, prénom, échelon (entier naturel), date d’embauche. Implémentez la classe `Employe`
correspondante et ajoutez-y un constructeur approprié.

2. On souhaite pouvoir calculer le salaire brut et le salaire net d'un employé.  Le salaire brut de l’employé se calcule
 de la manière suivante : `base * nbHeures`, où `base` et `nbHeures` seront des attributs de type `double`.
 Le salaire net représente 80% du salaire brut. Ajoutez le code nécessaire pour intégrer ces fonctionnalités.
 
3. Redéfinissez la méthode `toString()` dans la classe `Employe` pour afficher les informations concernant un employé
(y compris ses salaires brut et net).
 
4. Si votre client vous demande de changer (modifier donc) la formule de calcul du salaire brut, combien de modifications
devez-vous faire pour que votre programme continue de fonctionner correctement ? Est-ce que vous pouvez faire mieux ?

5. Vérifiez votre solution dans le programme principal (la classe `GestionEmployes`). Vous y instancierez plusieurs
employes et afficherez les informations les concernant.


# Exercice 2

1. Maintenant votre client se rend compte qu’une séparation des traitements est nécessaire pour les différents types
de salariés. Il faut spécifier les cas des _Commerciaux_, _Techniciens_, et les autres employés qu’on appellera
_Employés Ordinaires_. Implémentez les classes correspondantes en les faisant hériter de la classe `Employe`.

2. Un commercial peut négocier des transactions (avec la méthode `negocierTransaction()`), un technicien fabrique des
produits (méthode `fabriquerProduit()`), un employé ordinaire effectue les autres tâches dans l’entreprise
(méthode `effectuerTacheOrdinaire()`). Chacune de ces méthodes sont des méthodes de type `void` et se contentent
d'afficher un message approprié pour montrer leur bon fonctionnement. Par exemple, la méthode `negocierTransaction()`
devra afficher ”_Je négocie une transaction_”.

3. Le calcul des salaires bruts des différents types d’employés est différent pour chaque type concret d'employé :
    * Le salaire brut d’un employé ordinaire est composé de son salaire brut en tant qu’employé + une majoration
    en fonction de son échelon. Dans notre exemple, le résultat de ce calcul devrait correspondre à 
    `base ∗ nbHeures + echelon ∗ 100`.
    * Le salaire brut d’un commercial dépend du chiffre d’affaires qu’il réalise. Ainsi, le salaire brut se calcule
    suivant la formule `base + chiffreAffaires ∗ tauxCommission`, où `chiffreAffaires` et `tauxCommission` sont
    des attributs de type `double`.
    * Le salaire brut d’un technicien est calculé de la même manière que le salaire brut d’un employé en ajoutant une
    rémunération supplémentaire en fonction du rendement. Dans notre exemple, le résultat de ce calcul devrait
    correspondre à `base ∗ nbHeures + nbUnitesProduites ∗ tauxCommissionUnite`, où `nbUnitesProduites` est un attribut
    de type `int` et `tauxCommissionUnite` est un attribut de type `double`.
    * La modalité de calcul du salaire net demeure inchangé pour tous les employés (à savoir 80% du salaire brut).
    
   Ajoutez le code nécessaire pour effectuer ce traitement. Pour cela vous _redéfinirez_ la méthode calcul de salaire brut
   dans chaque classe d'employé spécifique.

4. Le patron est devenu plus généreux et a décidé d’ajouter 100€ au salaire brut de tous ses employés ! Combien de
modifications devez-vous apporter à votre code, pour que ça fonctionne ?

5. Maintenant, votre client se rend compte qu’un commercial ne peut pas être un simple commercial (donc ne peut pas être
instancié en tant que tel), mais doit être distingué en tant que _vendeur_ ou _représentant_. Ajoutez les deux classes
correspondantes en faisant un héritage et en ajoutant le code qui vous paraît nécessaire. 

6. Faites en sorte que la méthode de calcul du salaire brut d'un technicien soit la même que la méthode de calcul du
 salaire brut d'un commercial, alors que la formule de calcul du salaire brut des représentants est la même
que celle utilisée pour le salaire brut des _employés ordinaires_. Ajoutez cette extension dans votre application sans
dupliquer du code (principe [DRY](https://fr.wikipedia.org/wiki/Ne_vous_r%C3%A9p%C3%A9tez_pas)) et sans modifier le code
précédemment écrit pour ne pas augmenter la dette de votre logiciel.