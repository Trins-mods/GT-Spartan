package trinsdar.gtsp.proxy;

import muramasa.antimatter.proxy.IProxyHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ServerHandler implements IProxyHandler {
    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Cannot call on server!");
    }

    @Override
    public PlayerEntity getClientPlayer() {
        throw new IllegalStateException("Cannot call on server!");
    }
}
