package defpackage;

import android.content.Context;

/* renamed from: eNa reason: default package and case insensitive filesystem */
/* compiled from: AbstractValueCache */
public abstract class C6365eNa<T> implements C6501gNa<T> {
    private final C6501gNa<T> a;

    public C6365eNa(C6501gNa<T> gna) {
        this.a = gna;
    }

    private void b(Context context, T t) {
        if (t != null) {
            a(context, t);
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    public abstract T a(Context context);

    public final synchronized T a(Context context, C6569hNa<T> hna) throws Exception {
        T a2;
        a2 = a(context);
        if (a2 == null) {
            a2 = this.a != null ? this.a.a(context, hna) : hna.a(context);
            b(context, a2);
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public abstract void a(Context context, T t);
}
