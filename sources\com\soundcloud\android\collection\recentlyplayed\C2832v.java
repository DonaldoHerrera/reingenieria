package com.soundcloud.android.collection.recentlyplayed;

import android.view.View;
import com.soundcloud.android.ia.l;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.v reason: case insensitive filesystem */
/* compiled from: RecentlyPlayedFragment.kt */
public final class C2832v implements C6837lJa {
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
        return a.c(this);
    }

    public int d() {
        return a.a(this);
    }

    public int b() {
        return l.emptyview_no_recent_plays;
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
        return a.b(this);
    }
}
