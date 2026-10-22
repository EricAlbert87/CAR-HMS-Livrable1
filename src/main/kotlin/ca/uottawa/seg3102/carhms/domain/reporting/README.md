# Rapports d'utilisation des sentiers

**Classification : support.** Les statistiques répondent aux besoins administratifs en exploitant les informations produites par les sous-domaines cœur (rapport, section 5.7).

## Responsabilités et limites

- Prévoir la sélection d'un sentier et d'une période dont la date de début ne dépasse pas la date de fin.
- Présenter le nombre de randonnées, le nombre d'inscriptions confirmées et le nombre de randonnées annulées du sentier pour la période.
- Interpréter le nombre de participants comme le nombre d'inscriptions confirmées, selon H13; les présences physiques ne sont pas suivies.
- Prévoir des statistiques à zéro si aucune randonnée ne correspond aux critères.

`hikes` fournit les événements et leurs statuts, `registrations` les inscriptions et `trails` l'identification du sentier. `identity` permet de réserver l'accès aux administrateurs. Ce sous-domaine consulte les données sans modifier les randonnées, les inscriptions ou le catalogue CCN.

## Portée du Livrable 1

Le cas générer un rapport d'utilisation des sentiers est analysé dans le rapport. Son interface et son contrat sont explicitement exclus du code demandé pour cette livraison. Aucun calcul statistique ni export n'est encore implémenté.
