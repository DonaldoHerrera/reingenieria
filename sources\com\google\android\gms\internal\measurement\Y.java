package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.c;
import java.util.List;

public final class Y extends Gb<Y, a> implements C1037sc {
    private static volatile C1073yc<Y> zzuo;
    /* access modifiers changed from: private */
    public static final Y zzyz = new Y();
    private Pb zzyv = Gb.n();
    private Pb zzyw = Gb.n();
    private Ob<Q> zzyx = Gb.o();
    private Ob<Z> zzyy = Gb.o();

    public static final class a extends com.google.android.gms.internal.measurement.Gb.a<Y, a> implements C1037sc {
        private a() {
            super(Y.zzyz);
        }

        public final a a(Iterable<? extends Long> iterable) {
            g();
            ((Y) this.b).a(iterable);
            return this;
        }

        public final a b(Iterable<? extends Long> iterable) {
            g();
            ((Y) this.b).b(iterable);
            return this;
        }

        public final a c(Iterable<? extends Q> iterable) {
            g();
            ((Y) this.b).c(iterable);
            return this;
        }

        public final a d(Iterable<? extends Z> iterable) {
            g();
            ((Y) this.b).d(iterable);
            return this;
        }

        public final a k() {
            g();
            ((Y) this.b).C();
            return this;
        }

        public final a l() {
            g();
            ((Y) this.b).D();
            return this;
        }

        /* synthetic */ a(O o) {
            this();
        }

        public final a a(int i) {
            g();
            ((Y) this.b).d(i);
            return this;
        }

        public final a b(int i) {
            g();
            ((Y) this.b).e(i);
            return this;
        }
    }

    static {
        Gb.a(Y.class, zzyz);
    }

    private Y() {
    }

    public static Y A() {
        return zzyz;
    }

    /* access modifiers changed from: private */
    public final void C() {
        this.zzyv = Gb.n();
    }

    /* access modifiers changed from: private */
    public final void D() {
        this.zzyw = Gb.n();
    }

    private final void E() {
        if (!this.zzyx.K()) {
            this.zzyx = Gb.a(this.zzyx);
        }
    }

    private final void F() {
        if (!this.zzyy.K()) {
            this.zzyy = Gb.a(this.zzyy);
        }
    }

    /* access modifiers changed from: private */
    public final void a(Iterable<? extends Long> iterable) {
        if (!this.zzyv.K()) {
            this.zzyv = Gb.a(this.zzyv);
        }
        Oa.a(iterable, this.zzyv);
    }

    /* access modifiers changed from: private */
    public final void b(Iterable<? extends Long> iterable) {
        if (!this.zzyw.K()) {
            this.zzyw = Gb.a(this.zzyw);
        }
        Oa.a(iterable, this.zzyw);
    }

    /* access modifiers changed from: private */
    public final void c(Iterable<? extends Q> iterable) {
        E();
        Oa.a(iterable, this.zzyx);
    }

    /* access modifiers changed from: private */
    public final void d(int i) {
        E();
        this.zzyx.remove(i);
    }

    /* access modifiers changed from: private */
    public final void e(int i) {
        F();
        this.zzyy.remove(i);
    }

    public static a z() {
        return (a) zzyz.k();
    }

    public final List<Long> p() {
        return this.zzyv;
    }

    public final int q() {
        return this.zzyv.size();
    }

    public final List<Long> r() {
        return this.zzyw;
    }

    public final int s() {
        return this.zzyw.size();
    }

    public final List<Q> t() {
        return this.zzyx;
    }

    public final int u() {
        return this.zzyx.size();
    }

    public final List<Z> x() {
        return this.zzyy;
    }

    public final int y() {
        return this.zzyy.size();
    }

    /* access modifiers changed from: private */
    public final void d(Iterable<? extends Z> iterable) {
        F();
        Oa.a(iterable, this.zzyy);
    }

    public final Z c(int i) {
        return (Z) this.zzyy.get(i);
    }

    public static Y a(byte[] bArr, C1042tb tbVar) throws Rb {
        return (Y) Gb.a(zzyz, bArr, tbVar);
    }

    public final Q b(int i) {
        return (Q) this.zzyx.get(i);
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (O.a[i - 1]) {
            case 1:
                return new Y();
            case 2:
                return new a(null);
            case 3:
                return Gb.a((C1026qc) zzyz, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzyv", "zzyw", "zzyx", Q.class, "zzyy", Z.class});
            case 4:
                return zzyz;
            case 5:
                C1073yc<Y> ycVar = zzuo;
                if (ycVar == null) {
                    synchronized (Y.class) {
                        ycVar = zzuo;
                        if (ycVar == null) {
                            ycVar = new c<>(zzyz);
                            zzuo = ycVar;
                        }
                    }
                }
                return ycVar;
            case 6:
                return Byte.valueOf(1);
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
