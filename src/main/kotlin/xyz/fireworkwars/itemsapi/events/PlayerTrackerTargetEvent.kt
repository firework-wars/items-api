package xyz.fireworkwars.itemsapi.events

import net.kyori.adventure.text.Component
import org.bukkit.entity.Player
import org.bukkit.event.Event
import org.bukkit.event.HandlerList
import org.bukkit.inventory.ItemStack

/**
 * Called when a tracker compass is choosing a player to track.
 *
 * @param player The player using the tracker
 * @param compass The tracker compass `ItemStack`
 * @param enemy The player that's currently being tracked, may be null
 * @param enemyName The display name of the current target player, may be null. This value is used for the player tracker messages
 */
class PlayerTrackerTargetEvent(player: Player, compass: ItemStack, enemy: Player?, var enemyName: Component?) : TrackerTargetEvent(player, compass, enemy) {
    companion object {
        @JvmStatic
        val HANDLER_LIST = HandlerList()

        @JvmStatic
        fun getHandlerList(): HandlerList {
            return HANDLER_LIST
        }
    }

    override fun getHandlers(): HandlerList {
        return HANDLER_LIST
    }

    fun getEnemy(): Player? {
        return target as? Player
    }
}