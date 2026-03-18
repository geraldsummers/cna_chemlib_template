# CNA ChemLib Forge Template

Template repository for Minecraft `1.20.1` Forge mods built with Kotlin and pre-wired for:

- Create
- Create: New Age
- ChemLib
- EMI

## Included baseline

- Forge `47.4.10`
- Kotlin for Forge `4.11.0`
- Create release `6.0.8` using the matching Create Maven build `6.0.8-289`
- Create: New Age `1.1.7f`
- ChemLib `2.0.19`
- EMI `1.1.22+1.20.1+forge`
- Java toolchain `17`

## What to change for a new mod

1. Update the mod metadata values in `gradle.properties`.
2. Rename the Kotlin package under `src/main/kotlin`.
3. Rename `TemplateMod.kt` and change the hardcoded `MOD_ID` constant so it matches `mod_id`.
4. Replace the placeholder issue tracker URL and author name.

## Commands

```bash
./gradlew runClient
./gradlew runServer
./gradlew runData
./gradlew build
```

## Notes

- Create is pulled from the official Create Maven using the matching development artifact for release `6.0.8`.
- Create: New Age, ChemLib, and EMI are wired through Curse Maven file IDs so the dev runtime includes the same jars you plan to ship against.
- EMI is added as a client-side dependency by default in `mods.toml`, since its `1.20.1` Forge release is optional on dedicated servers.
