package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: PO reason: default package and case insensitive filesystem */
/* compiled from: ApiEndpoints.kt */
public enum C2226PO {
    SIGN_IN("/sign_in"),
    SIGN_UP("/sign_up"),
    RESET_PASSWORD("/users/passwords/reset"),
    GCM_REGISTER("/push/register"),
    GCM_DEREGISTER("/push/deregister"),
    RELATED_TRACKS("/tracks/%s/related"),
    SEARCH_TRACKS("/search/tracks"),
    SEARCH_USERS("/search/users"),
    SEARCH_ALBUMS("/search/albums"),
    SEARCH_PLAYLISTS_WITHOUT_ALBUMS("/search/playlists_without_albums"),
    SEARCH_ALL("/search/universal"),
    SEARCH_AUTOCOMPLETE("/search/autocomplete"),
    SEARCH_TOP_RESULTS("/search/top_results"),
    DISCOVERY_CARDS("/discovery/cards"),
    SYSTEM_PLAYLISTS("/system-playlists/%s"),
    SYSTEM_PLAYLISTS_RESOLVE("/system-playlists/resolve"),
    ADS("/tracks/%s/ads"),
    PRESTITIALS("/ads/prestitials"),
    INTERSTITIAL("/tracks/%s/ads/interstitial"),
    INLAY_ADS("/stream/ads"),
    POLICIES_WITH_MEDIA("/tracks/policies-with-media"),
    WEB_PRODUCTS("/products/android-web"),
    NATIVE_PRODUCTS("/products/google-play"),
    CHECKOUT("/checkout"),
    CHECKOUT_URN("/checkout/%s"),
    LIKED_TRACKS("/likes/tracks"),
    LIKED_PLAYLISTS("/likes/playlists"),
    CREATE_TRACK_LIKES("/likes/tracks/create"),
    DELETE_TRACK_LIKES("/likes/tracks/delete"),
    CREATE_PLAYLIST_LIKES("/likes/playlists/create"),
    DELETE_PLAYLIST_LIKES("/likes/playlists/delete"),
    MY_TRACK_POSTS("/you/posts_and_reposts/tracks"),
    MY_PLAYLIST_POSTS("/you/posts_and_reposts/playlists"),
    MY_FOLLOWINGS("/you/followings"),
    FOLLOWINGS("/followings/%s/users"),
    FOLLOWERS("/followers/%s/users"),
    USER_FOLLOWS("/follows/users/%s"),
    TRACKS_FETCH("/tracks/fetch"),
    USERS_FETCH("/users/fetch"),
    PLAYLISTS_CREATE("/playlists"),
    PLAYLISTS_UPDATE("/playlists/%s"),
    PLAYLISTS_DELETE("/playlists/%s"),
    PLAYLISTS_FETCH("/playlists/fetch"),
    PLAYLIST_WITH_TRACKS("/playlists/%s/info"),
    PLAYLIST_ADD_TRACK("/playlists/%s/tracks"),
    PLAYLIST_REMOVE_TRACK("/playlists/%s/tracks/%s"),
    UPDATE_USER("/you/profile"),
    UPDATE_USER_AVATAR("/you/profile/avatar"),
    MY_DOB("/you/profile/dob"),
    PROFILE("/users/%s/profile/v2"),
    PROFILE_INFO("/users/%s/profile/info"),
    USER_REPOSTS("/users/%s/reposts"),
    USER_TRACKS("/users/%s/tracks/posted"),
    USER_ALBUMS("/users/%s/albums/posted"),
    USER_LIKES("/users/%s/likes"),
    USER_PLAYLISTS("/users/%s/playlists/posted"),
    USER_TOP_TRACKS("/users/%s/top-tracks"),
    STATION("/stations/%s/station_and_tracks"),
    STATIONS("/stations"),
    STATIONS_LIKED("/stations/liked"),
    STATIONS_FETCH("/stations/fetch"),
    STREAM("/stream"),
    ACTIVITIES("/activities"),
    HLS_STREAM("/tracks/%s/streams/hls"),
    HLS_SNIPPET_STREAM("/tracks/%s/streams/hls/snippet"),
    HTTPS_STREAM("/tracks/%s/streams/https"),
    OFFLINE_SYNC("/tracks/%s/offline_sync"),
    IMAGES("/images/%s/%s"),
    CONFIGURATION("/configuration/android"),
    DEVICE_REGISTRATION("/device/registration"),
    RESOLVE_ENTITY("/resolve"),
    ME("/me"),
    RESEND_EMAIL_CONFIRMATION("/me/emails/confirmation"),
    NOTIFICATION_PREFERENCES("/notification_preferences"),
    TRACK_COMMENTS("/tracks/%s/comments"),
    THREADED_TRACK_COMMENTS("/tracks/%s/comments/threaded"),
    TRACK_REPORT_COMMENT("/comments/spam"),
    TRACK_DELETE_COMMENT("/comments/%s"),
    PRIVACY_SETTINGS("/configuration/privacy-settings"),
    PLAY_HISTORY("/recently-played/tracks"),
    CLEAR_PLAY_HISTORY("/recently-played/tracks/all"),
    RECENTLY_PLAYED("/recently-played/contexts"),
    CLEAR_RECENTLY_PLAYED("/recently-played/contexts/all"),
    MY_TRACK_REPOSTS("/reposts/tracks/%s"),
    MY_PLAYLIST_REPOSTS("/reposts/playlists/%s"),
    CRASH("/crashes/android"),
    PLAY_PUBLISH("/tpub"),
    MOBILE_PLAY("/events/mobile_play_session"),
    CURRENT_USER("/me");
    
    private final String Ma;

    private C2226PO(String str) {
        this.Ma = str;
    }

    private final String c(Object[] objArr) {
        KYa kYa = KYa.a;
        Locale locale = Locale.US;
        C7471uYa.a((Object) locale, "Locale.US");
        String str = this.Ma;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        C7471uYa.a((Object) format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public final String a() {
        return this.Ma;
    }

    public final String b(Object... objArr) {
        C7471uYa.b(objArr, "pathParams");
        return c(objArr);
    }

    public final String a(Object... objArr) {
        C7471uYa.b(objArr, "pathParams");
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(Uri.encode(obj.toString()));
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return c(array);
        }
        throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
