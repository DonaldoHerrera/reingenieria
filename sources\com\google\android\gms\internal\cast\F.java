package com.google.android.gms.internal.cast;

import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.C0642j;
import com.google.android.gms.cast.framework.C0645m;
import com.google.android.gms.cast.framework.C0664p;
import com.google.android.gms.cast.framework.C0665q;
import com.google.android.gms.cast.framework.media.C0650e;
import com.google.android.gms.cast.framework.media.C0650e.C0042e;

public final class F extends C1644qr implements C0042e {
    private final TextView b;
    private final ImageView c;
    private final C1703sr d;

    public F(View view, C1703sr srVar) {
        this.b = (TextView) view.findViewById(C0645m.live_indicator_text);
        this.c = (ImageView) view.findViewById(C0645m.live_indicator_dot);
        this.d = srVar;
        TypedArray obtainStyledAttributes = this.c.getContext().obtainStyledAttributes(null, C0665q.CastExpandedController, C0642j.castExpandedControllerStyle, C0664p.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(C0665q.CastExpandedController_castLiveIndicatorColor, 0);
        obtainStyledAttributes.recycle();
        this.c.getDrawable().setColorFilter(this.c.getContext().getResources().getColor(resourceId), Mode.SRC_IN);
        e();
    }

    private final void e() {
        boolean z;
        C0650e a = a();
        int i = 8;
        if (a == null || !a.m() || !a.o()) {
            this.b.setVisibility(8);
            this.c.setVisibility(8);
            return;
        }
        if (!a.A()) {
            z = a.r();
        } else {
            z = this.d.e();
        }
        this.b.setVisibility(0);
        ImageView imageView = this.c;
        if (z) {
            i = 0;
        }
        imageView.setVisibility(i);
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

    public final void d() {
        if (a() != null) {
            a().a((C0042e) this);
        }
        super.d();
        e();
    }

    public final void a(long j, long j2) {
        e();
    }
}
