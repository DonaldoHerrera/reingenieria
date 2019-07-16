package defpackage;

import android.support.v4.media.MediaMetadataCompat;
import com.soundcloud.android.playback.core.d;

/* renamed from: sna reason: default package and case insensitive filesystem */
/* compiled from: QueueManager.kt */
final class C4668sna<T> implements C6776kQa<MediaMetadataCompat> {
    final /* synthetic */ C4650qna a;
    final /* synthetic */ _Xa b;

    C4668sna(C4650qna qna, _Xa _xa) {
        this.a = qna;
        this.b = _xa;
    }

    /* renamed from: a */
    public final void accept(MediaMetadataCompat mediaMetadataCompat) {
        d a2 = this.a.d;
        StringBuilder sb = new StringBuilder();
        sb.append("loadInitialMediaMetadata [");
        C7471uYa.a((Object) mediaMetadataCompat, "metadata");
        sb.append(mediaMetadataCompat.getDescription());
        sb.append(']');
        a2.b("QueueManager", sb.toString());
        this.b.invoke(mediaMetadataCompat);
    }
}
