package caffeineportal;

import co.casterlabs.koi.api.listener.*;
import co.casterlabs.koi.api.types.events.*;
import xyz.e3ndr.fastloggingframework.logging.FastLogger;

public class CafListener implements KoiEventListener {

    private FastLogger log;
    private Porta porta;

    public CafListener(FastLogger fl) {
        log = fl;
        log.debug("CafListener()");
        porta = App.getPorta();
    }

    @KoiEventHandler
    public void onCatchup(CatchupEvent e) {
        log.debug("CafListener recieved CatchupEvent.");

        String event = PortaConstants.BaseCategory.States.StateCatchupEvent.ID;
        log.debug("CafListener triggerring event " + event + ".");
        App.triggerEvent(event);
    }

    @KoiEventHandler
    public void onChannelPoints(ChannelPointsEvent e) {
        log.debug("CafListener recieved ChannelPointsEvent.");

        String event = PortaConstants.BaseCategory.States.StateChannelPointsEvent.ID;
        log.debug("CafListener triggerring event " + event + ".");
        App.triggerEvent(event);
    }

    @KoiEventHandler
    public void onClearChat(ClearChatEvent e) {
        log.debug("CafListener recieved ClearChatEvent.");

        String event = PortaConstants.BaseCategory.States.StateClearChatEvent.ID;
        log.debug("CafListener triggerring event " + event + ".");
        App.triggerEvent(event);
    }

    @KoiEventHandler
    public void onFollow(FollowEvent e) {
        log.debug("CafListener recieved FollowEvent.");

        String event = PortaConstants.BaseCategory.States.StateFollowEvent.ID;
        log.debug("CafListener triggerring event " + event + ".");
        App.triggerEvent(event);
    }

    // this might catch all events, maybe
    @KoiEventHandler
    public void onKoi(KoiEvent e) {
        log.debug("CafListener recieved KoiEvent.");

        String event = PortaConstants.BaseCategory.States.StateKoiEvent.ID;
        log.debug("CafListener triggerring event " + event + ".");
        App.triggerEvent(event);
    }

    @KoiEventHandler
    public void onLike(LikeEvent e) {
        log.debug("CafListener recieved LikeEvent.");

        String event = PortaConstants.BaseCategory.States.StateLikeEvent.ID;
        log.debug("CafListener triggerring event " + event + ".");
        App.triggerEvent(event);
    }

    // system messages
    // "one place that i can think of that uses it is youtube, where if you try to
    // send a message BEFORE you create a live stream we send back a warning using
    // PLATFORM_MESSAGE"
    // https://github.com/Casterlabs/Koi/blob/v2/Integration-Youtube/src/main/java/co/casterlabs/koi/integration/youtube/YoutubeProvider.java#L177
    @KoiEventHandler
    public void onPlatformMessage(PlatformMessageEvent e) {
        log.debug("CafListener recieved PlatformMessageEvent.");

        String event = PortaConstants.BaseCategory.States.StatePlatformMessageEvent.ID;
        log.debug("CafListener triggerring event " + event + ".");
        App.triggerEvent(event);
    }

    @KoiEventHandler
    public void onRaid(RaidEvent e) {
        log.debug("CafListener recieved RaidEvent.");

        String event = PortaConstants.BaseCategory.States.StateRaidEvent.ID;
        log.debug("CafListener triggerring event " + event + ".");
        App.triggerEvent(event);
    }

    @KoiEventHandler
    public void onRichMessage(RichMessageEvent e) {
        log.debug("CafListener recieved RichMessageEvent.");

        String event = PortaConstants.BaseCategory.States.StateRichMessageEvent.ID;
        log.debug("CafListener triggerring event " + event + ".");
        App.triggerEvent(event);
    }

    @KoiEventHandler
    public void onRoomstate(RoomstateEvent e) {
        log.debug("CafListener recieved RoomstateEvent.");

        String event = PortaConstants.BaseCategory.States.StateRoomstateEvent.ID;
        log.debug("CafListener triggerring event " + event + ".");
        App.triggerEvent(event);
    }

    @KoiEventHandler
    public void onStreamStatus(StreamStatusEvent e) {
        log.debug("CafListener recieved StreamStatusEvent.");

        String event = PortaConstants.BaseCategory.States.StateStreamStatusEvent.ID;
        log.debug("CafListener triggerring event " + event + ".");
        App.triggerEvent(event);
    }

    @KoiEventHandler
    public void onSubscription(SubscriptionEvent e) {
        log.debug("CafListener recieved SubscriptionEvent.");

        String event = PortaConstants.BaseCategory.States.StateSubscriptionEvent.ID;
        log.debug("CafListener triggerring event " + event + ".");
        App.triggerEvent(event);
    }

    @KoiEventHandler
    public void onUserUpdate(UserUpdateEvent e) {
        log.debug("CafListener recieved UserUpdateEvent.");

        String event = PortaConstants.BaseCategory.States.StateUserUpdateEvent.ID;
        log.debug("CafListener triggerring event " + event + ".");
        App.triggerEvent(event);
    }

    @KoiEventHandler
    public void onViewerCount(ViewerCountEvent e) {
        log.debug("CafListener recieved ViewerCountEvent.");

        String event = PortaConstants.BaseCategory.States.StateViewerCountEvent.ID;
        log.debug("CafListener triggerring event " + event + ".");
        App.triggerEvent(event);
    }

    @KoiEventHandler
    public void onViewerJoin(ViewerJoinEvent e) {
        log.debug("CafListener recieved ViewerJoinEvent.");

        String event = PortaConstants.BaseCategory.States.StateViewerJoinEvent.ID;
        log.debug("CafListener triggerring event " + event + ".");
        App.triggerEvent(event);
    }

    @KoiEventHandler
    public void onViewerLeave(ViewerLeaveEvent e) {
        log.debug("CafListener recieved ViewerLeaveEvent.");

        String event = PortaConstants.BaseCategory.States.StateViewerLeaveEvent.ID;
        log.debug("CafListener triggerring event " + event + ".");
        App.triggerEvent(event);
    }

    @KoiEventHandler
    public void onViewerList(ViewerListEvent e) {
        log.debug("CafListener recieved ViewerListEvent.");

        String event = PortaConstants.BaseCategory.States.StateViewerListEvent.ID;
        log.debug("CafListener triggerring event " + event + ".");
        App.triggerEvent(event);
    }
}
