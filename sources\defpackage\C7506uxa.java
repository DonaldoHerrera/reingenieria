package defpackage;

import android.net.Uri;
import java.io.File;

/* renamed from: uxa reason: default package and case insensitive filesystem */
/* compiled from: TrackArtworkProvider.kt */
final class C7506uxa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C7575vxa a;

    C7506uxa(C7575vxa vxa) {
        this.a = vxa;
    }

    /* renamed from: a */
    public final Uri apply(File file) {
        C7471uYa.b(file, "it");
        return this.a.b.a(file);
    }
}
