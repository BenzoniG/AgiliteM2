#language:fr
#Author: Guillaume BENZONI


Fonctionnalité: Emmenagement d'un nouvel habitant

  Scénario: Emménagement
    Soit un habitant et une ville
    Quand l'habitant emménage dans une ville
    Alors il est ajouté à la liste des habitants de cette ville


  Scénario: Déménagement
    Soit un habitant
    Quand l'habitant démménage
    Alors l'habitant n'est plus référencé dans sa ville d'origine mais sa nouvelle ville
    

  Scénario: suivi de l'évolution du covid
    Soit une ville contenant des habitants
    Quand le maire s'interroge sur la propagation du COVID entre les habitants
    Alors il peut afficher le % de la population infecté par le COVID-19    
    
    




# User stories

# guillaume idée: recenssement de la population pour une application de mairie
# ajouter un habitant qui emménage - créer une classe habitant
# supprimer un habitant qui déménage
# connaître la population totale d'un pays/ville
# connaître l'age moyen de la population
# connaître la proportion d'hommes/femmes


# @Fatima : traçage des habitants malades du Covid19
# ressement des habitants malades :
	# ajout/suppression d'un habitant infecté (positif, symptomatique, developpé des anticorps contre le covid19, etat de santé, statut malade)
	# modifier les informations d'un habitant malade
	# calcul du nombre d'hommes/femmes infectés (guéris/porteur/mort)
	# calcul du nombre d'habitants infectés par ville/pays 
	# proportion du nombre des habitants infecté par groupe d'âge
	# 




#			Exemples: 
#      | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |
