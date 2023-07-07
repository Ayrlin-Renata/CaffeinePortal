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
    }

    @KoiEventHandler
    public void onChannelPoints(ChannelPointsEvent e) {
        log.debug("CafListener recieved ChannelPointsEvent.");
    }

    @KoiEventHandler
    public void onClearChat(ClearChatEvent e) {
        log.debug("CafListener recieved ClearChatEvent.");
    }

    @KoiEventHandler
    public void onFollow(FollowEvent e) {
        log.debug("CafListener recieved FollowEvent.");
    }

    // this might catch all events, maybe
    @KoiEventHandler
    public void onKoi(KoiEvent e) {
        log.debug("CafListener recieved KoiEvent.");
    }

    @KoiEventHandler
    public void onLike(LikeEvent e) {
        log.debug("CafListener recieved LikeEvent.");
    }

    // system messages
    // "one place that i can think of that uses it is youtube, where if you try to
    // send a message BEFORE you create a live stream we send back a warning using
    // PLATFORM_MESSAGE"
    // https://github.com/Casterlabs/Koi/blob/v2/Integration-Youtube/src/main/java/co/casterlabs/koi/integration/youtube/YoutubeProvider.java#L177
    @KoiEventHandler
    public void onPlatformMessage(PlatformMessageEvent e) {
        log.debug("CafListener recieved PlatformMessageEvent.");
    }

    @KoiEventHandler
    public void onRaid(RaidEvent e) {
        log.debug("CafListener recieved RaidEvent.");
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
    }

    @KoiEventHandler
    public void onStreamStatus(StreamStatusEvent e) {
        log.debug("CafListener recieved StreamStatusEvent.");
    }

    @KoiEventHandler
    public void onSubscription(SubscriptionEvent e) {
        log.debug("CafListener recieved SubscriptionEvent.");
    }

    @KoiEventHandler
    public void onUserUpdate(UserUpdateEvent e) {
        log.debug("CafListener recieved UserUpdateEvent.");
    }

    @KoiEventHandler
    public void onViewerCount(ViewerCountEvent e) {
        log.debug("CafListener recieved ViewerCountEvent.");
    }

    @KoiEventHandler
    public void onViewerJoin(ViewerJoinEvent e) {
        log.debug("CafListener recieved ViewerJoinEvent.");
    }

    @KoiEventHandler
    public void onViewerLeave(ViewerLeaveEvent e) {
        log.debug("CafListener recieved ViewerLeaveEvent.");
    }

    @KoiEventHandler
    public void onViewerList(ViewerListEvent e) {
        log.debug("CafListener recieved ViewerListEvent.");
    }
}
