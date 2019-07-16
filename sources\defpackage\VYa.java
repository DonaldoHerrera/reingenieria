package defpackage;

/* renamed from: VYa reason: default package */
/* compiled from: ObservableProperty.kt */
public abstract class VYa<T> implements WYa<Object, T> {
    private T a;

    public VYa(T t) {
        this.a = t;
    }

    public T a(Object obj, DZa<?> dZa) {
        C7471uYa.b(dZa, "property");
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void a(DZa<?> dZa, T t, T t2) {
        C7471uYa.b(dZa, "property");
    }

    /* access modifiers changed from: protected */
    public boolean b(DZa<?> dZa, T t, T t2) {
        C7471uYa.b(dZa, "property");
        return true;
    }

    public void a(Object obj, DZa<?> dZa, T t) {
        C7471uYa.b(dZa, "property");
        T t2 = this.a;
        if (b(dZa, t2, t)) {
            this.a = t;
            a(dZa, t2, t);
        }
    }
}
