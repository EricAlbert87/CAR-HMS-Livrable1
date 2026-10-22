package ca.uottawa.seg3102.carhms.domain.notifications

/**
 * Avis attendus des inscriptions, promotions, annulations et rappels.
 * Leur préparation et leur acheminement seront implémentés ultérieurement.
 */
enum class NotificationType {
    REGISTRATION_CONFIRMED,
    WAITLIST_POSITION,
    WAITLIST_PROMOTED,
    HIKE_CANCELLED,
    HIKE_REMINDER
}
