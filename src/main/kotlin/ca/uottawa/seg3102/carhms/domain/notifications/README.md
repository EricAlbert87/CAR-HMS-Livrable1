# Notifications et rappels

**Classification : support.** Les communications accompagnent les inscriptions et les événements, sans décider de leur validité métier (rapport, section 5.5).

## Responsabilités et limites

- Distinguer les avis avec `NotificationType` : confirmation d'inscription, position en attente, promotion, annulation de randonnée et rappel.
- Prévoir les rappels la veille pour les inscrits confirmés, avec date, heure, sentier et point de rassemblement.
- Consulter les prévisions au point de départ pour la date de l'événement; inclure un avertissement si de la pluie ou de la neige est prévue.
- Préparer le rappel sans avertissement lorsque les prévisions sont indisponibles (H12).
- Prévoir la conservation d'une demande d'envoi lorsque le service de courriel est indisponible, sans annuler une opération métier validée (H11).

`hikes` fournit les détails et les annulations des événements; `registrations` fournit les confirmations, la liste d'attente et les promotions. Le service météorologique et le service d'acheminement des courriels sont deux dépendances externes. Ce sous-domaine ne modifie ni les places ni l'admissibilité d'un randonneur.

## Commandes et contrats initiaux

`SendHikeReminder.send` correspond à `envoyer_rappel.feature`. Les autres avis sont des effets attendus des contrats `s_inscrire_randonnee.feature`, `annuler_inscription.feature` et `annuler_randonnee.feature`.

Au Livrable 1, aucun client météo, serveur de courriel ou mécanisme de réessai n'est implémenté.
