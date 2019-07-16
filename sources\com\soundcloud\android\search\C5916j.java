package com.soundcloud.android.search;

import android.view.View;
import com.soundcloud.android.ia.l;

/* renamed from: com.soundcloud.android.search.j reason: case insensitive filesystem */
/* compiled from: SearchEmptyStateProvider.kt */
public final class C5916j implements C6837lJa {
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
        return l.emptyview_no_search_results;
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
