package com.soundcloud.android.features.library.downloads;

import android.view.View;
import com.soundcloud.android.features.library.aa;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.soul.components.empty.view.EmptyFullscreenView;

/* compiled from: DownloadsEmptyStateProvider.kt */
public final class n implements c<L> {
    private final C2332VH<RVa> a;

    public n() {
        C2332VH<RVa> s = C2332VH.s();
        C7471uYa.a((Object) s, "PublishRelay.create<Unit>()");
        this.a = s;
    }

    public void a(View view, L l) {
        C7471uYa.b(view, "view");
        C7471uYa.b(l, "errorType");
        a.a(this, view, l);
    }

    public void b(View view) {
        C7471uYa.b(view, "view");
        a.b(this, view);
    }

    public int c() {
        return l.emptyview_progress;
    }

    public final C2332VH<RVa> e() {
        return this.a;
    }

    public int b() {
        return aa.l.empty_fullscreen_no_downloads;
    }

    public int a(L l) {
        C7471uYa.b(l, "error");
        return l.emptyview_connection_error;
    }

    public void a(View view) {
        C7471uYa.b(view, "view");
        if (view instanceof EmptyFullscreenView) {
            ((EmptyFullscreenView) view).setUpsellButtonOnClickListener(new m(this));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
