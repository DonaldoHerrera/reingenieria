package defpackage;

import android.support.v4.media.MediaBrowserCompat.MediaItem;
import com.soundcloud.android.tracks.C6185ma;
import java.util.List;

/* renamed from: Iba reason: default package */
/* compiled from: DefaultMediaBrowserDataSource.kt */
final class Iba<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Fba a;

    Iba(Fba fba) {
        this.a = fba;
    }

    /* renamed from: a */
    public final List<MediaItem> apply(List<? extends C6185ma> list) {
        C7471uYa.b(list, "trackItems");
        return this.a.a(list, C3872sea.LIKES);
    }
}
