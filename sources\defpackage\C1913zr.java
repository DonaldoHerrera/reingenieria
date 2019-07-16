package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: zr reason: default package and case insensitive filesystem */
final class C1913zr implements OnClickListener {
    private final /* synthetic */ long a;
    private final /* synthetic */ C1673rr b;

    C1913zr(C1673rr rrVar, long j) {
        this.b = rrVar;
        this.a = j;
    }

    public final void onClick(View view) {
        this.b.d(view, this.a);
    }
}
