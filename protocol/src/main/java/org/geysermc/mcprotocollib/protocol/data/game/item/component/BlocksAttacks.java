package org.geysermc.mcprotocollib.protocol.data.game.item.component;

import org.geysermc.mcprotocollib.protocol.data.game.level.sound.Sound;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public record BlocksAttacks(float blockDelaySeconds, float disableCooldownScale, List<DamageReduction> damageReductions,
                            ItemDamageFunction itemDamage, @Nullable Sound blockSound, @Nullable Sound disableSound) {

    public record DamageReduction(@Nullable HolderSet type, float base, float factor) {
    }

    public record ItemDamageFunction(float threshold, float base, float factor) {
    }
}
