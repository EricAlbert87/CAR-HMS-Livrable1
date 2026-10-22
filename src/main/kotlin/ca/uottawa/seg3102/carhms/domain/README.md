# Carte des sous-domaines

Le découpage ci-dessous correspond à la section 5 du rapport de l'équipe. Chaque sous-paquetage possède un README précisant ses responsabilités, ses limites et ses liens avec les commandes ou contrats initiaux.

| Sous-paquetage | Classification | Responsabilité principale | Justification |
|---|---|---|---|
| [hikes](hikes/README.md) | Cœur | Planifier les randonnées et conserver leur cycle de vie. | Porte la gestion des événements propre au club. |
| [registrations](registrations/README.md) | Cœur | Gérer les places, l'admissibilité, les inscriptions et la liste d'attente. | Porte les règles centrales de participation et de promotion FIFO. |
| [members](members/README.md) | Support | Conserver les profils, les statuts d'adhésion et les certifications. | Fournit les informations nécessaires à la participation et à l'organisation. |
| [trails](trails/README.md) | Support | Consulter les caractéristiques officielles des sentiers de la CCN. | Adapte une source externe nécessaire à la planification. |
| [notifications](notifications/README.md) | Support | Préparer les avis et les rappels, avec les prévisions disponibles. | Soutient les opérations métier par la communication. |
| [identity](identity/README.md) | Générique | Authentifier les utilisateurs et déterminer leurs droits. | Réutilise des mécanismes communs à de nombreuses applications. |
| [reporting](reporting/README.md) | Support | Présenter les statistiques d'utilisation d'un sentier. | Exploite les données opérationnelles pour les besoins administratifs. |

## Échanges prévus

- `hikes` utilise les caractéristiques fournies par `trails` et les qualifications conservées par `members` pour valider une création.
- `registrations` utilise le statut et la capacité de `hikes`, ainsi que le statut d'adhésion et le niveau de `members`. Une inscription ou une annulation peut modifier les places et le statut de la randonnée.
- `notifications` utilise les résultats des inscriptions et des annulations, ainsi que les détails des randonnées, pour préparer les avis. Les prévisions météo et l'acheminement des courriels sont externes.
- `identity` fournit le contexte d'identité et les rôles aux opérations protégées. Les qualifications d'organisateur et l'admissibilité restent des informations métier.
- `reporting` consulte les données des randonnées et inscriptions sans modifier leur état.

Ces échanges décrivent des responsabilités attendues, pas des dépendances de services déjà implémentées. La [vue de contexte](../../../../../../../../docs/contexte-systeme.md) situe les acteurs et les services externes autour de CAR-HMS.

## Portée de la première livraison

Les énumérations représentent le vocabulaire initial du domaine. Les [interfaces de cas d'utilisation](../application/usecases/UseCases.kt) et les [DTO de requête](../application/dtos/queries/Queries.kt) définissent les commandes. Les [contrats Gherkin](../../../../../../../test/resources/contracts) décrivent les comportements futurs, sans définitions d'étapes exécutables.

La connexion, la déconnexion et la génération des rapports sont analysées dans le rapport, mais leurs interfaces et contrats sont exclus du code demandé au Livrable 1. Aucun connecteur CCN, météo ou courriel, aucune base de données et aucun service métier ne sont ajoutés à ce stade.
