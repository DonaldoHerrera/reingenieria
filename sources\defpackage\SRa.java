package defpackage;

/* renamed from: SRa reason: default package */
/* compiled from: MaybeJust */
public final class SRa<T> extends C7531vPa<T> implements LQa<T> {
    final T a;

    public SRa(T t) {
        this.a = t;
    }

    /* access modifiers changed from: protected */
    public void b(C7600wPa<? super T> wpa) {
        wpa.a(WPa.a());
        wpa.onSuccess(this.a);
    }

    public T call() {
        return this.a;
    }
}
