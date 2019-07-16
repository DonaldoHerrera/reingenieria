package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.c;
import com.google.android.gms.internal.measurement.Gb.d;
import java.util.List;

public final class D extends Gb<D, a> implements C1037sc {
    /* access modifiers changed from: private */
    public static final D zzun = new D();
    private static volatile C1073yc<D> zzuo;
    private int zzue;
    private int zzuf;
    private String zzug = "";
    private Ob<E> zzuh = Gb.o();
    private boolean zzui;
    private F zzuj;
    private boolean zzuk;
    private boolean zzul;
    private boolean zzum;

    public static final class a extends com.google.android.gms.internal.measurement.Gb.a<D, a> implements C1037sc {
        private a() {
            super(D.zzun);
        }

        public final a a(String str) {
            g();
            ((D) this.b).a(str);
            return this;
        }

        public final String k() {
            return ((D) this.b).q();
        }

        public final int l() {
            return ((D) this.b).r();
        }

        /* synthetic */ a(C c) {
            this();
        }

        public final E a(int i) {
            return ((D) this.b).b(i);
        }

        public final a a(int i, E e) {
            g();
            ((D) this.b).a(i, e);
            return this;
        }
    }

    static {
        Gb.a(D.class, zzun);
    }

    private D() {
    }

    public static C1073yc<D> C() {
        return (C1073yc) zzun.a(d.g, (Object) null, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        if (str != null) {
            this.zzue |= 2;
            this.zzug = str;
            return;
        }
        throw new NullPointerException();
    }

    public final boolean A() {
        return (this.zzue & 64) != 0;
    }

    public final boolean B() {
        return this.zzum;
    }

    public final E b(int i) {
        return (E) this.zzuh.get(i);
    }

    public final int p() {
        return this.zzuf;
    }

    public final String q() {
        return this.zzug;
    }

    public final int r() {
        return this.zzuh.size();
    }

    public final boolean s() {
        return (this.zzue & 1) != 0;
    }

    public final List<E> t() {
        return this.zzuh;
    }

    public final boolean u() {
        return (this.zzue & 8) != 0;
    }

    public final F x() {
        F f = this.zzuj;
        return f == null ? F.B() : f;
    }

    public final boolean y() {
        return this.zzuk;
    }

    public final boolean z() {
        return this.zzul;
    }

    /* access modifiers changed from: private */
    public final void a(int i, E e) {
        if (e != null) {
            if (!this.zzuh.K()) {
                this.zzuh = Gb.a(this.zzuh);
            }
            this.zzuh.set(i, e);
            return;
        }
        throw new NullPointerException();
    }

    public static D a(byte[] bArr, C1042tb tbVar) throws Rb {
        return (D) Gb.a(zzun, bArr, tbVar);
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C.a[i - 1]) {
            case 1:
                return new D();
            case 2:
                return new a(null);
            case 3:
                return Gb.a((C1026qc) zzun, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u001b\u0004\u0007\u0002\u0005\t\u0003\u0006\u0007\u0004\u0007\u0007\u0005\b\u0007\u0006", new Object[]{"zzue", "zzuf", "zzug", "zzuh", E.class, "zzui", "zzuj", "zzuk", "zzul", "zzum"});
            case 4:
                return zzun;
            case 5:
                C1073yc<D> ycVar = zzuo;
                if (ycVar == null) {
                    synchronized (D.class) {
                        ycVar = zzuo;
                        if (ycVar == null) {
                            ycVar = new c<>(zzun);
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
