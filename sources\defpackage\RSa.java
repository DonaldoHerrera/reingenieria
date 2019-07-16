package defpackage;

/* renamed from: RSa reason: default package */
/* compiled from: ObservableJust */
public final class RSa<T> extends APa<T> implements LQa<T> {
    private final T a;

    public RSa(T t) {
        this.a = t;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        a aVar = new a(gPa, this.a);
        gPa.a((VPa) aVar);
        aVar.run();
    }

    public T call() {
        return this.a;
    }
}
