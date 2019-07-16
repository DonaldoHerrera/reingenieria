package com.soundcloud.android.sync;

import android.content.SyncResult;

/* renamed from: com.soundcloud.android.sync.m reason: case insensitive filesystem */
/* compiled from: BackgroundSyncResultReceiverFactory */
final class C6130m {
    private final C7054oVa<la> a;

    C6130m(C7054oVa<la> ova) {
        a((T) ova, 1);
        this.a = ova;
    }

    /* access modifiers changed from: 0000 */
    public BackgroundSyncResultReceiver a(Runnable runnable, SyncResult syncResult) {
        a((T) runnable, 1);
        Runnable runnable2 = runnable;
        a((T) syncResult, 2);
        SyncResult syncResult2 = syncResult;
        Object obj = this.a.get();
        a((T) obj, 3);
        return new BackgroundSyncResultReceiver(runnable2, syncResult2, (la) obj);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
