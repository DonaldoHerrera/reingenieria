package com.soundcloud.android.stream;

import android.view.View;
import android.widget.Button;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;

/* renamed from: com.soundcloud.android.stream.ga reason: case insensitive filesystem */
/* compiled from: StreamEmptyStateProvider.kt */
public final class C6080ga implements C6837lJa {
    private final C6781kVa<RVa> a;

    public C6080ga() {
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
        return l.emptyview_no_stream_results;
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
        ((Button) view.findViewById(i.search_action_button)).setOnClickListener(new C6078fa(this));
    }
}
