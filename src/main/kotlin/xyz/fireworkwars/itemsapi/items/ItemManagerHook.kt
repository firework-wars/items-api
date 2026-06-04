package xyz.fireworkwars.itemsapi.items

import org.bukkit.NamespacedKey

/**
 * Interface for interacting with the firework item manager
 */
interface ItemManagerHook {

    /**
     * Gets a registry of all registered firework items
     *
     * @return A map of item ID to `FireworkItem`
     */
    fun itemRegistry(): Map<String, FireworkItem>

    /**
     * Gets a `FireworkItem` by its ID
     *
     * @param id The item ID
     * @return `FireworkItem`
     * @throws IllegalArgumentException If the item id is unknown
     */
    fun getItemById(id: String): FireworkItem

    /**
     * Gets a `FireworkItem` by its ID, or null if it doesn't exist
     *
     * @param id The item ID
     * @return `FireworkItem` or `null`
     */
    fun getItemOrNull(id: String): FireworkItem?

    /**
     * Gets every `NamespacedKey` of the custom recipes registered by the items plugin
     */
    fun getCustomRecipeKeys(): Set<NamespacedKey>
}