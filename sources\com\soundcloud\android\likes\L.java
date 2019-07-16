package com.soundcloud.android.likes;

import android.view.View;
import com.soundcloud.android.ia.l;

/* compiled from: TrackLikesEmptyStateProvider.kt */
public final class L implements C6837lJa {
    public void a(View view, C6973nJa nja) {
        C7471uYa.b(view, "view");
        C7471uYa.b(nja, "errorType");
        a.a(this, view, nja);
    }

    public void b(View view) {
        C7471uYa.b(view, "view");
        a.b(this, view);
    }

    public int c() {
        return l.emptyview_progress;
    }

    public int d() {
        return l.emptyview_connection_error;
    }

    public int b() {
        return l.emptyview_no_likes_results;
    }

    public void a(View view) {
        C7471uYa.b(view, "view");
        a.a((C6837lJa) this, view);
    }

    public int a(C6973nJa nja) {
        C7471uYa.b(nja, "legacyError");
        return a.a((C6837lJa) this, nja);
    }

    public int a() {
        return l.emptyview_server_error;
    }
}
