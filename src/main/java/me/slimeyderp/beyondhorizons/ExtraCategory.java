package me.slimeyderp.beyondhorizons;

import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

class ExtraCategory {
    public static final NamespacedKey CATEGORY_ID = new NamespacedKey(BeyondHorizons.getPlugin(BeyondHorizons.class), "cool_category");
    public static final CustomItem CATEGORY_ITEM = new CustomItem(Material.HEART_OF_THE_SEA, "Beyond Horizons");
    public static final Category CUSTOM_CATEGORY = new Category(CATEGORY_ID, CATEGORY_ITEM);
}
