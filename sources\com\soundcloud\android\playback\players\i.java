package com.soundcloud.android.playback.players;

import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import com.soundcloud.android.playback.core.d;
import java.util.List;

/* compiled from: MediaService.kt */
final class i<T> implements C6776kQa<List<? extends QueueItem>> {
    final /* synthetic */ MediaService a;

    i(MediaService mediaService) {
        this.a = mediaService;
    }

    /* renamed from: a */
    public final void accept(List<QueueItem> list) {
        d c = MediaService.c(this.a);
        StringBuilder sb = new StringBuilder();
        sb.append("onSetQueue: [");
        sb.append(list);
        sb.append(']');
        c.a("MediaService", sb.toString());
        MediaService.e(this.a).setQueue(list);
    }
}
