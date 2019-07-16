package defpackage;

import com.adjust.sdk.Constants;
import com.google.common.base.Predicate;

/* renamed from: Yca reason: default package */
/* compiled from: Screen */
public enum Yca {
    UNKNOWN(0, "unknown"),
    TOUR(1, "tour:main"),
    AUTH_LOG_IN(2, "auth:log_in_prompt"),
    AUTH_SIGN_UP(3, "auth:sign_up_prompt"),
    AUTH_TERMS(4, "auth:accept_terms"),
    AUTH_USER_DETAILS(5, "auth:user_details"),
    AUTH_FORGOT_PASSWORD(6, "auth:forgot_password"),
    VERIFY_AGE(7, "verify_age"),
    SIDE_MENU_DRAWER(8, "drawer"),
    STREAM(9, "stream:main"),
    VIDEO_FULLSCREEN(10, "ads:video"),
    PRESTITIAL(11, "ads:display"),
    COLLECTIONS(12, "collection:main"),
    LIKES(13, "collection:likes"),
    PLAYLISTS(14, "collection:playlists"),
    OFFLINE_ONBOARDING(15, "collection:offline_onboarding"),
    OFFLINE_OFFBOARDING(16, "collection:offline_offboarding"),
    PLAY_HISTORY(17, "collection:history"),
    RECENTLY_PLAYED(18, "collection:recently_played"),
    LIKED_STATIONS(19, "collection:stations"),
    COLLECTION_FOLLOWING(103, "collection:following"),
    LIKES_SEARCH(104, "collection:likes:search"),
    DOWNLOADS(197, "collection:downloads"),
    ONBOARDING_MAIN(20, "onboarding:main"),
    ONBOARDING_GENRE(21, "onboarding:genre"),
    ONBOARDING_FACEBOOK(22, "onboarding:facebook"),
    YOUR_POSTS(23, "user:posts"),
    YOUR_INFO(24, "user:info"),
    YOUR_PLAYLISTS(25, "user:playlists"),
    YOUR_LIKES(26, "user:likes"),
    YOUR_FOLLOWINGS(27, "user:followings"),
    YOUR_FOLLOWERS(28, "user:followers"),
    YOUR_MAIN(29, "user:main"),
    YOUR_REPOSTS(31, "user:reposts"),
    YOUR_TOP_TRACKS(105, "user:top_tracks"),
    USERS_HEADER(30, "users:header"),
    USERS_INFO(32, "users:info"),
    USERS_FOLLOWINGS(33, "users:followings"),
    USERS_FOLLOWERS(34, "users:followers"),
    USERS_REPOSTS(35, "users:reposts"),
    USERS_TRACKS(36, "users:tracks"),
    USERS_ALBUMS(37, "users:albums"),
    USERS_LIKES(38, "users:likes"),
    USERS_PLAYLISTS(39, "users:playlists"),
    USERS_MAIN(40, "users:main"),
    USERS_TOP_TRACKS(106, "users:top_tracks"),
    PLAYER_MAIN(41, "tracks:main"),
    PLAYER_INFO(42, "tracks:info"),
    PLAYER_LIKES(43, "tracks:likes"),
    PLAYER_REPOSTS(44, "tracks:reposts"),
    PLAYER_COMMENTS(45, "tracks:comments"),
    PLAY_QUEUE(46, "play_queue:main"),
    DISCOVER(47, "discovery:main"),
    SYSTEM_PLAYLIST(48, "systemplaylists:main"),
    SEARCH_HISTORY(96, "search:history"),
    SEARCH_MAIN(49, "search:main"),
    SEARCH_EVERYTHING(50, "search:everything"),
    SEARCH_TRACKS(51, "search:tracks"),
    SEARCH_TOP_RESULTS(52, "search:top_results"),
    SEARCH_ALBUMS(53, "search:albums"),
    SEARCH_PLAYLISTS(54, "search:playlists"),
    SEARCH_USERS(55, "search:people"),
    SEARCH_SUGGESTIONS(57, "search:suggestions"),
    RECORD_MAIN(66, "record:main"),
    RECORD_EDIT(67, "record:edit"),
    RECORD_UPLOAD(68, "record:share"),
    RECORD_PROGRESS(69, "record:progress"),
    DEEPLINK_UPLOAD(70, "deeplink:share"),
    PLAYLIST_DETAILS(72, "playlists:main"),
    PLAYLIST_LIKES(73, "playlists:likes"),
    PLAYLIST_REPOSTS(74, "playlists:reposts"),
    ACTIVITIES(75, "activity:main"),
    MORE(76, "more:main"),
    SETTINGS_MAIN(77, "settings:main"),
    SETTINGS_NOTIFICATIONS(78, "settings:notification_settings"),
    SETTINGS_ACCOUNT(79, "settings:account_sync_settings"),
    SETTINGS_OFFLINE(80, "settings:offline_sync_settings"),
    SETTINGS_OFFLINE_STORAGE_LOCATION(81, "settings:offline_storage_location"),
    SETTINGS_OFFLINE_STORAGE_LOCATION_CONFIRM(82, "settings:offline_storage_location_confirm"),
    SETTINGS_STREAMING_QUALITY(102, "settings:streaming"),
    SETTINGS_LEGAL(83, "settings:legal"),
    SETTINGS_LICENSES(84, "settings:licenses"),
    SETTINGS_AUTOMATIC_SYNC_ONBOARDING(85, "settings:automatic_sync_onboarding"),
    SETTINGS_ALL(101, "settings:all"),
    WIDGET(86, "widget"),
    VOICE_COMMAND(88, "voice:command"),
    DEEPLINK(89, Constants.DEEPLINK),
    NOTIFICATION(90, "notification"),
    STATIONS_SHOW_ALL(91, "stations:show_all"),
    STATIONS_INFO(92, "stations:main"),
    CONVERSION(93, "consumer-premium:main"),
    PLAN_CHOICE(94, "consumer-premium:plans"),
    CHECKOUT(95, "consumer-premium:checkout"),
    PRIVACY_ADVERTISING(98, "privacy-settings:advertising"),
    PRIVACY_ANALYTICS(99, "privacy-settings:analytics"),
    PRIVACY_COMMUNICATIONS(100, "privacy-settings:communications");
    
    private final String Ta;
    private final int Ua;

    private Yca(int i, String str) {
        this.Ua = i;
        this.Ta = str;
    }

    public String a() {
        return this.Ta;
    }

    public int b() {
        return this.Ua;
    }

    public static Yca a(String str) {
        Yca[] values;
        for (Yca yca : values()) {
            if (yca.Ta.equals(str)) {
                return yca;
            }
        }
        return UNKNOWN;
    }

    public static Yca a(int i) {
        return (Yca) C1943BD.a((Iterable<? extends T>) C2063HD.a((E[]) values()), (Predicate<? super T>) new Rca<Object>(i), UNKNOWN);
    }
}
