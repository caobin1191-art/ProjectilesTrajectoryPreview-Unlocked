<div align="center">
  <img src="https://raw.githubusercontent.com/maDU59/ProjectilesTrajectoryPreview/1.21/src/main/resources/assets/ptp/icon.png" width="150">
  <h1>Projectile Trajectory Preview</h1>

  <a href="https://modrinth.com/mod/ptp"><img src="https://img.shields.io/badge/dynamic/json?color=158000&label=downloads&prefix=+%20&query=downloads&url=https://api.modrinth.com/v2/project/preyrsIh&logo=modrinth"></a>
  <a href="https://curseforge.com/minecraft/mc-mods/ptp"><img src="https://cf.way2muchnoise.eu/full_1348218_downloads.svg"></a>
</div>

Ever wondered where your arrow, snowball, or potion will land? This mod gives you a visual preview of projectile trajectories and highlights the target impact zone—perfect for planning shots with precision.

Latest version can be downloaded on [Modrinth](https://modrinth.com/mod/ptp)

## 🔎 Features

- Trajectory Visualization: See the path your projectile will follow before you launch it.
- Target Highlighting: Know exactly where your shot is likely to land.
- Customizable Display: Tailor the look of the trajectory line, target outline, and highlight to suit your style.

## ⚙️ Configuration

To edit the settings of the mod:
- Use Mod Menu
- Use commands `/ptpConfig setting value`
- Edit the config file in `.minecraft/config/ptp.json`


## ⚠️ Limitations and notes

- Minecraft Projectiles often have a random offset, so the actual impact may sometime differs a bit from the preview.
- Modded items are not yet supported. If you want compatibility with a specific mod, open an issue on Github and suggest it, I'll do my best to add it.

## 🔓 Unlocked Fork Changes (纯客户端全服解锁版)

This fork removes the server-side handshake requirement from `ProjectilesTrajectoryPreview` (`MIT License`):
1. **Silent on Join**: Removed `ptp:handshake_c2s` / `ptp:handshake_s2c` payload registration and join handshake packets so no custom channel identifiers are leaked to servers.
2. **Always Enabled**: `PtpClient.isEnabled()` and `serverHasMod` default to `true` on all servers.
3. **All Projectiles Unlocked**: `bypassAntiCheat` is enabled for all vanilla projectiles (Bow, Crossbow, Trident, Wind Charge, Splash/Lingering Potions, Snowball, Egg, Ender Pearl, Fishing Rod, Exp Bottle, and Item Drop).

## 📦 Modpack

Feel free to add this mod in your modpacks.
