package defpackage;

import java.io.Serializable;

/* renamed from: kXa reason: default package and case insensitive filesystem */
/* compiled from: ContinuationImpl.kt */
public abstract class C6783kXa implements C5575aXa<Object>, C6987nXa, Serializable {
    private final C5575aXa<Object> a;

    public C6783kXa(C5575aXa<Object> axa) {
        this.a = axa;
    }

    public final C5575aXa<Object> a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(Object obj);

    public final void b(Object obj) {
        Object obj2 = obj;
        C6783kXa kxa = this;
        while (true) {
            C7194qXa.b(kxa);
            C5575aXa<Object> axa = kxa.a;
            if (axa != null) {
                try {
                    obj2 = kxa.a(obj2);
                    if (obj2 != C6715jXa.a()) {
                        a aVar = IVa.a;
                        IVa.b(obj2);
                        kxa.c();
                        if (axa instanceof C6783kXa) {
                            kxa = (C6783kXa) axa;
                        } else {
                            axa.b(obj2);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    a aVar2 = IVa.a;
                    obj2 = JVa.a(th);
                    IVa.b(obj2);
                }
            } else {
                C7471uYa.a();
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object b = b();
        if (b == null) {
            b = getClass().getName();
        }
        sb.append(b);
        return sb.toString();
    }

    public C5575aXa<RVa> a(Object obj, C5575aXa<?> axa) {
        C7471uYa.b(axa, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement b() {
        return C7125pXa.a(this);
    }
}
