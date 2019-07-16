package com.soundcloud.android.offline;

import java.util.List;

/* compiled from: OfflineContentOperations.kt */
public final class Ad {
    /* access modifiers changed from: private */
    public static final boolean b(Id id) {
        List e = id.e();
        C7471uYa.a((Object) e, "tracksToDownload()");
        if (!e.isEmpty()) {
            return true;
        }
        List g = id.g();
        C7471uYa.a((Object) g, "tracksToRestore()");
        if (!g.isEmpty()) {
            return true;
        }
        List f = id.f();
        C7471uYa.a((Object) f, "tracksToMarkForDeletion()");
        if (!f.isEmpty()) {
            return true;
        }
        return false;
    }
}
