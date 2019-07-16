package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

final class Qa<T> implements C0741bb<T> {
    private final La a;
    private final C0794tb<?, ?> b;
    private final boolean c;
    private final T<?> d;

    private Qa(C0794tb<?, ?> tbVar, T<?> t, La la) {
        this.b = tbVar;
        this.c = t.a(la);
        this.d = t;
        this.a = la;
    }

    static <T> Qa<T> a(C0794tb<?, ?> tbVar, T<?> t, La la) {
        return new Qa<>(tbVar, t, la);
    }

    public final int a(T t) {
        int hashCode = this.b.c(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.a((Object) t).hashCode() : hashCode;
    }

    public final void a(T t, Ob ob) throws IOException {
        int i;
        Object obj;
        Iterator e = this.d.a((Object) t).e();
        while (e.hasNext()) {
            Entry entry = (Entry) e.next();
            C0737aa aaVar = (C0737aa) entry.getKey();
            if (aaVar.n() != Nb.MESSAGE || aaVar.o() || aaVar.m()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C0787ra) {
                i = aaVar.zzc();
                obj = ((C0787ra) entry).a().b();
            } else {
                i = aaVar.zzc();
                obj = entry.getValue();
            }
            ob.a(i, obj);
        }
        C0794tb<?, ?> tbVar = this.b;
        tbVar.b(tbVar.c(t), ob);
    }

    public final void a(T t, byte[] bArr, int i, int i2, C0801w wVar) throws IOException {
        C0755ga gaVar = (C0755ga) t;
        C0797ub ubVar = gaVar.zzjp;
        if (ubVar == C0797ub.b()) {
            ubVar = C0797ub.c();
            gaVar.zzjp = ubVar;
        }
        C0797ub ubVar2 = ubVar;
        while (i < i2) {
            int a2 = C0798v.a(bArr, i, wVar);
            int i3 = wVar.a;
            if (i3 != 11) {
                i = (i3 & 7) == 2 ? C0798v.a(i3, bArr, a2, i2, ubVar2, wVar) : C0798v.a(i3, bArr, a2, i2, wVar);
            } else {
                int i4 = 0;
                A a3 = null;
                while (a2 < i2) {
                    a2 = C0798v.a(bArr, a2, wVar);
                    int i5 = wVar.a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3 && i7 == 2) {
                            a2 = C0798v.e(bArr, a2, wVar);
                            a3 = (A) wVar.c;
                        }
                    } else if (i7 == 0) {
                        a2 = C0798v.a(bArr, a2, wVar);
                        i4 = wVar.a;
                    }
                    if (i5 == 12) {
                        break;
                    }
                    a2 = C0798v.a(i5, bArr, a2, i2, wVar);
                }
                if (a3 != null) {
                    ubVar2.a((i4 << 3) | 2, (Object) a3);
                }
                i = a2;
            }
        }
        if (i != i2) {
            throw C0773ma.d();
        }
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
        C0794tb<?, ?> tbVar = this.b;
        int d2 = tbVar.d(tbVar.c(t)) + 0;
        return this.c ? d2 + this.d.a((Object) t).h() : d2;
    }

    public final void b(T t, T t2) {
        C0747db.a(this.b, t, t2);
        if (this.c) {
            C0747db.a(this.d, t, t2);
        }
    }

    public final boolean c(T t) {
        return this.d.a((Object) t).d();
    }

    public final void d(T t) {
        this.b.a(t);
        this.d.c(t);
    }

    public final T newInstance() {
        return this.a.c().u();
    }
}
