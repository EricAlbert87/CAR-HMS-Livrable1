# Identité et contrôle d'accès

**Classification : générique.** L'authentification, les sessions et l'autorisation selon les rôles sont des capacités communes à de nombreuses applications (rapport, section 5.6).

## Responsabilités et limites

- Prévoir la connexion avec courriel et mot de passe, ainsi que la déconnexion et la fin de session.
- Identifier les rôles authentifiés avec `UserRole` : `HIKER`, `HIKING_ORGANIZER` et `ADMINISTRATOR`.
- Fournir l'identité de l'acteur aux opérations protégées; les identifiants d'acteur des DTO doivent provenir du contexte authentifié côté serveur.
- Prévoir le contrôle des droits : profil personnel pour le randonneur, création pour l'organisateur qualifié et administration pour l'administrateur.

Un visiteur est un acteur non authentifié, pas un rôle enregistré. Un organisateur reste un randonneur; posséder un rôle d'organisateur ne remplace pas les vérifications de certification et d'adhésion de `members`. `SYSTEM` identifie une transition automatique dans l'historique et ne représente pas un compte humain ni un rôle authentifié.

Les règles d'admissibilité appartiennent à `registrations` et les règles de création à `hikes`. La confidentialité concerne toutes les données personnelles : ce seul paquetage ne suffit pas à assurer leur protection.

## Portée du Livrable 1

Les cas se connecter et se déconnecter sont décrits dans le rapport. Leurs interfaces et contrats sont explicitement exclus du code demandé pour cette livraison. `UserRole` constitue uniquement un vocabulaire initial; aucune session ni règle d'autorisation n'est encore implémentée.
