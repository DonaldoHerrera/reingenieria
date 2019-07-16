package defpackage;

import android.support.v4.media.MediaBrowserCompat.MediaItem;
import java.util.List;

/* renamed from: Gba reason: default package */
/* compiled from: DefaultMediaBrowserDataSource.kt */
final class Gba<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Fba a;

    Gba(Fba fba) {
        this.a = fba;
    }

    /* renamed from: a */
    public final List<MediaItem> apply(C3890vY vYVar) {
        C7471uYa.b(vYVar, "it");
        return this.a.a(vYVar.a());
    }
}
