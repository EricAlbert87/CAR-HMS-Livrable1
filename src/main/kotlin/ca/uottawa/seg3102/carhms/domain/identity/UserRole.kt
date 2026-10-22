package ca.uottawa.seg3102.carhms.domain.identity

/**
 * Rôles des utilisateurs authentifiés décrits dans le contexte du système.
 * Un organisateur reste un randonneur; sa certification relève de members.
 * Un visiteur et l'acteur technique SYSTEM ne sont pas des rôles authentifiés.
 * Cette énumération ne met pas en œuvre les contrôles d'autorisation.
 */
enum class UserRole {
    HIKER,
    HIKING_ORGANIZER,
    ADMINISTRATOR
}
