package com.soundcloud.android.features.library.artists;

import android.view.View;
import com.soundcloud.android.features.library.aa.l;
import com.soundcloud.android.soul.components.empty.view.EmptyFullscreenView;

/* compiled from: ArtistsFragment.kt */
public final class c implements C6837lJa {
    private final C6781kVa<RVa> a;

    public c() {
        C6781kVa<RVa> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<Unit>()");
        this.a = s;
    }

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

    public final C6781kVa<RVa> e() {
        return this.a;
    }

    public int b() {
        return l.empty_fullscreen_no_following;
    }

    public int a(C6973nJa nja) {
        C7471uYa.b(nja, "legacyError");
        return a.a((C6837lJa) this, nja);
    }

    public int a() {
        return a.b(this);
    }

    public void a(View view) {
        C7471uYa.b(view, "view");
        if (view instanceof EmptyFullscreenView) {
            ((EmptyFullscreenView) view).setUpsellButtonOnClickListener(new b(this));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
