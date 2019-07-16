package com.google.android.gms.cast.framework.media;

import android.util.LruCache;
import com.google.android.gms.cast.MediaQueueItem;

final class J extends LruCache<Integer, MediaQueueItem> {
    private final /* synthetic */ C0647b a;

    J(C0647b bVar, int i) {
        this.a = bVar;
        super(i);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        if (z) {
            this.a.h.add(num);
        }
    }
}
