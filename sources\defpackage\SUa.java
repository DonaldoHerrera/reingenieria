package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: SUa reason: default package */
/* compiled from: ResourceObserver */
public abstract class SUa<T> implements GPa<T>, VPa {
    private final AtomicReference<VPa> a = new AtomicReference<>();
    private final C7601wQa b = new C7601wQa();

    public final void a(VPa vPa) {
        if (CUa.a(this.a, vPa, getClass())) {
            b();
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    public final void dispose() {
        if (C7463uQa.a(this.a)) {
            this.b.dispose();
        }
    }

    public final boolean a() {
        return C7463uQa.a((VPa) this.a.get());
    }
}
