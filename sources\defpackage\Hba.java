package defpackage;

import android.support.v4.media.MediaBrowserCompat.MediaItem;
import androidx.media.MediaBrowserServiceCompat.i;
import java.util.List;

/* renamed from: Hba reason: default package */
/* compiled from: DefaultMediaBrowserDataSource.kt */
final class Hba<T> implements C6776kQa<List<? extends MediaItem>> {
    final /* synthetic */ i a;

    Hba(i iVar) {
        this.a = iVar;
    }

    /* renamed from: a */
    public final void accept(List<? extends MediaItem> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("sending result for root [");
        sb.append(list);
        sb.append(']');
        SDb.a(sb.toString(), new Object[0]);
        this.a.b(list);
    }
}
