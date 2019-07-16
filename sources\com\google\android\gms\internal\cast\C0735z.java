package com.google.android.gms.internal.cast;

import android.view.View;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.media.C0650e;
import com.google.android.gms.cast.framework.media.C0650e.C0042e;

/* renamed from: com.google.android.gms.internal.cast.z reason: case insensitive filesystem */
public final class C0735z extends C1644qr implements C0042e {
    private final View b;
    private final C1703sr c;

    public C0735z(View view, C1703sr srVar) {
        this.b = view;
        this.c = srVar;
        this.b.setEnabled(false);
    }

    private final void e() {
        View view;
        C0650e a = a();
        boolean z = true;
        if (a == null || !a.m() || a.s()) {
            view = this.b;
        } else {
            if (!a.o()) {
                view = this.b;
            } else {
                View view2 = this.b;
                if (!a.A() || this.c.d()) {
                    view = view2;
                } else {
                    view = view2;
                }
            }
            view.setEnabled(z);
        }
        z = false;
        view.setEnabled(z);
    }

    public final void a(C0636d dVar) {
        super.a(dVar);
        if (a() != null) {
            a().a((C0042e) this, 1000);
        }
        e();
    }

    public final void b() {
        e();
    }

    public final void c() {
        this.b.setEnabled(false);
    }

    public final void d() {
        if (a() != null) {
            a().a((C0042e) this);
        }
        this.b.setEnabled(false);
        super.d();
        e();
    }

    public final void a(long j, long j2) {
        e();
    }
}
