package xyz.fireworkwars.itemsapi.items

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
     * Gets a `FireworkItem` by its ID, if it exists
     *
     * @param id The item ID
     * @return `FireworkItem` or `null`
     */
    fun getItemById(id: String): FireworkItem?
}