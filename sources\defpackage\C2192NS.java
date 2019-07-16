package defpackage;

/* renamed from: NS reason: default package and case insensitive filesystem */
/* compiled from: MyPlaylistsUniflowOperations.kt */
final class C2192NS<T> implements C7256rQa<Jaa<Object>> {
    public static final C2192NS a = new C2192NS();

    C2192NS() {
    }

    /* renamed from: a */
    public final boolean test(Jaa<Object> jaa) {
        C7471uYa.b(jaa, "event");
        return jaa.b() == a.PLAYLIST_PUSHED_TO_SERVER || jaa.b() == a.TRACK_ADDED;
    }
}
