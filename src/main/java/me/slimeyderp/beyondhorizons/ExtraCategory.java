package me.slimeyderp.beyondhorizons;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class ExtraCategory {
    static NamespacedKey One=new NamespacedKey(BeyondHorizons.getInstance(), "beyond_horizons");
    static CustomItemStack OneItem=new CustomItemStack(Material.HEART_OF_THE_SEA, "以太");

    public static final ItemGroup CUSTOM_CATEGORY = new ItemGroup(One,OneItem);

    private ExtraCategory() {}
}
