package com.soundcloud.android.deeplinks;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.EnumSet;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: DeepLink */
public enum e {
    HOME,
    STREAM,
    DISCOVERY,
    SEARCH,
    RECORD,
    THE_UPLOAD,
    PULSE,
    WEB_VIEW,
    TRACKED_REDIRECT,
    STATION,
    ENTITY,
    SOUNDCLOUD_GO_PLUS_UPSELL,
    SOUNDCLOUD_GO_BUY,
    SOUNDCLOUD_GO_PLUS_BUY,
    SOUNDCLOUD_GO_CHOICE,
    SOUNDCLOUD_GO_PLUS_CHOICE,
    NOTIFICATION_PREFERENCES,
    COLLECTION,
    STREAMING_QUALITY_SETTINGS,
    OFFLINE_SETTINGS,
    CHARTS,
    TRACK_ENTITY,
    PLAYLIST_ENTITY,
    SYSTEM_PLAYLIST_ENTITY,
    USER_ENTITY,
    SYSTEM_PLAYLIST_PERMALINK,
    SHARE_APP,
    SYSTEM_SETTINGS,
    REMOTE_SIGN_IN,
    UNKNOWN,
    ACTIVITIES,
    FOLLOWERS,
    FOLLOWINGS,
    SEARCH_AUTOCOMPLETE,
    SEARCH_FROM_EMPTY_STATE,
    LIBRARY_FROM_EMPTY_STATE,
    AD_FULLSCREEN_VIDEO,
    AD_PRESTITIAL,
    AD_CLICKTHROUGH,
    SYSTEM_PLAYLIST,
    PLAYLISTS_AND_ALBUMS_COLLECTION,
    LIKES_COLLECTION,
    LIKES_COLLECTION_SEARCH,
    DOWNLOADS_COLLECTION,
    PLAYLISTS_COLLECTION,
    ARTIST_COLLECTION,
    PLAYLISTS,
    PROFILE,
    PROFILE_REPOSTS,
    PROFILE_TRACKS,
    PROFILE_LIKES,
    PROFILE_ALBUMS,
    PROFILE_PLAYLISTS,
    PROFILE_TOP_TRACKS,
    LIKED_STATIONS,
    HELP_CENTER,
    LEGAL,
    BASIC_SETTINGS,
    EXTERNAL_APP,
    COMMENTS_OPEN,
    COMMENTS_CLOSE,
    STANDALONE_COMMENTS,
    UPGRADE,
    WEB_CHECKOUT_FOR_PRODUCT,
    PRODUCT_CHOICE,
    SETTINGS,
    LICENSES,
    ANALYTICS_SETTINGS,
    ADVERTISING_SETTINGS,
    COMMUNICATIONS_SETTINGS,
    DOWNLOADS_STORAGE_LOCATION_SETTINGS;
    
    static final EnumSet<e> ta = null;
    static final EnumSet<e> ua = null;
    private static final Pattern[] va = null;
    private static final Pattern[] wa = null;
    private static final Pattern[] xa = null;
    private static final Pattern[] ya = null;

