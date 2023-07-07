package caffeineportal;

import co.casterlabs.caffeinated.pluginsdk.*;
import xyz.e3ndr.fastloggingframework.logging.FastLogger;

@CaffeinatedPluginImplementation
public class Caffein extends CaffeinatedPlugin {

    private CafListener cafListener;
    private FastLogger log;

    public Caffein() {
        super();
        log = this.getLogger();
    }

    @Override
    public void onInit() {
        log.debug("CaffeinePortal CasterLabs side onInit()");
        log.info("Hello Caffeinated!?");

        // caffein init
        cafListener = new CafListener(log);
        addKoiListener(cafListener);

        // app init
        App.init();
    }

    @Override
    public void onClose() {
        log.debug("CaffeinePortal CasterLabs side onClose()");
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
