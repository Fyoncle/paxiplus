<div align=center>

![Banner](https://cdn.modrinth.com/data/cached_images/a0960b8f0e55fe286b8293de334b80482b23d9e6.png)

<a href="https://modrinth.com/modpack/elysium-days" target="_blank" rel="noopener noreferrer">
  <img src="https://raw.githubusercontent.com/Fyoncle/Elysium-Days/main/ed_badge.png" alt="As seen in Elysium Days" width="200">
</a>

<br>
<br>

</div>

This is an addon for [Paxi](https://modrinth.com/mod/paxi), serving six purposes:
- Backporting the 1.21+ Paxi feature for loading packs from any folder <sub>(See [#33](https://github.com/YUNG-GANG/Paxi/issues/33))</sub>
  - <sub>Fixes a issue where developers are unable to get monetized due to Modrinth not recognizing the Paxi folder. If you use the resourcepacks folder it will embed them properly now.</sub>
- Making it possible to use Paxi for built-in resourcepacks and datapacks added by mods <sub>(See [#27](https://github.com/YUNG-GANG/Paxi/issues/27))</sub>
- Restricting Paxi from auto-loading packs in `config -> paxi -> resourcepacks` and `datapacks` if they're not listed in `resourcepack_load_order.json` or `datapacks_load_order.json` for datapacks.
- Letting Paxi generate datapack folder and JSON file on the start-up instead of after world generation
- Removes the unnecessary arrows on the packs that are loaded with Paxi to avoid confusion for modpack users
- Adding a `--user--` flag which let's you define where the user packs should go, can be helpful if you want the normally loaded packs to go above Paxi ones or anywhere you want

#

<div align=center>

### How to use?  
Unlike how old load order works, now you can specify directories in your instance's folder.  

Also, for using the built-in pack support, you need the ID of the pack. You can either check the mod's source code, try to guess it, or use the [Resource Pack Overrides](https://modrinth.com/mod/resource-pack-overrides) mod and hold **D** on the resourcepack screen to see the IDs of all packs.
## Paxi Load Order JSON Example:  
![LoadOrder](https://cdn.modrinth.com/data/cached_images/d738bec5830abdb67c9b63763936276ce5ed9ead.png)
## In Game:    
![InGame](https://cdn.modrinth.com/data/cached_images/402ddf12303ce35fee8938f0f6a2dc2d9c848463.png)

**It is NOT required to load `fabric` and other built-in packs with Paxi, it's there as an optional feature.**

</div>
