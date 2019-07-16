package com.google.android.gms.internal.firebase-perf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.firebase-perf.hc reason: case insensitive filesystem */
final class C0847hc<T> implements C0886rc<T> {
    private final C0835ec a;
    private final Kc<?, ?> b;
    private final boolean c;
    private final C0850ib<?> d;

    private C0847hc(Kc<?, ?> kc, C0850ib<?> ibVar, C0835ec ecVar) {
        this.b = kc;
        this.c = ibVar.a(ecVar);
        this.d = ibVar;
        this.a = ecVar;
    }

    static <T> C0847hc<T> a(Kc<?, ?> kc, C0850ib<?> ibVar, C0835ec ecVar) {
        return new C0847hc<>(kc, ibVar, ecVar);
    }

    public final void b(T t, T t2) {
        C0894tc.a(this.b, t, t2);
        if (this.c) {
            C0894tc.a(this.d, t, t2);
        }
    }

    public final boolean c(T t) {
        return this.d.a((Object) t).c();
    }

    public final void d(T t) {
        this.b.a(t);
        this.d.c(t);
    }

    public final boolean a(T t, T t2) {
        if (!this.b.c(t).equals(this.b.c(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.a((Object) t).equals(this.d.a((Object) t2));
        }
        return true;
    }

    public final int b(T t) {
        Kc<?, ?> kc = this.b;
        int d2 = kc.d(kc.c(t)) + 0;
        return this.c ? d2 + this.d.a((Object) t).g() : d2;
    }

    public final int a(T t) {
        int hashCode = this.b.c(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.a((Object) t).hashCode() : hashCode;
    }

    public final void a(T t, dd ddVar) throws IOException {
        Iterator d2 = this.d.a((Object) t).d();
        while (d2.hasNext()) {
            Entry entry = (Entry) d2.next();
            C0878pb pbVar = (C0878pb) entry.getKey();
            if (pbVar.C() != fd.MESSAGE || pbVar.z() || pbVar.D()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof Hb) {
                ddVar.a(pbVar.k(), (Object) ((Hb) entry).a().a());
            } else {
                ddVar.a(pbVar.k(), entry.getValue());
            }
        }
        Kc<?, ?> kc = this.b;
        kc.b(kc.c(t), ddVar);
    }
}
