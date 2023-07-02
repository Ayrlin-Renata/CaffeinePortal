package caffeineportal;

import co.casterlabs.caffeinated.pluginsdk.*;

@CaffeinatedPluginImplementation
public class Caffein extends CaffeinatedPlugin {

    @Override
    public void onInit() {
        this.getLogger().debug("CaffeinePortal CasterLabs side onInit()");
        // this is the actual entrypoint, gonna have to spin up app and porta from here.
        App.main(new String[0]);
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