    static {
        e eVar;
        e eVar2;
        e eVar3;
        e eVar4;
        e eVar5;
        e eVar6;
        e eVar7;
        e eVar8;
        e eVar9;
        e eVar10;
        e eVar11;
        e eVar12;
        e eVar13;
        e eVar14;
        e eVar15;
        e eVar16;
        e eVar17;
        e eVar18;
        e eVar19;
        e eVar20;
        e eVar21;
        e eVar22;
        e eVar23;
        e eVar24;
        e eVar25;
        e eVar26;
        e eVar27;
        e eVar28;
        e eVar29;
        e eVar30;
        e eVar31;
        e eVar32;
        e eVar33;
        e eVar34;
        e eVar35;
        e eVar36;
        e eVar37;
        e eVar38;
        e eVar39;
        e eVar40;
        e eVar41;
        e eVar42;
        e eVar43;
        e eVar44;
        e eVar45;
        e eVar46;
        e eVar47;
        e eVar48;
        ta = EnumSet.of(eVar21, new e[]{eVar, eVar2, eVar3, eVar4, eVar6, eVar5, eVar16, eVar17, eVar18, eVar19, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar30, eVar22, eVar20, eVar23, eVar24, eVar27, eVar28, eVar29, eVar30, eVar31, eVar32, eVar33, eVar34, eVar35, eVar36, eVar37, eVar25, eVar26, eVar38, eVar42, eVar39, eVar40, eVar41, eVar43, eVar44, eVar45, eVar46, eVar47, eVar48});
        ua = EnumSet.of(ENTITY, new e[]{TRACK_ENTITY, USER_ENTITY, PLAYLIST_ENTITY, SYSTEM_PLAYLIST_ENTITY, TRACKED_REDIRECT});
        va = new Pattern[]{Pattern.compile("^/login/reset/[0-9a-f]+$"), Pattern.compile("^/login/forgot$"), Pattern.compile("^/imprint$"), Pattern.compile("^/signin/forgot$"), Pattern.compile("^/emails/[0-9a-f]+$"), Pattern.compile("^/pro(/.*)?$"), Pattern.compile("^/student(/.*)?$"), Pattern.compile("^/pages/.*$"), Pattern.compile("^/terms-of-use$"), Pattern.compile("^/go-terms-of-use$"), Pattern.compile("^/connect(/.*)?$"), Pattern.compile("^/jobs(/.*)?$")};
        wa = new Pattern[]{Pattern.compile("^/you/stats(/.*)?$"), Pattern.compile("^/you/tracks/?$"), Pattern.compile("^/notifications/?$")};
        xa = new Pattern[]{Pattern.compile("^/-/.*$")};
        ya = new Pattern[]{Pattern.compile(".*suggestedtracks_all/*$"), Pattern.compile(".*suggested_tracks/all/*$")};
    }

    public static boolean c(Uri uri) {
        return "soundcloud.com".equals(uri.getHost()) && uri.getPath().startsWith("/-/t/click") && !TextUtils.isEmpty(uri.getQueryParameter(ImagesContract.URL));
    }

