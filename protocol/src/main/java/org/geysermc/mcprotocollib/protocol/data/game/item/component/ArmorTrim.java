package org.geysermc.mcprotocollib.protocol.data.game.item.component;

import net.kyori.adventure.key.Key;
import net.kyori.adventure.text.Component;
import org.geysermc.mcprotocollib.protocol.data.game.Holder;

import java.util.Map;

public record ArmorTrim(Holder<TrimMaterial> material, Holder<TrimPattern> pattern) {
    public record TrimMaterial(String assetBase, Map<Key, String> assetOverrides, Component description) {
    }

    public record TrimPattern(Key assetId, Component description, boolean decal) {
    }
}
