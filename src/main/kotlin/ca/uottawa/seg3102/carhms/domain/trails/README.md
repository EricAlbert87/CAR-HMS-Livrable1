# Catalogue des sentiers de la CCN

**Classification : support.** Ce sous-domaine adapte les données officielles nécessaires à la consultation et à la planification; le club n'est pas propriétaire du catalogue des sentiers (rapport, section 5.4).

## Responsabilités et limites

- Prévoir la consultation de l'identifiant, du nom, du type, de la surface, de la difficulté, de la saison, du secteur, de la zone, du stationnement, du tracé et du point de départ publiés par la CCN.
- Représenter les difficultés avec `TrailDifficulty` et les saisons publiées avec `TrailSeason` : `YEAR_ROUND`, `SUMMER` ou `WINTER`.
- Fournir à `hikes` les informations permettant de vérifier que la randonnée est permise sur le sentier et que la date appartient à sa saison d'ouverture.
- Prévoir une copie locale des dernières données officielles vérifiées pour la consultation en cas d'indisponibilité de la CCN (H02).

La CCN reste la source de référence. CAR-HMS ne permet pas de créer ou de modifier indépendamment des sentiers. `TrailSeason` décrit les catégories publiées; il ne fixe pas de mois d'ouverture, qui devront provenir des informations officielles. La difficulté d'une randonnée est celle de son sentier, et non une valeur libre saisie par l'organisateur.

## Commandes et contrats initiaux

Ce sous-domaine soutient `BrowseHikes` et `CreateHike`. Les contrats `parcourir_randonnees.feature` et `creer_randonnee.feature` décrivent la recherche et l'admissibilité des sentiers. Aucune commande autonome de gestion du catalogue n'est demandée au Livrable 1.

L'intégration CCN et le cache ne sont pas encore implémentés.
