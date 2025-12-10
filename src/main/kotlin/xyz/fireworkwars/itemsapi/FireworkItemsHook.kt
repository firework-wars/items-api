package xyz.fireworkwars.itemsapi

import xyz.fireworkwars.itemsapi.commands.ItemCommandHook
import xyz.fireworkwars.itemsapi.items.ItemManagerHook

/**
 * Interface for interacting with the Firework Items Plugin API
 */
interface FireworkItemsHook {

    /**
     * Gets the item manager interface
     */
    fun getItemManagerHook(): ItemManagerHook

    /**
     * Gets the item command interface
     */
    fun getItemCommandHook(): ItemCommandHook
}