package com.google.android.gms.internal.cast;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.C0663o;
import com.google.android.gms.cast.framework.media.C0650e;

/* renamed from: com.google.android.gms.internal.cast.x reason: case insensitive filesystem */
public final class C0733x extends C1644qr {
    private final ImageView b;
    private final View c;
    private final boolean d;
    private final Drawable e;
    private final String f;
    private final Drawable g;
    private final String h;
    private final Drawable i;
    private final String j;

    public C0733x(ImageView imageView, Context context, Drawable drawable, Drawable drawable2, Drawable drawable3, View view, boolean z) {
        this.b = imageView;
        this.e = drawable;
        this.g = drawable2;
        if (drawable3 != null) {
            drawable2 = drawable3;
        }
        this.i = drawable2;
        this.f = context.getString(C0663o.cast_play);
        this.h = context.getString(C0663o.cast_pause);
        this.j = context.getString(C0663o.cast_stop);
        this.c = view;
        this.d = z;
        this.b.setEnabled(false);
    }

    private final void e() {
        C0650e a = a();
        if (a == null || !a.m()) {
            this.b.setEnabled(false);
        } else if (a.q()) {
            a(this.e, this.f);
        } else if (a.r()) {
            if (a.o()) {
                a(this.i, this.j);
            } else {
                a(this.g, this.h);
            }
        } else if (a.n()) {
            a(false);
        } else {
            if (a.p()) {
                a(true);
            }
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
        a(true);
    }

    public final void d() {
        this.b.setEnabled(false);
        super.d();
    }

    private final void a(Drawable drawable, String str) {
        this.b.setImageDrawable(drawable);
        this.b.setContentDescription(str);
        this.b.setVisibility(0);
        this.b.setEnabled(true);
        View view = this.c;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private final void a(boolean z) {
        View view = this.c;
        int i2 = 0;
        if (view != null) {
            view.setVisibility(0);
        }
        ImageView imageView = this.b;
        if (this.d) {
            i2 = 4;
        }
        imageView.setVisibility(i2);
        this.b.setEnabled(!z);
    }
}
