package xyz.fireworkwars.itemsapi.events

import org.bukkit.Color
import org.bukkit.entity.Player
import org.bukkit.event.Event
import org.bukkit.event.HandlerList
import xyz.fireworkwars.itemsapi.items.FireworkItem

/**
 * Called when a `FireworkItem`'s color is being determined for a player.
 *
 * @param item The `FireworkItem` whose color is being determined
 * @param color The current color of the item
 * @param player The player
 */
class PlayerItemColorEvent(val item: FireworkItem, var color: Color, val player: Player) : Event() {
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