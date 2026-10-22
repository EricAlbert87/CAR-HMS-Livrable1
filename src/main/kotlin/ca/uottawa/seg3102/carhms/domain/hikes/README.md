# Gestion des randonnées

**Classification : cœur.** La planification et le cycle de vie des événements constituent une fonction principale propre au Club de randonnée Cairn (rapport, section 5.1).

## Responsabilités et limites

- Décrire une randonnée : identifiant, titre, description, sentier, organisateur, début, durée, date limite et capacité.
- Prévoir les validations de création : sentier admissible, saison d'ouverture, certification valide au départ, niveau d'organisateur suffisant et dates cohérentes (H05, H10).
- Conserver le statut `HikeStatus` : `OPEN`, `FULL`, `CLOSED`, `CANCELLED` ou `COMPLETED`, ainsi que l'historique et l'auteur des transitions (H09).
- Prévoir la fermeture à la date limite et l'annulation avant le départ avec un motif.

Les données officielles des sentiers appartiennent à `trails`; les qualifications proviennent de `members`. `registrations` gère les inscriptions et signale les changements de places. Une annulation de randonnée doit être coordonnée avec l'annulation des inscriptions et les avis de `notifications`. La randonnée physique et le suivi des présences sont hors portée.

## Commandes et contrats initiaux

Les interfaces `BrowseHikes`, `CreateHike`, `CloseHike` et `CancelHike` sont définies dans `application.usecases`. Leurs contrats sont `parcourir_randonnees.feature`, `creer_randonnee.feature`, `fermer_randonnee.feature` et `annuler_randonnee.feature`.

Au Livrable 1, seuls le vocabulaire, les interfaces, les DTO et les contrats sont fournis; les règles et transitions ne sont pas encore implémentées.
