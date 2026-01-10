package xyz.fireworkwars.itemsapi.events

import org.bukkit.entity.Entity
import org.bukkit.entity.Player
import org.bukkit.event.Event
import org.bukkit.event.HandlerList
import org.bukkit.inventory.ItemStack

/**
 * Called when a tracker compass is choosing a target.
 *
 * @param player The player using the tracker
 * @param compass The tracker compass `ItemStack`
 * @param target The current target, may be null
 */
open class TrackerTargetEvent(val player: Player, val compass: ItemStack, var target: Entity?): Event() {
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
}