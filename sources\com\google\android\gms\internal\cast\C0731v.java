package com.google.android.gms.internal.cast;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.gms.cast.C0627a.d;
import com.google.android.gms.cast.framework.C0635c;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.C0663o;
import com.google.android.gms.cast.framework.media.C0650e;

/* renamed from: com.google.android.gms.internal.cast.v reason: case insensitive filesystem */
public final class C0731v extends C1644qr {
    private final ImageView b;
    private final String c = this.e.getString(C0663o.cast_mute);
    private final String d = this.e.getString(C0663o.cast_unmute);
    private final Context e;
    private d f;

    public C0731v(ImageView imageView, Context context) {
        this.b = imageView;
        this.e = context.getApplicationContext();
        this.b.setEnabled(false);
        this.f = null;
    }

    public final void a(C0636d dVar) {
        if (this.f == null) {
            this.f = new C0734y(this);
        }
        super.a(dVar);
        dVar.a(this.f);
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
        C0636d a = C0635c.a(this.e).c().a();
        if (a != null) {
            d dVar = this.f;
            if (dVar != null) {
                a.b(dVar);
            }
        }
        super.d();
    }

    /* access modifiers changed from: protected */
    public final void e() {
        C0636d a = C0635c.a(this.e).c().a();
        if (a == null || !a.b()) {
            this.b.setEnabled(false);
            return;
        }
        C0650e a2 = a();
        if (a2 == null || !a2.m()) {
            this.b.setEnabled(false);
        } else {
            this.b.setEnabled(true);
        }
        if (a.h()) {
            a(true);
        } else {
            a(false);
        }
    }

    private final void a(boolean z) {
        this.b.setSelected(z);
        this.b.setContentDescription(z ? this.c : this.d);
    }
}
