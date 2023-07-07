# CaffeinePortal
CasterLabs Caffenated x TouchPortal Dual Plugin 

## Currently UNTESTED 1.0
it *should* work but don't count on it! not even worthy of being called a 1.0 but i just wanna ship it

## Install
0. Shut down CasterLabs Caffeinated. 
1. Download `caffeineportal.jar` and stick it in `%appdata%\Roaming\casterlabs-caffeinated\plugins`
2. Download `CaffeinePortal.tpp`
3. Open TouchPortal and click the gear icon in the upper right, then *import plug-in*.
4. Import `CaffeinePortal.tpp`
5. If it asks to trust the plugin, do so.
6. Start up CasterLabs Caffeinated.

## Use
CaffeinePortal makes TouchPortal Plug-in States for each CasterLabs Caffeinated event. 

 - CatchupEvent
 - ChannelPointsEvent
 - ClearChatEvent
 - FollowEvent
 - KoiEvent - Any event
 - LikeEvent
 - PlatformMessageEvent - System messages
 - RaidEvent
 - RichMessageEvent - Chat and donations
 - RoomStateEvent
 - StreamStatusEvent
 - SubscriptionEvent
 - UserUpdateEvent
 - ViewerCountEvent
 - ViewerJoinEvent
 - ViewerLeaveEvent
 - ViewerListEvent

The corresponding Plug-in States in TouchPortal are set briefly to "New" when these events are triggered, then set to "Waiting" instantaneously. 

## Help

If you want to know more about specifically when the CL events are triggered, probably ask in #sdk in the CL discord. 

For more information about the plugin contact @ayrlin on the CasterLabs or TouchPortal discord.

## Special thanks to:
e3ndr//ItzLcyx for being a chad Casterlabs dev and helping me a lot, and im pretty sure there may have even been some backend changes to help me along.

ChristopheCVB and Pjiesco for helping me sort out my ludicrous problems on the TouchPortal discord.

Gitago and xXKiller_BOSSXx for helping me learn TouchPortal plugins.
