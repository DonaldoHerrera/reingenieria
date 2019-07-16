package androidx.fragment.app;

import androidx.lifecycle.f;
import androidx.lifecycle.f.a;
import androidx.lifecycle.h;
import androidx.lifecycle.j;

/* compiled from: FragmentViewLifecycleOwner */
class P implements h {
    private j a = null;

    P() {
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        if (this.a == null) {
            this.a = new j(this);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return this.a != null;
    }

    public f getLifecycle() {
        a();
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar) {
        this.a.b(aVar);
    }
}
