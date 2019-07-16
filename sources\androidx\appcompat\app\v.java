package androidx.appcompat.app;

import android.view.View;

/* compiled from: AppCompatDelegateImpl */
class v extends Gc {
    final /* synthetic */ w a;

    v(w wVar) {
        this.a = wVar;
    }

    public void b(View view) {
        this.a.q.setAlpha(1.0f);
        this.a.t.a((Fc) null);
        this.a.t = null;
    }

    public void c(View view) {
        this.a.q.setVisibility(0);
        this.a.q.sendAccessibilityEvent(32);
        if (this.a.q.getParent() instanceof View) {
            C1778vc.G((View) this.a.q.getParent());
        }
    }
}
