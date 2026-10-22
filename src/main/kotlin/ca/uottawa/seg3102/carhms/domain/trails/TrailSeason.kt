package ca.uottawa.seg3102.carhms.domain.trails

/**
 * Catégories de saison d'ouverture publiées par la CCN (CAR-Req-01, section 1.5).
 * Les dates d'ouverture doivent provenir des données officielles du sentier;
 * cette énumération ne définit pas de calendrier été/hiver.
 */
enum class TrailSeason {
    YEAR_ROUND,
    SUMMER,
    WINTER
}
