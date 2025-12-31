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
     * @param color The color to apply to the item
     * @param amount The amount, 1 if not specified
     */
    fun getItem(player: Player, color: Color, amount: Int = 1): ItemStack

    /**
     * Takes the input `ItemStack` and customizes it for the specified player.
     * Not all custom items have an implementation, in which case the input item is returned unmodified.
     *
     * @param item The `ItemStack` to modify
     * @param player The player to customize the item for
     * @see xyz.fireworkwars.itemsapi.events.PlayerItemColorEvent
     */
    fun editItem(item: ItemStack, player: Player): ItemStack

    /**
     * Takes the input `ItemStack` and customizes it for the specified player. **The color is forced to the given value.**
     * Not all custom items have an implementation, in which case the input item is returned unmodified.
     *
     * @param item The `ItemStack` to modify
     * @param player The player to customize the item for
     * @param color The color to apply to the item
     * @see xyz.fireworkwars.itemsapi.items.FireworkItem.editItem
     */
    fun editItem(item: ItemStack, player: Player, color: Color): ItemStack
}