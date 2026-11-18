# packages/lineage (stub)

Minimal stand-in for the LineageOS platform java modules that are absent from
the CLO/AOSPA base but referenced by the `hardware/samsung` apps
(SamsungDoze / AdvancedDisplay / SamsungEsimSwitcher) and `FlipFlap`:

- `org.lineageos.platform.internal`
  - `org.lineageos.internal.util.ScreenType`
  - `org.lineageos.internal.util.FileUtils`
  - `org.lineageos.internal.util.LineageLockPatternUtils`
- `org.lineageos.settings.resources`
  - resource-only library (package `org.lineageos.settings.device`) providing the
    `R` fields those apps reference (mdnie sysfs strings, `content_frame`,
    `screen_preferences`).

The original full definitions live in the (unmirrored) LineageOS
`platform_packages_lineage` repository. This stub supplies just enough for the
module graph to resolve and the apps to compile.
