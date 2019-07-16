package com.google.android.gms.internal.cast;

import android.view.View;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.media.C0650e;

public final class A extends C1644qr {
    private final View b;
    private final int c;

    public A(View view, int i) {
        this.b = view;
        this.c = i;
        this.b.setEnabled(false);
    }

    private final void e() {
        boolean z;
        C0650e a = a();
        if (a == null || !a.m()) {
            this.b.setEnabled(false);
            return;
        }
        MediaStatus i = a.i();
        if (i.ea() == 0) {
            Integer m = i.m(i.H());
            if (m == null || m.intValue() <= 0) {
                z = false;
                if (z || a.s()) {
                    this.b.setVisibility(this.c);
                    this.b.setEnabled(false);
                }
                this.b.setVisibility(0);
                this.b.setEnabled(true);
                return;
            }
        }
        z = true;
        if (z) {
        }
        this.b.setVisibility(this.c);
        this.b.setEnabled(false);
    }

    public final void a(C0636d dVar) {
        super.a(dVar);
        e();
    }

    public final void b() {
        e();
    }

    public final void c() {
        this.b.setEnabled(false);
    }

    public final void d() {
        this.b.setEnabled(false);
        super.d();
    }
}
