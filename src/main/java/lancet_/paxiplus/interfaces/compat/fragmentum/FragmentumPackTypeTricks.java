package lancet_.paxiplus.interfaces.compat.fragmentum;

import net.minecraft.server.packs.PackType;
import org.spongepowered.asm.mixin.Unique;

public interface FragmentumPackTypeTricks {
    @Unique
    PackType getPackType();
    @Unique
    void setPackType(PackType packType);
}
