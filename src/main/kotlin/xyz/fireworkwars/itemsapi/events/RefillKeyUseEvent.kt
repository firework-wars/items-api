package xyz.fireworkwars.itemsapi.events

import org.bukkit.entity.Player
import org.bukkit.event.Event
import org.bukkit.event.HandlerList
import org.bukkit.inventory.InventoryHolder

/**
 * Called when a player right-clicks a container while holding a refill key.
 *
 * Fired for any container the player can click: chest blocks, barrels and other block inventories (their block
 * state), as well as storage minecarts and chest boats (the entity itself). It is up to listeners to decide whether
 * the container is one they handle.
 *
 * The key is opt-in: it is only consumed, and the container's own inventory only kept from opening, when a listener
 * calls [accept]. If nobody accepts, the click behaves as if the player were holding any other item.
 *
 * @param player The player using the refill key
 * @param container The clicked container's inventory holder
 */
class RefillKeyUseEvent(val player: Player, val container: InventoryHolder) : Event() {
    var isAccepted: Boolean = false
        private set

    /** Claim this use: the key is consumed and the container does not open normally. */
    fun accept() {
        isAccepted = true
    }

    companion object {
        @JvmStatic
        private val HANDLER_LIST = HandlerList()

        @JvmStatic
        fun getHandlerList(): HandlerList {
            return HANDLER_LIST
        }
    }

    override fun getHandlers(): HandlerList {
        return HANDLER_LIST
    }
}
