package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: YLa reason: default package and case insensitive filesystem */
/* compiled from: TestEventBus */
public class C5472YLa implements C5327TLa {
    private final C5297SLa a = new C5297SLa(C6645iVa.d());
    private final Map<C5443XLa, Set<VUa>> b = new HashMap();
    private final Map<C5443XLa, Set<VPa>> c = new HashMap();

    public <E> VPa a(C5443XLa<E> xLa, SUa<E> sUa) {
        a(xLa, this.a.a(xLa, sUa));
        return sUa;
    }

    public <E> VPa b(C5443XLa<E> xLa, SUa<E> sUa) {
        return a(xLa, sUa);
    }

    /* renamed from: c */
    public <T> void d(C5443XLa<T> xLa, T t) {
        b(xLa);
        this.a.c(xLa, t);
    }

    public <E> C6368eQa b(C5443XLa<E> xLa, E e) {
        return new C5207PLa(this, xLa, e);
    }

    private <E> void a(C5443XLa<E> xLa, VPa vPa) {
        Set set = (Set) this.c.get(xLa);
        if (set == null) {
            set = new HashSet();
            this.c.put(xLa, set);
        }
        set.add(vPa);
    }

    private <T> void b(C5443XLa<T> xLa) {
        if (!this.b.containsKey(xLa)) {
            VUa vUa = new VUa();
            this.a.a(xLa, (GPa<E>) vUa);
            Set set = (Set) this.b.get(xLa);
            if (set == null) {
                set = new HashSet();
                this.b.put(xLa, set);
            }
            set.add(vUa);
        }
    }

    public <E> VPa a(C5443XLa<E> xLa, C6776kQa<E> kqa) {
        VPa a2 = this.a.a(xLa, kqa);
        a(xLa, a2);
        return a2;
    }

    public /* synthetic */ void a(C5443XLa xLa, Object obj, Object obj2) throws Exception {
        d(xLa, obj);
    }

    public <E, T> C6776kQa<T> a(C5443XLa<E> xLa, E e) {
        return new C5177OLa(this, xLa, e);
    }

    public <T> C6985nVa<T> a(C5443XLa<T> xLa) {
        b(xLa);
        return this.a.a(xLa);
    }
}
