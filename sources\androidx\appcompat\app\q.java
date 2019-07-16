package androidx.appcompat.app;

import android.view.View;

/* compiled from: AppCompatDelegateImpl */
class q implements C1506mc {
    final /* synthetic */ w a;

    q(w wVar) {
        this.a = wVar;
    }

    public Ic a(View view, Ic ic) {
        int e = ic.e();
        int j = this.a.j(e);
        if (e != j) {
            ic = ic.a(ic.c(), j, ic.d(), ic.b());
        }
        return C1778vc.b(view, ic);
    }
}
