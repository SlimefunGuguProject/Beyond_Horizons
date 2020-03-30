package me.slimeyderp.beyondhorizons.Materials;

import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;

public class CustomItemStack {
    public static final SlimefunItemStack ETHERIUM_STACK = new SlimefunItemStack("ETHERIUM", "547de8914ac2cb975f85587e33be967a81ee751b4532a9bf2ea9fb85f2d759be", "§1Etherium", "", "§bA mythological material that ", "§bwas only ever theorized off.");
    public static final SlimefunItemStack SUPER_CHARGED_COOLANT_CELL_STACK = new SlimefunItemStack("SUPER_CHARGED_COOLANT_CELL", "9ac52419b99025828c89fa825945e6948e45bb5a22e4425a59e9096e4c1ac38", "§1Super-Charged Coolant Cell", "", "&rUsed for cooling a Dimensional Reactor", "Careful, don't freeze your hands");
    public static final SlimefunItemStack RAW_AETHER_STACK = new SlimefunItemStack("RAW_AETHER", "9c425ea9c4a4cbd123a9ffd4a0ba7480e7c515423dd730fb9fb643c18490107f", "§1Raw Aether Ore", "", LoreBuilder.radioactive(Radioactivity.VERY_DEADLY), LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack DIMENSIONAL_TRANSMUTATOR_STACK = new SlimefunItemStack("DIMENSIONAL_TRANSMUTATOR", Material.RED_STAINED_GLASS, "§dDimensional Transmutator", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerBuffer(2560), LoreBuilder.powerPerSecond(300));
    public static final SlimefunItemStack UNSTABLE_ETHERIUM_STACK = new SlimefunItemStack("UNSTABLE_ETHERIUM", "2342b9bf9f1f6295842b0efb591697b14451f803a165ae58d0dcebd98eacc", "&1Unstable Etherium", "", "&4WARNING: Running with this unstable", "&4material is asking for your death.", "&4You have been warned!");
    public static final SlimefunItemStack ETHERIAL_BALANCE_ROD_STACK = new SlimefunItemStack("ETHERIAL_BALANCE_ROD", Material.STICK, "&eEtherial Balance Rod", "", "&dDestroy your enemies with mystical powers!");
    public static final SlimefunItemStack DIMENSIONAL_REACTOR_STACK = new SlimefunItemStack("DIMENSIONAL_REACTOR", "9343ce58da54c79924a2c9331cfc417fe8ccbbea9be45a7ac85860a6c730", "&1Dimensional Reactor", "", "&rRuns on Raw Aether Ore!", "&8\u21E8 &bMust be surrounded by Water", "&8\u21E8 &bUses Super-Charged Reactor Coolant Cells", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(101004), LoreBuilder.powerPerSecond(3500));
    public static final SlimefunItemStack COAL_DUST_STACK = new SlimefunItemStack("COAL_DUST", Material.GUNPOWDER, "&rCoal Dust");
    public static final SlimefunItemStack COAL_DRILL_STACK = new SlimefunItemStack("COAL_DRILL", Material.GRAY_TERRACOTTA, "§4Coal Drill", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(30));
    public static final SlimefunItemStack COAL_DRILL_RECIPETELLER_STACK = new SlimefunItemStack("COAL_DRILL_RECIPETELL", Material.GRAY_TERRACOTTA, "§4Coal Drill", "", "&rMake this item in a Coal drill");
    public static final SlimefunItemStack DIMENSIONAL_TRANSMUTATOR_RECIPETELLER_STACK = new SlimefunItemStack("DIMENSIONAL_TRANSMUTATOR_RECIPETELLER", Material.RED_STAINED_GLASS, "§dDimensional Transmutator", "", "&rMake this item in a Dimensional Transmutator");
    public static final SlimefunItemStack ETHERIAL_PHANTOM_SWORD_STACK = new SlimefunItemStack("ETHERIAL_PHANTOM_SWORD", Material.IRON_SWORD, "&eEtherial Phantom Sword", "", "&dSteal your enemies' power and seal their fate!");
    public static final SlimefunItemStack PORTABLE_DIMESNION_SHIFTER_STACK = new SlimefunItemStack("PORTABLE_DIMENSION_SHIFTER", Material.CLOCK, "&ePortable Dimension Shifter", "", "&dShift your location into a twisted dimension", "&4WARNING: This item will transport you to a different dimension.");
}
