package xyz.fireworkwars.itemsapi.items

import org.bukkit.Color
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

/**
 * Represents a custom firework item.
 */
interface FireworkItem {

    /**
     * The unique identifier this item was registered with.
     */
    val id: String

    /**
     * Checks if the given `ItemStack` is an instance of this item.
     *
     * @param itemStack The `ItemStack` to check
     */
    fun isItem(itemStack: ItemStack?): Boolean

    /**
     * Gets the base `ItemStack` for this item.
     *
     * @param amount The amount, 1 if not specified
     */
    fun getDefaultItem(amount: Int = 1): ItemStack

    /**
     * Gets an `ItemStack` for this item customized for the given player.
     * Currently, the only property this could affect is the color.
     *
     * @param player The player to customize the item for
     * @param amount The amount, 1 if not specified
     */
    fun getItem(player: Player, amount: Int = 1): ItemStack

    /**
     * Gets an `ItemStack` for this item customized for the given player with the specified color.
     * Note that some implementations may ignore the color parameter, and that plugins can still
     * override the color via events.
     *
     * @param player The player to customize the item for
     * @param color The color to apply to the item.
     * @param amount The amount, 1 if not specified
     */
    fun getItem(player: Player, color: Color, amount: Int = 1): ItemStack
}