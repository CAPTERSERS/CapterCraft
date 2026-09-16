# CapterCraft — Minecraft 1.21.1

<a href="https://www.minecraft.net/" target="_blank" rel="noopener noreferrer"><img src="https://img.shields.io/badge/Minecraft-1.21.1-green.svg" alt="Minecraft"></a>
<a href="https://github.com/Architectury/ArchitecturyAPI" target="_blank" rel="noopener noreferrer"><img src="https://img.shields.io/badge/Architectury-API-blue.svg" alt="Architectury"></a>
<a href="https://fabricmc.net/" target="_blank" rel="noopener noreferrer"><img src="https://img.shields.io/badge/Fabric-Loader-purple.svg" alt="Fabric"></a>
<a href="https://neoforged.net/" target="_blank" rel="noopener noreferrer"><img src="https://img.shields.io/badge/NeoForge-Loader-orange.svg" alt="NeoForge"></a>
<a href="https://captersers-org.gitbook.io/captersers-org/" target="_blank" rel="noopener noreferrer"><img src="https://img.shields.io/static/v1?message=Documentation&logo=gitbook&logoColor=ffffff&label=%20&labelColor=B22222&color=000" alt="GitBook"></a>

This branch is the **mod source for Minecraft 1.21.1** (Fabric and NeoForge). Project overview and docs live on [`main`](https://github.com/CAPTERSERS/CapterCraft/tree/main). Changelog for this version: [`CHANGELOG.md`](CHANGELOG.md).

Vanilla 1.21.1 has no copper tools or armor. This branch **adds** copper nuggets, tools, and armor (stats aligned with vanilla copper from 1.21.11, between stone and iron).

## Requirements

- Java 21
- Architectury API 13.0.8+
- Fabric Loader 0.16.14+ and Fabric API, **or** NeoForge 21.1.191+

## Build

```bash
git clone -b 1.21.1 https://github.com/CAPTERSERS/CapterCraft.git
cd CapterCraft
./gradlew build
```

Jars land in `fabric/build/libs` and `neoforge/build/libs`.

## License

Code: MIT. Textures, models, and icons: All Rights Reserved (ARR).
