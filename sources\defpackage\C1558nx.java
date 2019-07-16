package defpackage;

import java.io.IOException;

/* renamed from: nx reason: default package and case insensitive filesystem */
final class C1558nx<T> implements C1859xx<T> {
    private final C1403ix a;
    private final Nx<?, ?> b;
    private final boolean c;
    private final C1798vw<?> d;

    private C1558nx(Nx<?, ?> nx, C1798vw<?> vwVar, C1403ix ixVar) {
        this.b = nx;
        this.c = vwVar.a(ixVar);
        this.d = vwVar;
        this.a = ixVar;
    }

    static <T> C1558nx<T> a(Nx<?, ?> nx, C1798vw<?> vwVar, C1403ix ixVar) {
        return new C1558nx<>(nx, vwVar, ixVar);
    }

    public final void b(T t, T t2) {
        C1919zx.a(this.b, t, t2);
        if (this.c) {
            C1919zx.a(this.d, t, t2);
        }
    }

    public final boolean c(T t) {
        return this.d.a((Object) t).b();
    }

    public final T newInstance() {
        return this.a.b().y();
    }

    public final boolean a(T t, T t2) {
        if (!this.b.a((Object) t).equals(this.b.a((Object) t2))) {
            return false;
        }
        if (this.c) {
            return this.d.a((Object) t).equals(this.d.a((Object) t2));
        }
        return true;
    }

    public final void b(T t) {
        this.b.c(t);
        this.d.c(t);
    }

    public final int a(T t) {
        int hashCode = this.b.a((Object) t).hashCode();
        return this.c ? (hashCode * 53) + this.d.a((Object) t).hashCode() : hashCode;
    }

    public final void a(T t, byte[] bArr, int i, int i2, C0285Yv yv) throws IOException {
        C0197Cw cw = (C0197Cw) t;
        Rx rx = cw.zztc;
        if (rx == Rx.b()) {
            rx = Rx.c();
            cw.zztc = rx;
        }
        ((d) t).g();
        c cVar = null;
        while (i < i2) {
            int a2 = C0270Vv.a(bArr, i, yv);
            int i3 = yv.a;
            if (i3 == 11) {
                int i4 = 0;
                Object obj = null;
                while (a2 < i2) {
                    a2 = C0270Vv.a(bArr, a2, yv);
                    int i5 = yv.a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (cVar != null) {
                                C1739tx.a();
                                throw new NoSuchMethodError();
                            } else if (i7 == 2) {
                                a2 = C0270Vv.e(bArr, a2, yv);
                                obj = (C0289Zv) yv.c;
                            }
                        }
                    } else if (i7 == 0) {
                        a2 = C0270Vv.a(bArr, a2, yv);
                        i4 = yv.a;
                        cVar = (c) this.d.a(yv.d, this.a, i4);
                    }
                    if (i5 == 12) {
                        break;
                    }
                    a2 = C0270Vv.a(i5, bArr, a2, i2, yv);
                }
                if (obj != null) {
                    rx.a((i4 << 3) | 2, obj);
                }
                i = a2;
            } else if ((i3 & 7) == 2) {
                cVar = (c) this.d.a(yv.d, this.a, i3 >>> 3);
                if (cVar == null) {
                    i = C0270Vv.a(i3, bArr, a2, i2, rx, yv);
                } else {
                    C1739tx.a();
                    throw new NoSuchMethodError();
                }
            } else {
                i = C0270Vv.a(i3, bArr, a2, i2, yv);
            }
        }
        if (i != i2) {
            throw C0225Kw.h();
        }
    }

    public final void a(T t, C1889yx yxVar, C1738tw twVar) throws IOException {
        boolean z;
        Nx<?, ?> nx = this.b;
        C1798vw<?> vwVar = this.d;
        Object b2 = nx.b(t);
        C1858xw b3 = vwVar.b(t);
        do {
            try {
                if (yxVar.c() == Integer.MAX_VALUE) {
                    nx.b(t, b2);
                    return;
                }
                int tag = yxVar.getTag();
                if (tag == 11) {
                    Object obj = null;
                    C0289Zv zv = null;
                    int i = 0;
                    while (yxVar.c() != Integer.MAX_VALUE) {
                        int tag2 = yxVar.getTag();
                        if (tag2 == 16) {
                            i = yxVar.g();
                            obj = vwVar.a(twVar, this.a, i);
                        } else if (tag2 == 26) {
                            if (obj == null) {
                                zv = yxVar.f();
                            } else {
                                vwVar.a(yxVar, obj, twVar, b3);
                                throw null;
                            }
                        } else if (!yxVar.l()) {
                            break;
                        }
                    }
                    if (yxVar.getTag() == 12) {
                        if (zv != null) {
                            if (obj == null) {
                                nx.a(b2, i, zv);
                            } else {
                                vwVar.a(zv, obj, twVar, b3);
                                throw null;
                            }
                        }
                        z = true;
                        continue;
                    } else {
                        throw C0225Kw.e();
                    }
                } else if ((tag & 7) == 2) {
                    Object a2 = vwVar.a(twVar, this.a, tag >>> 3);
                    if (a2 == null) {
                        z = nx.a(b2, yxVar);
                        continue;
                    } else {
                        vwVar.a(yxVar, a2, twVar, b3);
                        throw null;
                    }
                } else {
                    z = yxVar.l();
                    continue;
                }
            } finally {
                nx.b(t, b2);
            }
        } while (z);
    }
}