    public static boolean d(Uri uri) {
        if (uri.isHierarchical()) {
            if ("soundcloud".equals(uri.getScheme())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (com.adjust.sdk.Constants.SCHEME.equalsIgnoreCase(r2.getScheme()) != false) goto L_0x001e;
     */
    public static boolean e(Uri uri) {
        if (uri.isHierarchical()) {
            if (!"http".equalsIgnoreCase(uri.getScheme())) {
            }
            if (uri.getHost() != null && uri.getHost().contains("soundcloud.com")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0205, code lost:
        if (r7.equals("/offline_listening") == false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x024e, code lost:
        if (r7.equals("/soundcloudgo") == false) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x02b8, code lost:
        if (r7.equals(r2) != false) goto L_0x02c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x02c8 A[ADDED_TO_REGION] */
    private static e f(Uri uri) {
        char c;
        String host = uri.getHost();
        String str = "";
        char c2 = 0;
        switch (host.hashCode()) {
            case -2099916940:
                if (host.equals("buysoundcloudgo")) {
                    c = 19;
                    break;
                }
            case -2087726380:
                if (host.equals("settings_offlinelistening")) {
                    c = 24;
                    break;
                }
            case -1865828127:
                if (host.equals("playlists")) {
                    c = 30;
                    break;
                }
            case -1741312354:
                if (host.equals("collection")) {
                    c = 11;
                    break;
                }
            case -1682129500:
                if (host.equals("notification_preferences")) {
                    c = 25;
                    break;
                }
            case -1581715007:
                if (host.equals("share_app")) {
                    c = ' ';
                    break;
                }
            case -1404367711:
                if (host.equals("search:people")) {
                    c = 5;
                    break;
                }
            case -1377559195:
                if (host.equals("buy_ht")) {
                    c = 22;
                    break;
                }
            case -1377559040:
                if (host.equals("buy_mt")) {
                    c = 20;
                    break;
                }
            case -1361632171:
                if (host.equals("charts")) {
                    c = 26;
                    break;
                }
            case -1309068458:
                if (host.equals("search:sounds")) {
                    c = 6;
                    break;
                }
            case -1278274918:
                if (host.equals("search:tracks")) {
                    c = 9;
                    break;
                }
            case -934908847:
                if (host.equals("record")) {
                    c = 13;
                    break;
                }
            case -906336856:
                if (host.equals("search")) {
                    c = 4;
                    break;
                }
            case -896509628:
                if (host.equals("sounds")) {
                    c = 28;
                    break;
                }
            case -891990144:
                if (host.equals("stream")) {
                    c = 2;
                    break;
                }
            case -865716088:
                if (host.equals("tracks")) {
                    c = 27;
                    break;
                }
            case -838595071:
                if (host.equals("upload")) {
                    c = 12;
                    break;
                }
            case -736267846:
                if (host.equals("ht_modal")) {
                    c = 18;
                    break;
                }
            case -594466378:
                if (host.equals("search:users")) {
                    c = 8;
                    break;
                }
            case -573438237:
                if (host.equals("search:sets")) {
                    c = 7;
                    break;
                }
            case -209531505:
                if (host.equals("search:playlists")) {
                    c = 10;
                    break;
                }
            case 0:
                if (host.equals(str)) {
                    c = 0;
                    break;
                }
            case 3304:
                if (host.equals("go")) {
                    c = 17;
                    break;
                }
            case 3208415:
                if (host.equals("home")) {
                    c = 1;
                    break;
                }
            case 57116381:
                if (host.equals("the-upload")) {
                    c = 14;
                    break;
                }
            case 109400031:
                if (host.equals("share")) {
                    c = '!';
                    break;
                }
            case 111578632:
                if (host.equals("users")) {
                    c = 29;
                    break;
                }
            case 273184745:
                if (host.equals("discover")) {
                    c = 3;
                    break;
                }
            case 646703598:
                if (host.equals("soundcloudgo")) {
                    c = 16;
                    break;
                }
            case 1197825731:
                if (host.equals("system-playlists")) {
                    c = 31;
                    break;
                }
            case 1318331839:
                if (host.equals("stations")) {
                    c = 15;
                    break;
                }
            case 1434631203:
                if (host.equals("settings")) {
                    c = 23;
                    break;
                }
            case 1688162178:
                if (host.equals("open-notification-settings")) {
                    c = '\"';
                    break;
                }
            case 1939200174:
                if (host.equals("remote-sign-in")) {
                    c = '#';
                    break;
                }
            case 2079163150:
                if (host.equals("buysoundcloudgoplus")) {
                    c = 21;
                    break;
                }
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return HOME;
            case 2:
                return STREAM;
            case 3:
                String path = uri.getPath();
                int hashCode = path.hashCode();
                if (hashCode != -1887707374) {
                    if (hashCode == 0) {
                        break;
                    } else if (hashCode == 47 && path.equals("/")) {
                        c2 = 1;
                        if (c2 != 0 || c2 == 1) {
                            return DISCOVERY;
                        }
                        if (c2 != 2) {
                            return SYSTEM_PLAYLIST_PERMALINK;
                        }
                        return THE_UPLOAD;
                    }
                } else if (path.equals("/new-tracks-for-you")) {
                    c2 = 2;
                    if (c2 != 0) {
                    }
                    return DISCOVERY;
                }
                c2 = 65535;
                if (c2 != 0) {
                }
                return DISCOVERY;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return SEARCH;
            case 11:
                return COLLECTION;
            case 12:
            case 13:
                return RECORD;
            case 14:
                return THE_UPLOAD;
            case 15:
                StringBuilder sb = new StringBuilder();
                sb.append("/stations");
                sb.append(uri.getPath());
                if (a(sb.toString())) {
                    return STATION;
                }
                return ENTITY;
            case 16:
            case 17:
            case 18:
                String path2 = uri.getPath();
                int hashCode2 = path2.hashCode();
                if (hashCode2 != -1729260873) {
                    if (hashCode2 == -258335843) {
                        break;
                    }
                } else if (path2.equals("/soundcloudgoplus")) {
                    c2 = 1;
                    if (c2 != 0) {
                        return SOUNDCLOUD_GO_CHOICE;
                    }
                    if (c2 != 1) {
                        return SOUNDCLOUD_GO_PLUS_UPSELL;
                    }
                    return SOUNDCLOUD_GO_PLUS_CHOICE;
                }
                c2 = 65535;
                if (c2 != 0) {
                }
            case 19:
            case 20:
                return SOUNDCLOUD_GO_BUY;
            case 21:
            case 22:
                return SOUNDCLOUD_GO_PLUS_BUY;
            case 23:
                String path3 = uri.getPath();
                int hashCode3 = path3.hashCode();
                if (hashCode3 != -1275887149) {
                    if (hashCode3 != -526720813) {
                        if (hashCode3 == 1182117136) {
                            break;
                        }
                    } else if (path3.equals("/notification_preferences")) {
                        c2 = 1;
                        if (c2 == 0) {
                            return OFFLINE_SETTINGS;
                        }
                        if (c2 == 1) {
                            return NOTIFICATION_PREFERENCES;
                        }
                        if (c2 != 2) {
                            return ENTITY;
                        }
                        return STREAMING_QUALITY_SETTINGS;
                    }
                } else if (path3.equals("/streaming_quality")) {
                    c2 = 2;
                    if (c2 == 0) {
                    }
                }
                c2 = 65535;
                if (c2 == 0) {
                }
            case 24:
                return OFFLINE_SETTINGS;
            case 25:
                return NOTIFICATION_PREFERENCES;
            case 26:
                return CHARTS;
            case 27:
            case 28:
                return TRACK_ENTITY;
            case 29:
                return USER_ENTITY;
            case 30:
                return PLAYLIST_ENTITY;
            case 31:
                return SYSTEM_PLAYLIST_ENTITY;
            case ' ':
                return SHARE_APP;
            case '!':
                if ("/app".equals(uri.getPath())) {
                    return SHARE_APP;
                }
                return ENTITY;
            case '\"':
                return SYSTEM_SETTINGS;
            case '#':
                return REMOTE_SIGN_IN;
            default:
                return ENTITY;
        }
    }

    private static e g(Uri uri) {
        char c;
        String path = uri.getPath();
        switch (path.hashCode()) {
            case -2143336809:
                if (path.equals("/search")) {
                    c = 10;
                    break;
                }
            case -2128990097:
                if (path.equals("/stream")) {
                    c = 3;
                    break;
                }
            case -2075595024:
                if (path.equals("/upload")) {
                    c = 4;
                    break;
                }
            case -1814426480:
                if (path.equals("/search/users")) {
                    c = 15;
                    break;
                }
            case -1612413766:
                if (path.equals("/soundcloudgo/soundcloudgoplus")) {
                    c = 24;
                    break;
                }
            case -1218339496:
                if (path.equals("/discover/weekly")) {
                    c = 5;
                    break;
                }
            case -1016145438:
                if (path.equals("/settings/offline_listening")) {
                    c = ' ';
                    break;
                }
            case -629795451:
                if (path.equals("/settings_offlinelistening")) {
                    c = 31;
                    break;
                }
            case -568425209:
                if (path.equals("/search/people")) {
                    c = 12;
                    break;
                }
            case -526720813:
                if (path.equals("/notification_preferences")) {
                    c = 28;
                    break;
                }
            case -473125956:
                if (path.equals("/search/sounds")) {
                    c = 11;
                    break;
                }
            case -442332416:
                if (path.equals("/search/tracks")) {
                    c = 14;
                    break;
                }
            case -360619279:
                if (path.equals("/open-notification-settings")) {
                    c = '$';
                    break;
                }
            case -271635255:
                if (path.equals("/go/buy/go")) {
                    c = 26;
                    break;
                }
            case -258335843:
                if (path.equals("/soundcloudgo")) {
                    c = 20;
                    break;
                }
            case -29234880:
                if (path.equals("/tracks/search")) {
                    c = 17;
                    break;
                }
            case 0:
                if (path.equals("")) {
                    c = 0;
                    break;
                }
            case 47:
                if (path.equals("/")) {
                    c = 1;
                    break;
                }
            case 48471:
                if (path.equals("/go")) {
                    c = 21;
                    break;
                }
            case 46613902:
                if (path.equals("/home")) {
                    c = 2;
                    break;
                }
            case 142153758:
                if (path.equals("/go/buy/go-plus")) {
                    c = 27;
                    break;
                }
            case 212718313:
                if (path.equals("/ht_modal")) {
                    c = 19;
                    break;
                }
            case 226918138:
                if (path.equals("/discover/new-tracks-for-you")) {
                    c = 6;
                    break;
                }
            case 378872050:
                if (path.equals("/system-playlists")) {
                    c = '%';
                    break;
                }
            case 443698752:
                if (path.equals("/go/soundcloudgoplus")) {
                    c = 25;
                    break;
                }
            case 820817573:
                if (path.equals("/settings/streaming_quality")) {
                    c = '!';
                    break;
                }
            case 864585504:
                if (path.equals("/soundcloudgo/soundcloudgo")) {
                    c = 22;
                    break;
                }
            case 1133163369:
                if (path.equals("/search/playlists")) {
                    c = 16;
                    break;
                }
            case 1188323529:
                if (path.equals("/search/sets")) {
                    c = 13;
                    break;
                }
            case 1222170904:
                if (path.equals("/discover")) {
                    c = 8;
                    break;
                }
            case 1382082905:
                if (path.equals("/people/search")) {
                    c = 18;
                    break;
                }
            case 1471348459:
                if (path.equals("/settings/notifications")) {
                    c = 29;
                    break;
                }
            case 1499748428:
                if (path.equals("/the-upload")) {
                    c = 7;
                    break;
                }
            case 1696335172:
                if (path.equals("/charts")) {
                    c = 9;
                    break;
                }
            case 1892942758:
                if (path.equals("/go/soundcloudgo")) {
                    c = 23;
                    break;
                }
            case 1945043905:
                if (path.equals("/settings/notification_preferences")) {
                    c = 30;
                    break;
                }
            case 2065622178:
                if (path.equals("/share/app")) {
                    c = '#';
                    break;
                }
            case 2067052146:
                if (path.equals("/share_app")) {
                    c = '\"';
                    break;
                }
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                return HOME;
            case 3:
                return STREAM;
            case 4:
                return RECORD;
            case 5:
                return SYSTEM_PLAYLIST_PERMALINK;
            case 6:
            case 7:
                return THE_UPLOAD;
            case 8:
                return DISCOVERY;
            case 9:
                return CHARTS;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return SEARCH;
            case 19:
            case 20:
            case 21:
                return SOUNDCLOUD_GO_PLUS_UPSELL;
            case 22:
            case 23:
                return SOUNDCLOUD_GO_CHOICE;
            case 24:
            case 25:
                return SOUNDCLOUD_GO_PLUS_CHOICE;
            case 26:
                return SOUNDCLOUD_GO_BUY;
            case 27:
                return SOUNDCLOUD_GO_PLUS_BUY;
            case 28:
            case 29:
            case 30:
                return NOTIFICATION_PREFERENCES;
            case 31:
            case ' ':
                return OFFLINE_SETTINGS;
            case '!':
                return STREAMING_QUALITY_SETTINGS;
            case '\"':
            case '#':
                return SHARE_APP;
            case '$':
                return SYSTEM_SETTINGS;
            case '%':
                return SYSTEM_PLAYLIST_ENTITY;
            default:
                if (k(uri)) {
                    return REMOTE_SIGN_IN;
                }
                if (h(uri)) {
                    return CHARTS;
                }
                if (a(uri.getPath())) {
                    return STATION;
                }
                if (l(uri)) {
                    return TRACKED_REDIRECT;
                }
                if (m(uri)) {
                    return WEB_VIEW;
                }
                if (j(uri)) {
                    return PULSE;
                }
                return ENTITY;
        }
    }

    private static boolean h(Uri uri) {
        return uri.getPath().startsWith("/charts");
    }

    private static boolean i(Uri uri) {
        for (Pattern matcher : ya) {
            if (matcher.matcher(uri.toString()).matches()) {
                return true;
            }
        }
        return false;
    }

    private static boolean j(Uri uri) {
        for (Pattern matcher : wa) {
            if (matcher.matcher(uri.getPath()).matches()) {
                return true;
            }
        }
        return false;
    }

    private static boolean k(Uri uri) {
        List pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty() || !((String) pathSegments.get(0)).equals("activate")) {
            return false;
        }
        return true;
    }

    private static boolean l(Uri uri) {
        for (Pattern matcher : xa) {
            if (matcher.matcher(uri.getPath()).matches()) {
                return true;
            }
        }
        return false;
    }

    private static boolean m(Uri uri) {
        for (Pattern matcher : va) {
            if (matcher.matcher(uri.getPath()).matches()) {
                return true;
            }
        }
        return false;
    }

    public boolean a() {
        return ta.contains(this);
    }

    public boolean b() {
        return ua.contains(this);
    }

    public static Uri a(Uri uri) {
        String queryParameter = uri.getQueryParameter(ImagesContract.URL);
        return TextUtils.isEmpty(queryParameter) ? Uri.EMPTY : Uri.parse(queryParameter);
    }

    public static e b(Uri uri) {
        if (uri == null) {
            return HOME;
        }
        if (i(uri)) {
            return HOME;
        }
        if (d(uri)) {
            return f(uri);
        }
        if (e(uri)) {
            return g(uri);
        }
        return UNKNOWN;
    }

    private static boolean a(String str) {
        return str.startsWith("/stations/track/") || str.startsWith("/stations/artist/");
    }
}
