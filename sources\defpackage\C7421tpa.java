package defpackage;

/* renamed from: tpa reason: default package and case insensitive filesystem */
/* compiled from: DataSourceProvider.kt */
final class C7421tpa<T> implements C7256rQa<Jaa<Object>> {
    public static final C7421tpa a = new C7421tpa();

    C7421tpa() {
    }

    /* renamed from: a */
    public final boolean test(Jaa<Object> jaa) {
        C7471uYa.b(jaa, "event");
        return jaa.b() == a.TRACK_ADDED || jaa.b() == a.PLAYLIST_UPDATED || jaa.b() == a.TRACK_REMOVED || jaa.b() == a.PLAYLIST_EDITED;
    }
}
