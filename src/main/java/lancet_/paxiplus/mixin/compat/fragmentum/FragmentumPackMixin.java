package lancet_.paxiplus.mixin.compat.fragmentum;

import com.llamalad7.mixinextras.sugar.Local;
import dev.obscuria.fragmentum.packs.FragmentumLayer;
import lancet_.paxiplus.interfaces.compat.fragmentum.FragmentumPackTypeTricks;
import net.minecraft.server.packs.PackResources;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Pack.class)
public abstract class FragmentumPackMixin {
    @Inject(method = "readPackInfo",
            at = @At(value = "INVOKE",
                    target = "Lnet/minecraft/server/packs/PackResources;getMetadataSection(Lnet/minecraft/server/packs/metadata/MetadataSectionSerializer;)Ljava/lang/Object;",
                    shift = At.Shift.BEFORE),
            cancellable = true)
    private static void checkIfFragmentumPack(String string, Pack.ResourcesSupplier resourcesSupplier, CallbackInfoReturnable<Pack.Info> cir, @Local PackResources packResources) {
        if (packResources.packId().equals("paxi/generated/fragmentum_layer")) {
            FragmentumPackTypeTricks fragmentumPackSource = (FragmentumPackTypeTricks) packResources;
            Pack.Info metadata = fragmentumPackSource.getPackType() == PackType.CLIENT_RESOURCES ?
                    FragmentumLayer.Source.CLIENT_METADATA : FragmentumLayer.Source.SERVER_METADATA;
            cir.setReturnValue(metadata);
        }
    }
}
