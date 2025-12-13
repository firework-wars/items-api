# Items API
A public API to interact with the Firework Wars Items Plugin

## Installation
The API is hosted via [JitPack](https://jitpack.io/#firework-wars/items-api). To include it in your project, add the following to your build file:

For Gradle (Kotlin DSL):
```kotlin
repositories {
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    compileOnly("com.github.firework-wars:items-api:<latest-version>")
}
```

For Gradle (Groovy):
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    compileOnly 'com.github.firework-wars:items-api:<latest-version>'
}
```

For Maven:
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>com.github.firework-wars</groupId>
        <artifactId>items-api</artifactId>
        <version>{latest version}</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

## Getting Started
Make sure that the Firework Items Plugin is installed, and that your plugin depends on it in your `plugin.yml`:
In your plugin, you can access the Items API as follows:

```java
package com.example.myplugin;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.fireworkwars.itemsapi.FireworkItemsHook;

public class MyPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        FireworkItemsHook itemsApi = (FireworkItemsHook) this.getServer().getPluginManager().getPlugin("FWWItems");
    }
}
```

## Example Usage
```java
package com.example.myplugin;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import xyz.fireworkwars.itemsapi.FireworkItemsHook;

public class MyPlugin extends JavaPlugin implements Listener {
    private FireworkItemsHook itemsApi;
    private ItemManagerHook itemManager;

    @Override
    public void onEnable() {
        this.itemsApi = (FireworkItemsHook) this.getServer().getPluginManager().getPlugin("FWWItems");
        this.itemManager = itemsApi.getItemManagerHook();

        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        ItemStack rifle = itemManager.getItemById("firework_rifle").getItem(player, 1);
        ItemStack ammo = itemManager.getItemById("firework_rifle_ammo").getItem(player, 16);

        player.getInventory().addItem(rifle, ammo);
    }
}
```

