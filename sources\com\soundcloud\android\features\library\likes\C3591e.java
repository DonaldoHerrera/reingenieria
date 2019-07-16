package com.soundcloud.android.features.library.likes;

import android.view.View;
import com.soundcloud.android.features.library.aa.l;
import com.soundcloud.android.soul.components.empty.view.EmptyFullscreenView;

/* renamed from: com.soundcloud.android.features.library.likes.e reason: case insensitive filesystem */
/* compiled from: TrackLikesFragment.kt */
public final class C3591e implements C6837lJa {
    private final C2332VH<RVa> a;

    public C3591e() {
        C2332VH<RVa> s = C2332VH.s();
        C7471uYa.a((Object) s, "PublishRelay.create<Unit>()");
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

    public final C2332VH<RVa> e() {
        return this.a;
    }

    public int b() {
        return l.empty_fullscreen_no_likes;
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
            ((EmptyFullscreenView) view).setUpsellButtonOnClickListener(new C3590d(this));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
