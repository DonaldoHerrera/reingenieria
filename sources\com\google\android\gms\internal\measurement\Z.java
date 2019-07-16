package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.c;
import java.util.List;

public final class Z extends Gb<Z, a> implements C1037sc {
    private static volatile C1073yc<Z> zzuo;
    /* access modifiers changed from: private */
    public static final Z zzzb = new Z();
    private int zzue;
    private int zzwg;
    private Pb zzza = Gb.n();

    public static final class a extends com.google.android.gms.internal.measurement.Gb.a<Z, a> implements C1037sc {
        private a() {
            super(Z.zzzb);
        }

        public final a a(int i) {
            g();
            ((Z) this.b).c(i);
            return this;
        }

        public final a k() {
            g();
            ((Z) this.b).y();
            return this;
        }

        /* synthetic */ a(O o) {
            this();
        }

        public final a a(long j) {
            g();
            ((Z) this.b).a(j);
            return this;
        }

        public final a a(Iterable<? extends Long> iterable) {
            g();
            ((Z) this.b).a(iterable);
            return this;
        }
    }

    static {
        Gb.a(Z.class, zzzb);
    }

    private Z() {
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        x();
        this.zzza.h(j);
    }

    /* access modifiers changed from: private */
    public final void c(int i) {
        this.zzue |= 1;
        this.zzwg = i;
    }

    public static a t() {
        return (a) zzzb.k();
    }

    private final void x() {
        if (!this.zzza.K()) {
            this.zzza = Gb.a(this.zzza);
        }
    }

    /* access modifiers changed from: private */
    public final void y() {
        this.zzza = Gb.n();
    }

    public final long b(int i) {
        return this.zzza.getLong(i);
    }

    public final int p() {
        return this.zzwg;
    }

    public final boolean q() {
        return (this.zzue & 1) != 0;
    }

    public final List<Long> r() {
        return this.zzza;
    }

    public final int s() {
        return this.zzza.size();
    }

    /* access modifiers changed from: private */
    public final void a(Iterable<? extends Long> iterable) {
        x();
        Oa.a(iterable, this.zzza);
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (O.a[i - 1]) {
            case 1:
                return new Z();
            case 2:
                return new a(null);
            case 3:
                return Gb.a((C1026qc) zzzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0014", new Object[]{"zzue", "zzwg", "zzza"});
            case 4:
                return zzzb;
            case 5:
                C1073yc<Z> ycVar = zzuo;
                if (ycVar == null) {
                    synchronized (Z.class) {
                        ycVar = zzuo;
                        if (ycVar == null) {
                            ycVar = new c<>(zzzb);
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
