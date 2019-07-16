package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: Ml reason: default package */
/* compiled from: TapTargetView */
class Ml implements OnGlobalLayoutListener {
    final /* synthetic */ C1907zl a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ Context c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ Nl f;

    Ml(Nl nl, C1907zl zlVar, ViewGroup viewGroup, Context context, boolean z, boolean z2) {
        this.f = nl;
        this.a = zlVar;
        this.b = viewGroup;
        this.c = context;
        this.d = z;
        this.e = z2;
    }

    public void onGlobalLayout() {
        if (!this.f.b) {
            this.f.e();
            this.a.a((Runnable) new Ll(this));
        }
    }
}
