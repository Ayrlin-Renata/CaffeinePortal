package caffeineportal;

import co.casterlabs.caffeinated.pluginsdk.*;

@CaffeinatedPluginImplementation
public class Caffein extends CaffeinatedPlugin {

    @Override
    public void onInit() {
        this.getLogger().debug("CaffeinePortal CasterLabs side onInit()");
    }

    @Override
    public void onClose() {
        this.getLogger().debug("CaffeinePortal CasterLabs side onClose()");
    }

    @Override
    public String getName() {
        return "Caffeine Portal";
    }

    @Override
    public String getId() {
        return "caffeineportal";
    }

}
