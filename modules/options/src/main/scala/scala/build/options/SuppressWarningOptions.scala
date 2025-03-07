package scala.build.options

final case class SuppressWarningOptions(
  suppressDirectivesInMultipleFilesWarning: Option[Boolean] = None,
  suppressOutdatedDependencyWarning: Option[Boolean] = None,
  suppressExperimentalFeatureWarning: Option[Boolean] = None,
  suppressDeprecatedFeatureWarning: Option[Boolean] = None
)

object SuppressWarningOptions {
  implicit val hasHashData: HasHashData[SuppressWarningOptions] = HasHashData.derive
  implicit val monoid: ConfigMonoid[SuppressWarningOptions]     = ConfigMonoid.derive

  val suppressAll = SuppressWarningOptions(
    suppressDirectivesInMultipleFilesWarning = Some(true),
    suppressOutdatedDependencyWarning = Some(true),
    suppressExperimentalFeatureWarning = Some(true)
  )
}
