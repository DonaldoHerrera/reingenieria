package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.c;
import java.util.List;

public final class V extends Gb<V, a> implements C1037sc {
    private static volatile C1073yc<V> zzuo;
    /* access modifiers changed from: private */
    public static final V zzww = new V();
    private Ob<W> zzwv = Gb.o();

    public static final class a extends com.google.android.gms.internal.measurement.Gb.a<V, a> implements C1037sc {
        private a() {
            super(V.zzww);
        }

        public final W a(int i) {
            return ((V) this.b).b(0);
        }

        /* synthetic */ a(O o) {
            this();
        }

        public final a a(com.google.android.gms.internal.measurement.W.a aVar) {
            g();
            ((V) this.b).a(aVar);
            return this;
        }
    }

    static {
        Gb.a(V.class, zzww);
    }

    private V() {
    }

    /* access modifiers changed from: private */
    public final void a(com.google.android.gms.internal.measurement.W.a aVar) {
        if (!this.zzwv.K()) {
            this.zzwv = Gb.a(this.zzwv);
        }
        this.zzwv.add((W) aVar.w());
    }

    public static a q() {
        return (a) zzww.k();
    }

    public final W b(int i) {
        return (W) this.zzwv.get(0);
    }

    public final List<W> p() {
        return this.zzwv;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (O.a[i - 1]) {
            case 1:
                return new V();
            case 2:
                return new a(null);
            case 3:
                return Gb.a((C1026qc) zzww, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzwv", W.class});
            case 4:
                return zzww;
            case 5:
                C1073yc<V> ycVar = zzuo;
                if (ycVar == null) {
                    synchronized (V.class) {
                        ycVar = zzuo;
                        if (ycVar == null) {
                            ycVar = new c<>(zzww);
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
