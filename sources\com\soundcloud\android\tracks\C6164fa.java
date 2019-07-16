package com.soundcloud.android.tracks;

import com.soundcloud.android.comments.Y;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.trackinfo.C6147e;

/* renamed from: com.soundcloud.android.tracks.fa reason: case insensitive filesystem */
/* compiled from: TrackInfoCommentClickHandler.kt */
public final class C6164fa implements C6147e {
    private final C4655rja a;

    public C6164fa(C4655rja rja) {
        C7471uYa.b(rja, "navigator");
        this.a = rja;
    }

    public void a(C3508cda cda, long j, String str) {
        C7471uYa.b(cda, "trackUrn");
        Y y = new Y(cda, j, str, false, 8, null);
        C4655rja rja = this.a;
        C4621nja a2 = C4621nja.a(y, a());
        C7471uYa.a((Object) a2, "NavigationTarget.forComm…ms, getContextMetadata())");
        rja.a(a2);
    }

    private final C3710l a() {
        return C3710l.a.a("track_info", "new");
    }
}
