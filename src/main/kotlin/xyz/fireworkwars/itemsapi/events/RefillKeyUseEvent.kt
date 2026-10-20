package xyz.fireworkwars.itemsapi.events

import org.bukkit.entity.Player
import org.bukkit.event.Event
import org.bukkit.event.HandlerList
import org.bukkit.inventory.InventoryHolder

class RefillKeyUseEvent(val player: Player, val container: InventoryHolder) : Event() {
    var isAccepted: Boolean = false
        private set

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
