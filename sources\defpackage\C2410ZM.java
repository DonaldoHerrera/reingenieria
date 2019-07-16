package defpackage;

/* renamed from: ZM reason: default package and case insensitive filesystem */
/* compiled from: AppboyAttributeName */
enum C2410ZM {
    CREATOR_DISPLAY_NAME("creator_display_name"),
    CREATOR_URN("creator_urn"),
    PLAYABLE_TITLE("playable_title"),
    PLAYABLE_URN("playable_urn"),
    PLAYABLE_TYPE("playable_type"),
    PLAYLIST_TITLE("playlist_title"),
    PLAYLIST_URN("playlist_urn"),
    CATEGORY("category"),
    GENRE("genre");
    
    private final String k;

    private C2410ZM(String str) {
        this.k = str;
    }

    /* access modifiers changed from: 0000 */
    public String a() {
        return this.k;
    }
}
