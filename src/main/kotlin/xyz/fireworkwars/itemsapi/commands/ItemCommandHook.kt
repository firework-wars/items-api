package xyz.fireworkwars.itemsapi.commands

import org.bukkit.entity.Player

/**
 * Interface for interacting with the /item command
 */
interface ItemCommandHook {

    /**
     * Gives a player a specified item
     *
     * @param player The player to give the item to
     * @param itemId The item ID
     * @param amount The amount, 1 if not specified
     * @return True if the item was given successfully, false otherwise
     * @see xyz.fireworkwars.itemsapi.items.ItemManagerHook.itemRegistry
     */
    fun giveItem(player: Player, itemId: String, amount: Int = 1): Boolean
}