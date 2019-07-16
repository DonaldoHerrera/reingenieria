package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: Ar reason: default package */
final class Ar implements OnClickListener {
    private final /* synthetic */ long a;
    private final /* synthetic */ C1673rr b;

    Ar(C1673rr rrVar, long j) {
        this.b = rrVar;
        this.a = j;
    }

    public final void onClick(View view) {
        this.b.c(view, this.a);
    }
}
