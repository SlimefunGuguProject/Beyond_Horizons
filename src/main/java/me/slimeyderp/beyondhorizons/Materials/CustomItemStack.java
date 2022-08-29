package me.slimeyderp.beyondhorizons.Materials;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;

public final class CustomItemStack {

    public static final SlimefunItemStack ETHERIUM_STACK = new SlimefunItemStack(
        "ETHERIUM",
        "547de8914ac2cb975f85587e33be967a81ee751b4532a9bf2ea9fb85f2d759be",
        "&1乙金",
        "", "&b一个神话的材料\", \"&b只有理论上说了算."
    );
    public static final SlimefunItemStack SUPER_CHARGED_COOLANT_CELL_STACK = new SlimefunItemStack(
        "SUPER_CHARGED_COOLANT_CELL",
        "9ac52419b99025828c89fa825945e6948e45bb5a22e4425a59e9096e4c1ac38",
        "&1超级充电冷却电池", "", "&r用于冷却反应器",
        "小心别冻着你的手"
    );
    public static final SlimefunItemStack RAW_AETHER_STACK = new SlimefunItemStack(
        "RAW_AETHER",
        "9c425ea9c4a4cbd123a9ffd4a0ba7480e7c515423dd730fb9fb643c18490107f",
        "&1生乙醚矿",
        "", LoreBuilder.radioactive(Radioactivity.VERY_DEADLY), LoreBuilder.HAZMAT_SUIT_REQUIRED
    );
    public static final SlimefunItemStack DIMENSIONAL_TRANSMUTATOR_STACK = new SlimefunItemStack(
        "DIMENSIONAL_TRANSMUTATOR",
        Material.RED_STAINED_GLASS,
        "&d维度转换器",
        "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.powerBuffer(2560), LoreBuilder.powerPerSecond(300)
    );
    public static final SlimefunItemStack UNSTABLE_ETHERIUM_STACK = new SlimefunItemStack(
        "UNSTABLE_ETHERIUM",
        "2342b9bf9f1f6295842b0efb591697b14451f803a165ae58d0dcebd98eacc",
        "&1不稳定醚",
        "", "&4&4警告：正在运行此“不稳定", "&4&4材料要求你死.", "&4你已经被警告了!"
    );
    public static final SlimefunItemStack ETHERIAL_BALANCE_ROD_STACK = new SlimefunItemStack(
        "ETHERIAL_BALANCE_ROD",
        Material.STICK,
        "&e以太平衡棒",
        "", "&d用神秘的力量消灭你的敌人！"
    );
    public static final SlimefunItemStack DIMENSIONAL_REACTOR_STACK = new SlimefunItemStack(
        "DIMENSIONAL_REACTOR",
        "9343ce58da54c79924a2c9331cfc417fe8ccbbea9be45a7ac85860a6c730",
        "&1量纲反应器",
        "", "&r用未加工的乙醚矿石！!", "&8\u21E8 &b一定被水包围了",
        "&8\u21E8 &b使用超级充电的反应堆冷却剂电池", "",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(101004),
        LoreBuilder.powerPerSecond(3500)
    );
    public static final SlimefunItemStack COAL_DUST_STACK = new SlimefunItemStack(
        "COAL_DUST",
        Material.GUNPOWDER,
        "&r煤尘"
    );
    public static final SlimefunItemStack COAL_DRILL_STACK = new SlimefunItemStack(
        "COAL_DRILL",
        Material.GRAY_TERRACOTTA,
        "&4煤尘",
        "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.powerBuffer(256),
        LoreBuilder.powerPerSecond(30)
    );
    public static final SlimefunItemStack COAL_DRILL_RECIPETELLER_STACK = new SlimefunItemStack(
        "COAL_DRILL_RECIPETELL",
        Material.GRAY_TERRACOTTA,
        "&4采煤机",
        "", "&r把这个东西放进煤钻里"
    );
    public static final SlimefunItemStack DIMENSIONAL_TRANSMUTATOR_RECIPETELLER_STACK = new SlimefunItemStack(
        "DIMENSIONAL_TRANSMUTATOR_RECIPETELLER",
        Material.RED_STAINED_GLASS,
        "&d维度转换器",
        "", "&r在一个维度转化器中制造这个项目");
    public static final SlimefunItemStack ETHERIAL_PHANTOM_SWORD_STACK = new SlimefunItemStack(
        "ETHERIAL_PHANTOM_SWORD",
        Material.IRON_SWORD,
        "&e以太幻剑",
        "", "&d偷走敌人的力量，封印他们的命运!"
    );
    public static final SlimefunItemStack PORTABLE_DIMESNION_SHIFTER_STACK = new SlimefunItemStack(
        "PORTABLE_DIMENSION_SHIFTER",
        Material.CLOCK,
        "&e便携式尺寸移位器",
        "", "&d把你的位置转移到一个扭曲的维度", "&4警告：此物品将无法运输",
        "&4你将进入一个不同的维度。"
    );
    public static final SlimefunItemStack AETHERIAL_WIND_STAFF_STACK = new SlimefunItemStack(
        "AETHERIAL_WIND_STAFF",
        Material.STICK,
        "&e风杖",
        "", "&d有奇怪石头的棍子", "&d我想知道如果你", "&d在一个扭曲的地方使用?"
    );

    private CustomItemStack() {}
}
