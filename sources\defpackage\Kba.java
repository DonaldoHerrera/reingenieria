package defpackage;

import android.support.v4.media.MediaBrowserCompat.MediaItem;
import java.util.List;

/* renamed from: Kba reason: default package */
/* compiled from: DefaultMediaBrowserDataSource.kt */
final class Kba<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Fba a;

    Kba(Fba fba) {
        this.a = fba;
    }

    /* renamed from: a */
    public final List<MediaItem> apply(List<? extends C3863rda> list) {
        C7471uYa.b(list, "it");
        return this.a.b(list);
    }
}
