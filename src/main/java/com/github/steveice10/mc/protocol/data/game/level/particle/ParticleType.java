package com.github.steveice10.mc.protocol.data.game.level.particle;

public enum ParticleType {
    AMBIENT_ENTITY_EFFECT,
    ANGRY_VILLAGER,
    BLOCK,
    BLOCK_MARKER,
    BUBBLE,
    CLOUD,
    CRIT,
    DAMAGE_INDICATOR,
    DRAGON_BREATH,
    DRIPPING_LAVA,
    FALLING_LAVA,
    LANDING_LAVA,
    DRIPPING_WATER,
    FALLING_WATER,
    DUST,
    DUST_COLOR_TRANSITION,
    EFFECT,
    ELDER_GUARDIAN,
    ENCHANTED_HIT,
    ENCHANT,
    END_ROD,
    ENTITY_EFFECT,
    EXPLOSION_EMITTER,
    EXPLOSION,
    GUST,
    GUST_EMITTER,
    SONIC_BOOM,
    FALLING_DUST,
    FIREWORK,
    FISHING,
    FLAME,
    CHERRY_LEAVES,
    SCULK_SOUL,
    SCULK_CHARGE,
    SCULK_CHARGE_POP,
    SOUL_FIRE_FLAME,
    SOUL,
    FLASH,
    HAPPY_VILLAGER,
    COMPOSTER,
    HEART,
    INSTANT_EFFECT,
    ITEM,
    VIBRATION,
    ITEM_SLIME,
    ITEM_SNOWBALL,
    LARGE_SMOKE,
    LAVA,
    MYCELIUM,
    NOTE,
    POOF,
    PORTAL,
    RAIN,
    SMOKE,
    WHITE_SMOKE,
    SNEEZE,
    SPIT,
    SQUID_INK,
    SWEEP_ATTACK,
    TOTEM_OF_UNDYING,
    UNDERWATER,
    SPLASH,
    WITCH,
    BUBBLE_POP,
    CURRENT_DOWN,
    BUBBLE_COLUMN_UP,
    NAUTILUS,
    DOLPHIN,
    CAMPFIRE_COSY_SMOKE,
    CAMPFIRE_SIGNAL_SMOKE,
    DRIPPING_HONEY,
    FALLING_HONEY,
    LANDING_HONEY,
    FALLING_NECTAR,
    FALLING_SPORE_BLOSSOM,
    ASH,
    CRIMSON_SPORE,
    WARPED_SPORE,
    SPORE_BLOSSOM_AIR,
    DRIPPING_OBSIDIAN_TEAR,
    FALLING_OBSIDIAN_TEAR,
    LANDING_OBSIDIAN_TEAR,
    REVERSE_PORTAL,
    WHITE_ASH,
    SMALL_FLAME,
    SNOWFLAKE,
    DRIPPING_DRIPSTONE_LAVA,
    FALLING_DRIPSTONE_LAVA,
    DRIPPING_DRIPSTONE_WATER,
    FALLING_DRIPSTONE_WATER,
    GLOW_SQUID_INK,
    GLOW,
    WAX_ON,
    WAX_OFF,
    ELECTRIC_SPARK,
    SCRAPE,
    SHRIEK,
    EGG_CRACK,
    DUST_PLUME,
    TRIAL_SPAWNER_DETECTION,
    VAULT_CONNECTION;

    private static final ParticleType[] VALUES = values();

    public static ParticleType from(int id) {
        return VALUES[id];
    }
}
