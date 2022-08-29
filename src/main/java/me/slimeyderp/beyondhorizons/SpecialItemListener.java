package me.slimeyderp.beyondhorizons;

import io.github.thebusybiscuit.slimefun4.api.events.GEOResourceGenerationEvent;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.slimeyderp.beyondhorizons.Materials.CustomItemStack;
import me.slimeyderp.beyondhorizons.Materials.RawAetherResource;
import me.slimeyderp.beyondhorizons.Materials.UnstableEtheriumResource;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.concurrent.ThreadLocalRandom;

public class SpecialItemListener implements Listener {

    public SpecialItemListener(BeyondHorizons plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void isSprinting(PlayerToggleSprintEvent event) {
        final PlayerInventory playerInventory = event.getPlayer().getInventory();
        if (SlimefunUtils.containsSimilarItem(playerInventory, CustomItemStack.UNSTABLE_ETHERIUM_STACK, true)) {
            for (ItemStack is : playerInventory.getStorageContents()) {
                if (SlimefunUtils.isItemSimilar(is, CustomItemStack.UNSTABLE_ETHERIUM_STACK, true)) {
                    playerInventory.remove(is);
                }
            }
            final Location loc = event.getPlayer().getLocation();
            loc.getWorld().createExplosion(loc, 12F);
        }
    }

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player && event.getEntity() instanceof LivingEntity) {
            final Player attacker = (Player) event.getDamager();
            final LivingEntity damaged = (LivingEntity) event.getEntity();

            final ItemStack itemInHand = attacker.getInventory().getItemInMainHand();

            if (SlimefunUtils.isItemSimilar(itemInHand, CustomItemStack.ETHERIAL_BALANCE_ROD_STACK, true)) {
                handleEtherialRod(damaged);
            } else if (SlimefunUtils.isItemSimilar(itemInHand, CustomItemStack.ETHERIAL_PHANTOM_SWORD_STACK, true)
                && event.getEntity() instanceof Player
            ) {
                final Player damagedPlayer = (Player) event.getEntity();
                damagedPlayer.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 100, 1));
            } else if (SlimefunUtils.isItemSimilar(itemInHand, CustomItemStack.ETHERIAL_PHANTOM_SWORD_STACK, true)) {
                damaged.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 100, 1));
            }
        }
    }

    private void handleEtherialRod(final LivingEntity damaged) {
        damaged.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 3, 60));
        damaged.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3, 60));
        damaged.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 3, 60));

        Bukkit.getScheduler().runTaskLater(BeyondHorizons.getInstance(),
            () -> damaged.getLocation().getWorld().createExplosion(damaged.getLocation(), 2F, false, false), 40);
    }

    @EventHandler
    public void onResourceGeneration(GEOResourceGenerationEvent e) {
        final ThreadLocalRandom rand = ThreadLocalRandom.current();

        if (e.getResource() instanceof RawAetherResource
            && e.getWorld() == Bukkit.getServer().getWorld("world_aether")
        ) {
            e.setValue(rand.nextInt(18) + 6);
        }
        if (e.getResource() instanceof UnstableEtheriumResource
            && e.getWorld() == Bukkit.getServer().getWorld("world_aether")
            && rand.nextInt(101) > 85
        ) {
            e.setValue(rand.nextInt(3) + 1);
        }
    }

    // Makes different mobs spawn in the world
    @EventHandler
    public void onMobSpawning(EntitySpawnEvent e) {
        final ThreadLocalRandom rand = ThreadLocalRandom.current();

        final World aether = Bukkit.getServer().getWorld("world_aether");
        if (e.getEntityType() == EntityType.ENDERMAN
            && aether != null
            && e.getLocation().getWorld().getUID().equals(aether.getUID())
        ) {
            final EntityType type;
            if (rand.nextInt(500) == 420) {
                type = EntityType.WITHER;
            } else if (rand.nextInt(10) == 4) {
                type = EntityType.EVOKER;
            } else if (rand.nextInt(5) == 2) {
                type = EntityType.BLAZE;
            } else {
                type = EntityType.PHANTOM;
            }
            e.getLocation().getWorld().spawnEntity(e.getLocation(), type);
            e.setCancelled(true);
        }
    }
}
