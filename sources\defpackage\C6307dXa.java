package defpackage;

import java.io.Serializable;

/* renamed from: dXa reason: default package and case insensitive filesystem */
/* compiled from: CoroutineContextImpl.kt */
public final class C6307dXa implements C5711cXa, Serializable {
    public static final C6307dXa a = new C6307dXa();

    private C6307dXa() {
    }

    private final Object readResolve() {
        return a;
    }

    public <E extends a> E a(b<E> bVar) {
        C7471uYa.b(bVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
