package defpackage;

/* renamed from: LTa reason: default package */
/* compiled from: SingleJust */
public final class LTa<T> extends IPa<T> {
    final T a;

    public LTa(T t) {
        this.a = t;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        kPa.a(WPa.a());
        kPa.onSuccess(this.a);
    }
}
