package defpackage;

import android.net.Uri;

/* renamed from: Rwa reason: default package and case insensitive filesystem */
/* compiled from: InstagramStoriesApi.kt */
final class C5282Rwa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C5312Swa a;
    final /* synthetic */ Uri b;

    C5282Rwa(C5312Swa swa, Uri uri) {
        this.a = swa;
        this.b = uri;
    }

    /* renamed from: a */
    public final d apply(Uri uri) {
        C7471uYa.b(uri, "artworkUri");
        Uri uri2 = this.b;
        C7471uYa.a((Object) uri2, "stickerUri");
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.b.o());
        sb.append("?ref=");
        sb.append(C3235rM.INSTAGRAM);
        return new d(uri, uri2, sb.toString());
    }
}
