package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.c;
import com.google.android.gms.internal.measurement.Gb.d;

public final class G extends Gb<G, a> implements C1037sc {
    private static volatile C1073yc<G> zzuo;
    /* access modifiers changed from: private */
    public static final G zzvj = new G();
    private int zzue;
    private int zzuf;
    private boolean zzuk;
    private boolean zzul;
    private boolean zzum;
    private String zzvh = "";
    private E zzvi;

    public static final class a extends com.google.android.gms.internal.measurement.Gb.a<G, a> implements C1037sc {
        private a() {
            super(G.zzvj);
        }

        public final a a(String str) {
            g();
            ((G) this.b).a(str);
            return this;
        }

        /* synthetic */ a(C c) {
            this();
        }
    }

    static {
        Gb.a(G.class, zzvj);
    }

    private G() {
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        if (str != null) {
            this.zzue |= 2;
            this.zzvh = str;
            return;
        }
        throw new NullPointerException();
    }

    public static C1073yc<G> y() {
        return (C1073yc) zzvj.a(d.g, null, null);
    }

    public final int p() {
        return this.zzuf;
    }

    public final String q() {
        return this.zzvh;
    }

    public final boolean r() {
        return (this.zzue & 1) != 0;
    }

    public final boolean s() {
        return this.zzuk;
    }

    public final boolean t() {
        return this.zzul;
    }

    public final boolean u() {
        return (this.zzue & 32) != 0;
    }

    public final boolean x() {
        return this.zzum;
    }

    public final E z() {
        E e = this.zzvi;
        return e == null ? E.y() : e;
    }

    public static G a(byte[] bArr, C1042tb tbVar) throws Rb {
        return (G) Gb.a(zzvj, bArr, tbVar);
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C.a[i - 1]) {
            case 1:
                return new G();
            case 2:
                return new a(null);
            case 3:
                return Gb.a((C1026qc) zzvj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\t\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzue", "zzuf", "zzvh", "zzvi", "zzuk", "zzul", "zzum"});
            case 4:
                return zzvj;
            case 5:
                C1073yc<G> ycVar = zzuo;
                if (ycVar == null) {
                    synchronized (G.class) {
                        ycVar = zzuo;
                        if (ycVar == null) {
                            ycVar = new c<>(zzvj);
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
