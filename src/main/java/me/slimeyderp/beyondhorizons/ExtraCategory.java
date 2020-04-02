package me.slimeyderp.beyondhorizons;

import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class ExtraCategory {

    public static final Category CUSTOM_CATEGORY = new Category(
        new NamespacedKey(BeyondHorizons.getInstance(), "beyond_horizons"),
        new CustomItem(Material.HEART_OF_THE_SEA, "Beyond Horizons")
    );

    private ExtraCategory() {}
}
