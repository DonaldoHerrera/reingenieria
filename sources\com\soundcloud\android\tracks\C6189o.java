package com.soundcloud.android.tracks;

import android.content.Context;
import com.soundcloud.android.ia.p;

/* renamed from: com.soundcloud.android.tracks.o reason: case insensitive filesystem */
/* compiled from: DefaultTrackEngagements.kt */
public final class C6189o implements Lca {
    private final C6614hxa a;
    private final C5052KJa b;

    public C6189o(C6614hxa hxa, C5052KJa kJa) {
        C7471uYa.b(hxa, "shareOperations");
        C7471uYa.b(kJa, "feedbackController");
        this.a = hxa;
        this.b = kJa;
    }

    public void a(Context context, Mca mca) {
        C7471uYa.b(context, "context");
        C7471uYa.b(mca, "options");
        try {
            this.a.a(context, mca);
        } catch (b unused) {
            C5052KJa kJa = this.b;
            Fca fca = new Fca(p.share_private_playlist_offline_error, 0, 0, null, null, null, 62, null);
            kJa.a(fca);
        }
    }
}
