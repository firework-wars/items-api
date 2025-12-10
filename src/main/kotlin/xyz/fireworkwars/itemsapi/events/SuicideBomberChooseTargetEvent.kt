package xyz.fireworkwars.itemsapi.events

import org.bukkit.entity.Creeper
import org.bukkit.entity.LivingEntity
import org.bukkit.event.Cancellable
import org.bukkit.event.Event
import org.bukkit.event.HandlerList

/**
 * Called when a suicide bomber creeper is choosing its target.
 *
 * @param creeper The creeper entity
 * @param owner The entity that spawned the suicide bomber
 * @param target The current target of the creeper, may be null
 */
class SuicideBomberChooseTargetEvent(val creeper: Creeper, val owner: LivingEntity?, var target: LivingEntity?) : Event(), Cancellable {
    private var cancelled = false

    override fun isCancelled(): Boolean {
        return cancelled
    }

    override fun setCancelled(cancel: Boolean) {
        cancelled = cancel
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