package me.slimeyderp.beyondhorizons;

import me.mrCookieSlime.Slimefun.Setup.SlimefunManager;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class SpecialItemListener implements Listener {

    private static BeyondHorizons plugin;

    public SpecialItemListener(BeyondHorizons plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void isSprinting(PlayerToggleSprintEvent event) {
        Player p = event.getPlayer();
        PlayerInventory playerInventory = p.getInventory();
        if (SlimefunManager.containsSimilarItem(playerInventory, ItemStacks.UNSTABLE_ETHERIUM_STACK, true)) {
            for (int i = 0; i < playerInventory.getSize(); i++) {
                ItemStack stack = playerInventory.getItem(i);
                if (SlimefunManager.isItemSimilar(stack, ItemStacks.UNSTABLE_ETHERIUM_STACK, true)) {
                    playerInventory.setItem(i, null);
                }
            }
            Location loc = p.getLocation();
            loc.getWorld().createExplosion(loc, 12F);
        }
    }

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) throws InterruptedException {
        if (event.getDamager() instanceof Player && event.getEntity() instanceof LivingEntity) {
            Player attacker = (Player) event.getDamager();
            LivingEntity damaged = (LivingEntity) event.getEntity();
            if (SlimefunManager.isItemSimilar(attacker.getItemInHand(), ItemStacks.ETHERIAL_BALANCE_ROD_STACK, true)) {
                damaged.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 3, 60));
                damaged.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3, 60));
                damaged.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 3, 60));
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        damaged.getLocation().getWorld().createExplosion(damaged.getLocation(), 2F, false, false);
                    }
                }.runTaskLater(this.plugin, 40);
            }
        }
    }
}
