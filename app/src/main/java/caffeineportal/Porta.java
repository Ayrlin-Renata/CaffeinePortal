package caffeineportal;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.christophecvb.touchportal.TouchPortalPlugin;
import com.christophecvb.touchportal.annotations.*;
import com.christophecvb.touchportal.helpers.PluginHelper;
import com.christophecvb.touchportal.model.*;
import com.google.gson.JsonObject;

@Plugin(version = BuildConfig.VERSION_CODE, colorDark = "#203060", colorLight = "#4070F0", name = "CaffeinePortal")
public class Porta extends TouchPortalPlugin implements TouchPortalPlugin.TouchPortalPluginListener {

    private final static Logger LOGGER = Logger.getLogger(TouchPortalPlugin.class.getName());

    private enum Categories {
        @Category(name = "CaffeinePortal Base Category", imagePath = "")
        BaseCategory
    }

    /////////////////////////////////////////////////////////////

    @State(defaultValue = "Waiting", categoryId = "BaseCategory")
    private String stateCatchupEvent;

    @State(defaultValue = "Waiting", categoryId = "BaseCategory")
    private String stateChannelPointsEvent;

    @State(defaultValue = "Waiting", categoryId = "BaseCategory")
    private String stateClearChatEvent;

    @State(defaultValue = "Waiting", categoryId = "BaseCategory")
    private String stateFollowEvent;

    @State(defaultValue = "Waiting", categoryId = "BaseCategory")
    private String stateKoiEvent;

    @State(defaultValue = "Waiting", categoryId = "BaseCategory")
    private String stateLikeEvent;

    @State(defaultValue = "Waiting", categoryId = "BaseCategory")
    private String statePlatformMessageEvent;

    @State(defaultValue = "Waiting", categoryId = "BaseCategory")
    private String stateRaidEvent;

    @State(defaultValue = "Waiting", categoryId = "BaseCategory")
    private String stateRichMessageEvent;

    @State(defaultValue = "Waiting", categoryId = "BaseCategory")
    private String stateRoomstateEvent;

    @State(defaultValue = "Waiting", categoryId = "BaseCategory")
    private String stateStreamStatusEvent;

    @State(defaultValue = "Waiting", categoryId = "BaseCategory")
    private String stateSubscriptionEvent;

    @State(defaultValue = "Waiting", categoryId = "BaseCategory")
    private String stateUserUpdateEvent;

    @State(defaultValue = "Waiting", categoryId = "BaseCategory")
    private String stateViewerCountEvent;

    @State(defaultValue = "Waiting", categoryId = "BaseCategory")
    private String stateViewerJoinEvent;

    @State(defaultValue = "Waiting", categoryId = "BaseCategory")
    private String stateViewerLeaveEvent;

    @State(defaultValue = "Waiting", categoryId = "BaseCategory")
    private String stateViewerListEvent;

    /////////////////////////////////////////////////////////////

    protected Porta(boolean parallelizeActions) {
        super(parallelizeActions);
    }

    public Porta() {
        super(true);// true is for paralleling Actions executions
    }

    public static Porta start(String... args) {
        Porta porta = null;

        Porta.LOGGER.log(Level.INFO, "CaffeinePortal TouchPortal side main()");
        if (args != null && args.length == 1) {
            if (PluginHelper.COMMAND_START.equals(args[0])) {
                // Initialize your Plugin
                porta = new Porta();
                // Initiate the connection with the Touch Portal Plugin System (will trigger an
                // onInfo message with a confirmation from TouchPortal and the initial settings)
                boolean connectedPairedAndListening = porta.connectThenPairAndListen(porta);
            }
        }
        return porta;
    }

    /////////////////////////////////////////////////////////////

    @Override
    public void onDisconnected(Exception exception) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onDisconnected'");
    }

    @Override
    public void onReceived(JsonObject jsonMessage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onReceived'");
    }

    @Override
    public void onInfo(TPInfoMessage tpInfoMessage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onInfo'");
    }

    @Override
    public void onListChanged(TPListChangedMessage tpListChangeMessage) { // TPListChangeMessage for pre-9.0.0
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onListChanged'");
    }

    @Override
    public void onBroadcast(TPBroadcastMessage tpBroadcastMessage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onBroadcast'");
    }

    @Override
    public void onSettings(TPSettingsMessage tpSettingsMessage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onSettings'");
    }

    @Override
    public void onNotificationOptionClicked(TPNotificationOptionClickedMessage tpNotificationOptionClickedMessage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onNotificationOptionClicked'");
    }

}
