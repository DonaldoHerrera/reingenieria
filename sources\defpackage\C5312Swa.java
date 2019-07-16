package defpackage;

import android.net.Uri;

/* renamed from: Swa reason: default package and case insensitive filesystem */
/* compiled from: InstagramStoriesApi.kt */
final class C5312Swa<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C5341Twa a;
    final /* synthetic */ C3509cea b;

    C5312Swa(C5341Twa twa, C3509cea cea) {
        this.a = twa;
        this.b = cea;
    }

    /* renamed from: a */
    public final IPa<d> apply(Uri uri) {
        C7471uYa.b(uri, "stickerUri");
        C5252Qwa qwa = this.a.a;
        C3509cea cea = this.b;
        C7471uYa.a((Object) cea, "track");
        return qwa.a(cea).e(new C5282Rwa(this, uri));
    }
}
