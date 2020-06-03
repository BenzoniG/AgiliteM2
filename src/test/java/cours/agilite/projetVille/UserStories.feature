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
    
    

