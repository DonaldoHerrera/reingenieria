package com.google.android.gms.internal.cast;

import android.widget.TextView;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.C0663o;
import com.google.android.gms.cast.framework.media.C0650e;
import com.google.android.gms.cast.framework.media.C0650e.C0042e;

public final class E extends C1644qr implements C0042e {
    private final TextView b;
    private final C1703sr c;

    public E(TextView textView, C1703sr srVar) {
        this.b = textView;
        this.c = srVar;
        e();
    }

    private final void e() {
        C0650e a = a();
        if (a == null || !a.m()) {
            TextView textView = this.b;
            textView.setText(textView.getContext().getString(C0663o.cast_invalid_stream_duration_text));
            return;
        }
        this.b.setText(this.c.c(a.d()));
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
