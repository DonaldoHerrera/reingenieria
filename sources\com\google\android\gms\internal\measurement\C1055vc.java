package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.b;
import com.google.android.gms.internal.measurement.Gb.e;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.vc reason: case insensitive filesystem */
final class C1055vc<T> implements Ec<T> {
    private final C1026qc a;
    private final Xc<?, ?> b;
    private final boolean c;
    private final C1054vb<?> d;

    private C1055vc(Xc<?, ?> xc, C1054vb<?> vbVar, C1026qc qcVar) {
        this.b = xc;
        this.c = vbVar.a(qcVar);
        this.d = vbVar;
        this.a = qcVar;
    }

    static <T> C1055vc<T> a(Xc<?, ?> xc, C1054vb<?> vbVar, C1026qc qcVar) {
        return new C1055vc<>(xc, vbVar, qcVar);
    }

    public final void b(T t, T t2) {
        Gc.a(this.b, t, t2);
        if (this.c) {
            Gc.a(this.d, t, t2);
        }
    }

    public final int c(T t) {
        Xc<?, ?> xc = this.b;
        int f = xc.f(xc.d(t)) + 0;
        return this.c ? f + this.d.a((Object) t).g() : f;
    }

    public final boolean d(T t) {
        return this.d.a((Object) t).c();
    }

    public final T newInstance() {
        return this.a.b().v();
    }

    public final boolean a(T t, T t2) {
        if (!this.b.d(t).equals(this.b.d(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.a((Object) t).equals(this.d.a((Object) t2));
        }
        return true;
    }

    public final void b(T t) {
        this.b.a((Object) t);
        this.d.c(t);
    }

    public final int a(T t) {
        int hashCode = this.b.d(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.a((Object) t).hashCode() : hashCode;
    }

    public final void a(T t, C1050ud udVar) throws IOException {
        Iterator d2 = this.d.a((Object) t).d();
        while (d2.hasNext()) {
            Entry entry = (Entry) d2.next();
            C1072yb ybVar = (C1072yb) entry.getKey();
            if (ybVar.E() != C1032rd.MESSAGE || ybVar.A() || ybVar.I()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof Ub) {
                udVar.a(ybVar.l(), (Object) ((Ub) entry).a().a());
            } else {
                udVar.a(ybVar.l(), entry.getValue());
            }
        }
        Xc<?, ?> xc = this.b;
        xc.b(xc.d(t), udVar);
    }

    public final void a(T t, byte[] bArr, int i, int i2, Ta ta) throws IOException {
        Gb gb = (Gb) t;
        _c _cVar = gb.zzahz;
        if (_cVar == _c.c()) {
            _cVar = _c.d();
            gb.zzahz = _cVar;
        }
        ((b) t).p();
        e eVar = null;
        while (i < i2) {
            int a2 = Ua.a(bArr, i, ta);
            int i3 = ta.a;
            if (i3 == 11) {
                int i4 = 0;
                Object obj = null;
                while (a2 < i2) {
                    a2 = Ua.a(bArr, a2, ta);
                    int i5 = ta.a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (eVar != null) {
                                Ac.a();
                                throw new NoSuchMethodError();
                            } else if (i7 == 2) {
                                a2 = Ua.e(bArr, a2, ta);
                                obj = (Ya) ta.c;
                            }
                        }
                    } else if (i7 == 0) {
                        a2 = Ua.a(bArr, a2, ta);
                        i4 = ta.a;
                        eVar = (e) this.d.a(ta.d, this.a, i4);
                    }
                    if (i5 == 12) {
                        break;
                    }
                    a2 = Ua.a(i5, bArr, a2, i2, ta);
                }
                if (obj != null) {
                    _cVar.a((i4 << 3) | 2, obj);
                }
                i = a2;
            } else if ((i3 & 7) == 2) {
                eVar = (e) this.d.a(ta.d, this.a, i3 >>> 3);
                if (eVar == null) {
                    i = Ua.a(i3, bArr, a2, i2, _cVar, ta);
                } else {
                    Ac.a();
                    throw new NoSuchMethodError();
                }
            } else {
                i = Ua.a(i3, bArr, a2, i2, ta);
            }
        }
        if (i != i2) {
            throw Rb.h();
        }
    }

    public final void a(T t, Fc fc, C1042tb tbVar) throws IOException {
        boolean z;
        Xc<?, ?> xc = this.b;
        C1054vb<?> vbVar = this.d;
        Object e = xc.e(t);
        C1060wb b2 = vbVar.b(t);
        do {
            try {
                if (fc.o() == Integer.MAX_VALUE) {
                    xc.b((Object) t, e);
                    return;
                }
                int tag = fc.getTag();
                if (tag == 11) {
                    Object obj = null;
                    Ya ya = null;
                    int i = 0;
                    while (fc.o() != Integer.MAX_VALUE) {
                        int tag2 = fc.getTag();
                        if (tag2 == 16) {
                            i = fc.f();
                            obj = vbVar.a(tbVar, this.a, i);
                        } else if (tag2 == 26) {
                            if (obj == null) {
                                ya = fc.g();
                            } else {
                                vbVar.a(fc, obj, tbVar, b2);
                                throw null;
                            }
                        } else if (!fc.m()) {
                            break;
                        }
                    }
                    if (fc.getTag() == 12) {
                        if (ya != null) {
                            if (obj == null) {
                                xc.a(e, i, ya);
                            } else {
                                vbVar.a(ya, obj, tbVar, b2);
                                throw null;
                            }
                        }
                        z = true;
                        continue;
                    } else {
                        throw Rb.e();
                    }
                } else if ((tag & 7) == 2) {
                    Object a2 = vbVar.a(tbVar, this.a, tag >>> 3);
                    if (a2 == null) {
                        z = xc.a(e, fc);
                        continue;
                    } else {
                        vbVar.a(fc, a2, tbVar, b2);
                        throw null;
                    }
                } else {
                    z = fc.m();
                    continue;
                }
            } finally {
                xc.b((Object) t, e);
            }
        } while (z);
    }
}
