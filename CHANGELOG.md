# Changelog

All notable changes to the CapterCraft mod will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Planned
- Additional material tiers
- More world generation features
- Enhanced crafting mechanics
- Additional effects

## [1.0.1] - 2026-09-13

### Changed
- **Copper Tool Stats** aligned with vanilla copper from Minecraft 1.21.11
  - 190 durability (was 180)
  - 5.0x mining speed (unchanged)
  - 1.0 attack damage bonus (was 1.5)
  - 13 enchantability (was 8)
  - Repairable with Copper Ingots
- **Copper Attack Modifiers** match vanilla copper / stone tools
  - Axe: 7.0 damage, -3.2 speed (was 6.5, -3.2)
  - Hoe: -1.0 damage, -2.0 speed (was -1.5, -1.5)
  - Sword, pickaxe, and shovel modifiers unchanged
- **Copper Armor** durability multiplier 11 (was 10)
  - Helmet 121, Chestplate 176, Leggings 165, Boots 143
  - Body defense 4 (was 3)
  - Piece defense 1 / 3 / 4 / 2, enchantability 8, toughness 0 (unchanged)
- **Copper Harvest Level** matches stone: incorrect for iron-tier and diamond-tier blocks
- README summary updated for this Minecraft version

### Technical
- Mod version 1.0.1
- Supports Minecraft 1.21.1
- Compatible with Fabric Loader 0.16.14+
- Compatible with NeoForge 21.1.191+
- Requires Architectury API 13.0.8+

## [1.0.0] - 2025-07-02

### Added
- **Copper Tier Equipment**
  - Complete tool set: Sword, Pickaxe, Axe, Shovel, Hoe
  - Complete armor set: Helmet, Chestplate, Leggings, Boots
  - 180 durability, 5.0x mining speed, 1.5 attack damage bonus
  - 8 enchantability, repairable with Copper Ingots

- **Enderite Tier Equipment**
  - Complete tool set: Sword, Pickaxe, Axe, Shovel, Hoe
  - Complete armor set: Helmet, Chestplate, Leggings, Boots
  - 3120 durability, 10.0x mining speed, 5.0 attack damage bonus
  - 18 enchantability, fire resistant, repairable with Enderite Ingots

- **New Materials**
  - Copper Nugget - 9 nuggets = 1 ingot conversion
  - Enderite Ingot - 9 ingots = 1 block conversion
  - Enderite Shard - obtained from smelting Void Shards

- **New Blocks**
  - Block of Enderite - decorative block
  - Medium Weighted Pressure Plate - activates with 75 entities
  - Void Shard - rare ore found in The End dimension

- **World Generation**
  - Void Shards generate in The End (outer islands)
  - Veins of size 3 plus smaller veins of size 2
  - Height range: Y 32–80 (trapezoid)

- **Crafting System**
  - Material conversion recipes (nugget ↔ ingot, ingot ↔ block)
  - Smelting recipes for raw blocks and Void Shards
  - Recycling recipes for copper equipment
  - Enderite Upgrade Smithing Template

- **Localization**
  - English (en_us) language support
  - Spanish (es_es) language support

### Technical
- Built with Architectury API for cross-platform compatibility
- Supports Minecraft 1.21.1
- Compatible with Fabric Loader 0.16.14+
- Compatible with NeoForge 21.1.186+
- Requires Architectury API 13.0.8+

### Balance
- Copper tier positioned between Stone and Iron
- Enderite tier positioned above Netherite
- Balanced durability and damage values
- Appropriate enchantability for each tier
- Fire resistance for Enderite equipment

### Compatibility
- Full compatibility with vanilla Minecraft
- Designed to work alongside other mods
- No conflicts with existing content
- Proper tag integration for tool effectiveness

---

## Version History

### Version 1.0.1
- **Release Date**: September 13, 2026
- **Minecraft Version**: 1.21.1
- **Architectury API**: 13.0.8
- **Fabric Loader**: 0.16.14+
- **NeoForge**: 21.1.191+

### Version 1.0.0 (Initial Release)
- **Release Date**: December 19, 2024
- **Minecraft Version**: 1.21.1
- **Architectury API**: 13.0.8
- **Fabric Loader**: 0.16.14+
- **NeoForge**: 21.1.186+

### Key Features Introduced
1. **Copper Tier**: Early-game equipment tier
2. **Enderite Tier**: End-game equipment tier
3. **Void Shard Generation**: New ore in The End
4. **Medium Weighted Pressure Plate**: Redstone component
5. **Material Conversion System**: Flexible crafting options
6. **Recycling System**: Resource recovery from equipment
7. **Smithing Template**: Enderite upgrade system

### Technical Achievements
- Cross-platform compatibility (Fabric + NeoForge)
- Proper mod architecture with Architectury API
- Comprehensive localization system
- Balanced gameplay progression
- Vanilla-friendly design philosophy

---

## Contributing to Changelog

When adding new entries to this changelog, please follow these guidelines:

1. **Use the existing format** and structure
2. **Group changes** by type (Added, Changed, Deprecated, Removed, Fixed, Security)
3. **Provide clear descriptions** of what was changed
4. **Include version numbers** and dates
5. **Reference issues** when applicable

## Links

- [GitHub Repository](https://github.com/CAPTERSERS/CapterCraft)
- [Issue Tracker](https://github.com/CAPTERSERS/CapterCraft/issues)
- [Download Page](https://github.com/CAPTERSERS/CapterCraft/releases)
