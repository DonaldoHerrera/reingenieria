package defpackage;

import java.util.HashMap;

/* renamed from: SLa reason: default package and case insensitive filesystem */
/* compiled from: DefaultEventBus.kt */
public final class C5297SLa implements C5327TLa {
    private final HashMap<Integer, C6985nVa<?>> a = new HashMap<>();
    private final HPa b;

    public C5297SLa(HPa hPa) {
        C7471uYa.b(hPa, "defaultScheduler");
        this.b = hPa;
    }

    public final <E> GPa<E> a(C5443XLa<E> xLa, GPa<E> gPa) {
        C7471uYa.b(xLa, "queue");
        C7471uYa.b(gPa, "observer");
        GPa<E> c = a(xLa).a(this.b).c(gPa);
        C7471uYa.a((Object) c, "queue(queue).observeOn(d…).subscribeWith(observer)");
        return c;
    }

    public <E> VPa b(C5443XLa<E> xLa, SUa<E> sUa) {
        C7471uYa.b(xLa, "queue");
        C7471uYa.b(sUa, "observer");
        GPa c = a(xLa).c(sUa);
        C7471uYa.a((Object) c, "queue(queue).subscribeWith(observer)");
        return (VPa) c;
    }

    public <E> void c(C5443XLa<E> xLa, E e) {
        C7471uYa.b(xLa, "queue");
        a(xLa).a(e);
    }

    public <E> VPa a(C5443XLa<E> xLa, C6776kQa<E> kqa) {
        C7471uYa.b(xLa, "queue");
        C7471uYa.b(kqa, "onNext");
        VPa f = a(xLa).a(this.b).f(kqa);
        C7471uYa.a((Object) f, "queue(queue).observeOn(d…eduler).subscribe(onNext)");
        return f;
    }

    public <E> C6368eQa b(C5443XLa<E> xLa, E e) {
        C7471uYa.b(xLa, "queue");
        return new C5237QLa(this, xLa, e);
    }

    public <E> VPa a(C5443XLa<E> xLa, SUa<E> sUa) {
        C7471uYa.b(xLa, "queue");
        C7471uYa.b(sUa, "observer");
        GPa c = a(xLa).a(this.b).c(sUa);
        C7471uYa.a((Object) c, "queue(queue).observeOn(d…).subscribeWith(observer)");
        return (VPa) c;
    }

    public <E, T> C6776kQa<T> a(C5443XLa<E> xLa, E e) {
        C7471uYa.b(xLa, "queue");
        return new C5267RLa(this, xLa, e);
    }

    public <E> C6985nVa<E> a(C5443XLa<E> xLa) {
        C7471uYa.b(xLa, "queue");
        Object obj = this.a.get(Integer.valueOf(xLa.b()));
        if (!(obj instanceof C6985nVa)) {
            obj = null;
        }
        C6985nVa<E> nva = (C6985nVa) obj;
        if (nva == null) {
            if (xLa.d()) {
                nva = C5414WLa.a.a(xLa.a(), xLa.c());
            } else {
                nva = C5414WLa.a.a(xLa.c());
            }
            this.a.put(Integer.valueOf(xLa.b()), nva);
        }
        return nva;
    }
}
