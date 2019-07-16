package com.google.android.gms.internal.cast;

import android.view.View;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.media.C0650e;

/* renamed from: com.google.android.gms.internal.cast.u reason: case insensitive filesystem */
public final class C0730u extends C1644qr {
    private final View b;

    public C0730u(View view) {
        this.b = view;
    }

    private final void e() {
        C0650e a = a();
        if (a == null || !a.m() || a.n()) {
            this.b.setVisibility(0);
        } else {
            this.b.setVisibility(8);
        }
    }

    public final void a(C0636d dVar) {
        super.a(dVar);
        e();
    }

    public final void b() {
        e();
    }

    public final void c() {
        this.b.setVisibility(0);
    }

    public final void d() {
        this.b.setVisibility(8);
        super.d();
    }
}
