package caffeineportal;

import com.christophecvb.touchportal.TouchPortalPlugin;
import com.christophecvb.touchportal.model.TPBroadcastMessage;
import com.christophecvb.touchportal.model.TPInfoMessage;
import com.christophecvb.touchportal.model.TPListChangeMessage;
import com.christophecvb.touchportal.model.TPNotificationOptionClickedMessage;
import com.christophecvb.touchportal.model.TPSettingsMessage;
import com.google.gson.JsonObject;

public class Porta extends TouchPortalPlugin implements TouchPortalPlugin.TouchPortalPluginListener {

    protected Porta(boolean parallelizeActions) {
        super(parallelizeActions);
        // TODO Auto-generated constructor stub
    }

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
    public void onListChanged(TPListChangeMessage tpListChangeMessage) {
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
