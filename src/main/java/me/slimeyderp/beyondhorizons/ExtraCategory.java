package me.slimeyderp.beyondhorizons;

import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

class ExtraCategory {
    static private final NamespacedKey categoryId = new NamespacedKey(BeyondHorizons.getPlugin(BeyondHorizons.class), "cool_category");
    static private final CustomItem categoryItem = new CustomItem(Material.HEART_OF_THE_SEA, "Beyond Horizons");
    static final Category Customcategory = new Category(categoryId, categoryItem);
}
