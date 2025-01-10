// package com.marijn.generousdraggon;

// import org.bukkit.Bukkit;
// import org.bukkit.Material;
// import org.bukkit.entity.EnderDragon;
// import org.bukkit.entity.Item;
// import org.bukkit.event.EventHandler;
// import org.bukkit.event.Listener;
// import org.bukkit.event.entity.EntityDeathEvent;
// import org.bukkit.inventory.ItemStack;
// import org.bukkit.plugin.java.JavaPlugin;

// public class MarijnsGenerousDraggon extends JavaPlugin implements Listener {

//     @Override
//     public void onEnable() {
//         Bukkit.getPluginManager().registerEvents(this, this);
//         getLogger().info("Marijn's Generous Draggon is enabled!");
//     }

//     @Override
//     public void onDisable() {
//         getLogger().info("Marijn's Generous Draggon is disabled!");
//     }

//     @EventHandler
//     public void onDragonDeath(EntityDeathEvent event) {
//         if (event.getEntity() instanceof EnderDragon) {
//             ItemStack elytra = new ItemStack(Material.ELYTRA, 1);
//             event.getEntity().getWorld().dropItemNaturally(event.getEntity().getLocation(), elytra);
//             getLogger().info("The Ender Dragon has been generous and dropped an Elytra!");
//         }
//     }
// }

package com.marijn.generousdraggon;

import org.bukkit.Material;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EnderDragon;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class MarijnsGenerousDraggon extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("Marijn's Generous Draggon is enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Marijn's Generous Draggon is disabled!");
    }

    @EventHandler
    public void onEntityDeath(EntityDeathEvent event) {
        // Check if the entity is Ender Dragon or Creeper
        if (event.getEntity() instanceof EnderDragon) {
            event.getEntity().getWorld().dropItemNaturally(
                event.getEntity().getLocation(), new ItemStack(Material.ELYTRA)
            );

            // Log who dropped it
            if (event.getEntity() instanceof EnderDragon) {
                getLogger().info("The Ender Dragon dropped an Elytra!");
            }
        }
    }
}
