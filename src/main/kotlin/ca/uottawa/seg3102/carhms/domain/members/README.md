# Profils, adhésions et certifications

**Classification : support.** Les données des membres rendent possibles l'inscription et l'organisation des randonnées, sans constituer l'objectif principal de CAR-HMS (rapport, section 5.3).

## Responsabilités et limites

- Décrire le profil : courriel unique, nom, téléphone, adresse, naissance, contact d'urgence et niveau `SkillLevel`.
- Conserver le statut `MembershipStatus` : `ACTIVE`, `EXPIRED` ou `SUSPENDED`.
- Prévoir l'enregistrement avec une invitation reconnue, la décharge et le consentement du tuteur pour un mineur (H06, H08, H14).
- Conserver l'approbation d'un organisateur, son numéro de certificat, ses dates de délivrance et d'expiration, ainsi que la difficulté maximale qu'il peut diriger (H10).

`identity` prend en charge les identifiants de connexion, les sessions et les rôles. Ce sous-domaine fournit à `registrations` le statut d'adhésion et le niveau d'habileté, et à `hikes` les qualifications de l'organisateur. Le niveau d'habileté du randonneur et le niveau maximal d'organisateur sont deux informations distinctes.

Le processus d'adhésion au club et l'émission initiale des invitations restent externes. CAR-HMS conserve et met à jour le statut nécessaire à l'admissibilité; il ne gère pas les ressources humaines du club.

## Commandes et contrats initiaux

`RegisterHiker.register` utilise `enregistrer_randonneur.feature`. Les trois commandes de `UpdateHiker` utilisent respectivement `mettre_a_jour_profil.feature`, `mettre_a_jour_adhesion.feature` et `approuver_organisateur.feature`.

Au Livrable 1, ces responsabilités sont documentées sans persistance ni services métier.
