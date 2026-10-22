# CAR-HMS — Livrable 1 (SEG 3502, automne 2026)

Projet de contrats initiaux en Kotlin : 7 sous-domaines, 9 interfaces de cas d'utilisation, 11 commandes, DTO et 11 fichiers Cucumber/Gherkin.

## Consulter le projet

- `src/main/kotlin/ca/uottawa/seg3102/carhms/domain` : structure de domaine, README et types d'énumération.
- [Contexte du système](docs/contexte-systeme.md) : acteurs, services externes et frontière du CAR-HMS, en lien avec le diagramme du rapport.
- [Carte des sous-domaines](src/main/kotlin/ca/uottawa/seg3102/carhms/domain/README.md) : classification, responsabilités, échanges et liens vers les contrats.
- `src/main/kotlin/ca/uottawa/seg3102/carhms/application/usecases/UseCases.kt` : interfaces des 9 cas (sauf connexion, déconnexion et rapport).
- `src/main/kotlin/ca/uottawa/seg3102/carhms/application/dtos/queries/Queries.kt` : DTO des 11 commandes.
- `src/main/kotlin/ca/uottawa/seg3102/carhms/application/dtos/results/Results.kt` : DTO de retour (complément facultatif).
- `src/test/resources/contracts` : 11 contrats Gherkin initiaux (documentation exécutable future, **sans définitions des étapes**).
- `Rapport_Livrable1.md` : texte du rapport à personnaliser.

## Compilation

Importer comme projet Gradle Kotlin dans IntelliJ IDEA et synchroniser les dépendances, ou utiliser Java 21 + Gradle installés : `gradle compileKotlin`.

Aucune implémentation des services métier, aucun contrôleur Web et aucune définition de pas Cucumber ne sont fournis : ces composants ne sont pas exigés au Livrable 1. Les fichiers `.feature` définissent des comportements attendus mais ne s'exécutent pas encore comme tests automatisés.

## Choix de conception

Pour résoudre la contradiction « randonnées ouvertes » / « liste d'attente si complète », les randonnées complètes restent visibles aux fins d'inscription sur liste d'attente. `actorId` doit toujours être dérivé de l'authentification côté serveur (jamais considéré comme une autorité si fourni directement par un client).

Les README des sous-domaines précisent leur périmètre et la justification de leur classification, conformément aux sections 4 et 5 du rapport de l'équipe. Les types `UserRole`, `TrailSeason` et `NotificationType` complètent le vocabulaire initial du domaine; ils ne mettent pas encore en œuvre l'autorisation, le calcul des saisons ou l'envoi de courriels.
