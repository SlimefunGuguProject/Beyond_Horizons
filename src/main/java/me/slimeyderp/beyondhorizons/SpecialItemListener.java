package me.slimeyderp.beyondhorizons;

import me.mrCookieSlime.Slimefun.Setup.SlimefunManager;
import me.slimeyderp.beyondhorizons.Materials.CustomItemStack;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class SpecialItemListener implements Listener {

    int id = 0;
    BukkitTask Task;
    BeyondHorizons plugin;


    public SpecialItemListener(BeyondHorizons plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void isSprinting(PlayerToggleSprintEvent event) {
        Player p = event.getPlayer();
        PlayerInventory playerInventory = p.getInventory();
        if (SlimefunManager.containsSimilarItem(playerInventory, CustomItemStack.UNSTABLE_ETHERIUM_STACK, true)) {
            for (int i = 0; i < playerInventory.getSize(); i++) {
                ItemStack stack = playerInventory.getItem(i);
                if (SlimefunManager.isItemSimilar(stack, CustomItemStack.UNSTABLE_ETHERIUM_STACK, true)) {
                    playerInventory.setItem(i, null);
                }
            }
            Location loc = p.getLocation();
            loc.getWorld().createExplosion(loc, 12F);
        }
    }

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player && event.getEntity() instanceof LivingEntity) {
            Player attacker = (Player) event.getDamager();
            LivingEntity damaged = (LivingEntity) event.getEntity();
            if (SlimefunManager.isItemSimilar(attacker.getItemInHand(), CustomItemStack.ETHERIAL_BALANCE_ROD_STACK, true)) {
                damaged.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 3, 60));
                damaged.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3, 60));
                damaged.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 3, 60));
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        damaged.getLocation().getWorld().createExplosion(damaged.getLocation(), 2F, false, false);
                    }
                }.runTaskLater(plugin, 40);

            } else if ((SlimefunManager.isItemSimilar(attacker.getItemInHand(), CustomItemStack.ETHERIAL_PHANTOM_SWORD_STACK, true)) && (event.getEntity() instanceof Player)) {
                Player damaged_player = (Player) event.getEntity();
                damaged_player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 100, 1));
                if ((damaged_player.getItemInHand().getType() == Material.DIAMOND_SWORD) ||
                        (damaged_player.getItemInHand().getType() == Material.GOLDEN_SWORD) ||
                        (damaged_player.getItemInHand().getType() == Material.IRON_SWORD) ||
                        (damaged_player.getItemInHand().getType() == Material.STONE_SWORD) ||
                        (damaged_player.getItemInHand().getType() == Material.WOODEN_SWORD) ||
                        (damaged_player.getItemInHand().getType() == Material.STICK)) {
                    ItemMeta DamagedPlayerMeta = damaged_player.getItemInHand().getItemMeta();
                    DamagedPlayerMeta.addEnchant(Enchantment.ARROW_INFINITE, 10, true);
                    ItemStack clone = damaged_player.getItemInHand().clone();
                    clone.setItemMeta(DamagedPlayerMeta);
                    attacker.setItemInHand(clone);
                    Task = Bukkit.getServer().getScheduler().runTaskLaterAsynchronously(plugin, new Runnable() {
                        @Override
                        public void run() {
                            byte counter = 0;
                            for (ItemStack item : attacker.getInventory().getContents()) {
                                if (item != null) {
                                    if (item.getEnchantmentLevel(Enchantment.ARROW_INFINITE) == 10) {
                                        attacker.getInventory().setItem(counter, CustomItemStack.ETHERIAL_PHANTOM_SWORD_STACK);
                                        break;
                                    }
                                }
                                counter++;
                            }
                        }
                    }, 80);
                }
            } else if (((attacker.getItemInHand().getEnchantmentLevel(Enchantment.ARROW_INFINITE)) == 10) && (event.getEntity() instanceof Player)) {
                Task.cancel();
                Task = Bukkit.getServer().getScheduler().runTaskLaterAsynchronously(plugin, new Runnable() {
                    @Override
                    public void run() {
                        byte counter = 0;
                        for (ItemStack item : attacker.getInventory().getContents()) {
                            if (item != null) {
                                if (item.getEnchantmentLevel(Enchantment.ARROW_INFINITE) == 10) {
                                    attacker.getInventory().setItem(counter, CustomItemStack.ETHERIAL_PHANTOM_SWORD_STACK);
                                    break;
                                }
                            }
                            counter++;
                        }
                    }
                }, 80);
            } else if (SlimefunManager.isItemSimilar(attacker.getItemInHand(), CustomItemStack.ETHERIAL_PHANTOM_SWORD_STACK, true)) {
                damaged.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 100, 1));
            }
        }
    }
}
