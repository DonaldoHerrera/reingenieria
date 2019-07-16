package defpackage;

import com.soundcloud.android.foundation.events.K.g;

/* renamed from: JN reason: default package and case insensitive filesystem */
/* compiled from: EventLoggerV1JsonDataBuilder */
/* synthetic */ class C2111JN {
    static final /* synthetic */ int[] a = new int[g.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(80:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|(3:79|80|82)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(82:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|82) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0086 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0092 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00aa */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00ce */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fe */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x010a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0116 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0122 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x013a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0146 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0152 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x015e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x016a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0176 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0182 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x018e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x019a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x01a6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x01b2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x01be */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x01ca */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01d6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
    static {
        a[g.SHARE.ordinal()] = 1;
        a[g.REPOST.ordinal()] = 2;
        a[g.UNREPOST.ordinal()] = 3;
        a[g.LIKE.ordinal()] = 4;
        a[g.UNLIKE.ordinal()] = 5;
        a[g.SHUFFLE.ordinal()] = 6;
        a[g.SWIPE_SKIP.ordinal()] = 7;
        a[g.SYSTEM_SKIP.ordinal()] = 8;
        a[g.BUTTON_SKIP.ordinal()] = 9;
        a[g.VIDEO_AD_FULLSCREEN.ordinal()] = 10;
        a[g.VIDEO_AD_SHRINK.ordinal()] = 11;
        a[g.VIDEO_AD_MUTE.ordinal()] = 12;
        a[g.VIDEO_AD_UNMUTE.ordinal()] = 13;
        a[g.AD_CLICKTHROUGH.ordinal()] = 14;
        a[g.SKIP_AD_CLICK.ordinal()] = 15;
        a[g.FOLLOW.ordinal()] = 16;
        a[g.UNFOLLOW.ordinal()] = 17;
        a[g.PLAYER_OPEN.ordinal()] = 18;
        a[g.PLAYER_CLOSE.ordinal()] = 19;
        a[g.PLAY_QUEUE_OPEN.ordinal()] = 20;
        a[g.PLAY_QUEUE_CLOSE.ordinal()] = 21;
        a[g.PLAY_QUEUE_SHUFFLE.ordinal()] = 22;
        a[g.PLAY_QUEUE_TRACK_REORDER.ordinal()] = 23;
        a[g.PLAY_QUEUE_TRACK_REMOVE.ordinal()] = 24;
        a[g.PLAY_QUEUE_TRACK_REMOVE_UNDO.ordinal()] = 25;
        a[g.PLAY_QUEUE_REPEAT.ordinal()] = 26;
        a[g.PLAY_NEXT.ordinal()] = 27;
        a[g.PLAYER_INTERACTION.ordinal()] = 28;
        a[g.COMMENTS_OPEN.ordinal()] = 29;
        a[g.COMMENTS_AVATAR_CLICK.ordinal()] = 30;
        a[g.COMMENT_ADD.ordinal()] = 31;
        a[g.COMMENT_DELETE.ordinal()] = 32;
        a[g.STREAMING_QUALITY_STANDARD_CLICK.ordinal()] = 33;
        a[g.STREAMING_QUALITY_HIGH_CLICK.ordinal()] = 34;
        a[g.ITEM_NAVIGATION.ordinal()] = 35;
        a[g.HEADER_PLAY_TOGGLE.ordinal()] = 36;
        a[g.RECOMMENDED_PLAYLISTS.ordinal()] = 37;
        a[g.MORE_PLAYLISTS_BY_USER.ordinal()] = 38;
        a[g.DISCOVERY_CARD.ordinal()] = 39;
        try {
            a[g.NAVIGATION.ordinal()] = 40;
        } catch (NoSuchFieldError unused) {
        }
    }
}
