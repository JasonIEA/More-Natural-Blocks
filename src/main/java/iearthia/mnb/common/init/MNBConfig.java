package iearthia.mnb.common.init;

import keri.ninetaillib.config.ConfigManagerBase;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;

public class MNBConfig extends ConfigManagerBase {

    public MNBConfig(FMLPreInitializationEvent event) {
        super(event);
    }

    @Override
    public ArrayList<Pair<String, String>> getCategories() {
        return null;
    }

    @Override
    public void getConfigFlags(Configuration configuration) {

    }

}
