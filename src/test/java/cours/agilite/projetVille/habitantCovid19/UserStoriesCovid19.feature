#language:fr
#Author: Fatima DIANI

#En tant que analyste de données de santé des habitants de la ville

Fonctionnalité: Gestion des habitants infectés

  Scénario: détection d'un nouveau cas Covid19
    Soit un habitant malade 
    Quand l'habitant est testé positif
    Alors la ville/pays contient un habitant infecté de plus

#				Exemples: 
#	|  |  |		|  |  |  |  |  |
#	|  |  |		|  |  |  |  |  |
#	|  |  |		|  |  |  |  |  |

  Scénario: evolution de l'état de santé d'un habitant infecté
    Soit un habitant déjà malade
    Quand l'état de l'habitant change de <etat1> à <etat2> 
    Alors enregistrement du nouvel <etat2> de l'habitant malade


#				Exemples: 
	| etat1 | etat2 |
	| benin | moyen |
	| moyen | grave |
	| benin | grave |
	

	  Scénario: evolution du statut de santé d'un habitant infecté
    Soit un habitant déjà malade
    Quand le statut de l'habitant change de <statut1> à <statut2> 
    Alors enregistrement du nouveau <statut2> de l'habitant malade


#				Exemples: 
	| statut1 | statut2 |
	| porteur | gueri |
	| porteur | mort |
	
	
	  Scénario: apparition des symptomes chez les malades
    Soit un habitant testé positif asymptomatique <symptomes1>
    Quand les symptomes apparaissent
    Alors modification de la valeur de <symptomes1> à <symptomes2>


#				Exemples: 
	| symptomes1 |symptomes2|
	| false |true|
	