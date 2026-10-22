# Inscriptions et listes d'attente

**Classification : cœur.** L'admissibilité, l'attribution des places et la promotion automatique répondent directement aux besoins de participation du club (rapport, section 5.2).

## Responsabilités et limites

- Décrire une inscription par son identifiant, le randonneur, la randonnée, l'horodatage et le statut `RegistrationStatus` : `CONFIRMED`, `WAITLISTED` ou `CANCELLED`.
- Prévoir les vérifications d'adhésion active, de difficulté admissible, de date limite et d'unicité d'une inscription non annulée (H03, H07).
- Confirmer une inscription si une place est libre; sinon la placer à la fin de la liste d'attente horodatée.
- Prévoir l'annulation avant la limite, la promotion du premier inscrit en attente si une place confirmée se libère et la cohérence des places restantes.

`members` fournit l'adhésion et le niveau d'habileté. `hikes` fournit la capacité, la difficulté et le cycle de vie de l'événement. Les changements d'inscription et de capacité doivent être coordonnés; ce sous-domaine ne possède pas un second cycle de vie de randonnée. `notifications` prépare les courriels de confirmation, de position en attente et de promotion après validation de l'opération.

## Commandes et contrats initiaux

Les interfaces `SignUpForHike` et `CancelSignUp` correspondent aux contrats `s_inscrire_randonnee.feature` et `annuler_inscription.feature`. L'annulation de toutes les inscriptions lors de l'annulation d'un événement est aussi décrite dans `annuler_randonnee.feature`.

Au Livrable 1, les contrats expriment les comportements attendus; la file FIFO et les changements atomiques ne sont pas encore implémentés.
