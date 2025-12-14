package lancet_.paxiplus.mixin.compat.fragmentum;


import dev.obscuria.fragmentum.packs.FragmentumLayer;
import lancet_.paxiplus.interfaces.compat.fragmentum.FragmentumPackTypeTricks;
import net.minecraft.server.packs.PackResources;
import net.minecraft.server.packs.PackType;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FragmentumLayer.class)
public abstract class FragmentumLayerMixin {
    @Mixin(FragmentumLayer.Source.class)
    public abstract static class FragmentumSourceMixin {
        @Shadow @Final private PackType type;

        @Inject(method = "lambda$loadPacks$0", at = @At("TAIL"))
        private void addType(String packId, CallbackInfoReturnable<PackResources> cir){
            ((FragmentumPackTypeTricks)cir.getReturnValue()).setPackType(this.type);
        }
    }
    @Mixin(FragmentumLayer.Resources.class)
    public abstract static class FragmentumResourcesMixin implements FragmentumPackTypeTricks {
        @Unique
        private PackType packType;

        @Override
        public PackType getPackType() {
            return packType;
        }

        @Unique
        @Override
        public void setPackType(PackType packType) {
            this.packType = packType;
        }
    }
}
