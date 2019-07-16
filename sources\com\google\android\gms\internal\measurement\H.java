package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.c;
import java.util.List;

public final class H extends Gb<H, b> implements C1037sc {
    private static volatile C1073yc<H> zzuo;
    /* access modifiers changed from: private */
    public static final H zzvp = new H();
    private int zzue;
    private int zzvl;
    private String zzvm = "";
    private boolean zzvn;
    private Ob<String> zzvo = Gb.o();

    public enum a implements Lb {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);
        
        private static final Kb<a> h = null;
        private final int j;

        static {
            h = new L();
        }

        private a(int i2) {
            this.j = i2;
        }

        public static a a(int i2) {
            switch (i2) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public final int l() {
            return this.j;
        }

        public static Nb a() {
            return K.a;
        }
    }

    public static final class b extends com.google.android.gms.internal.measurement.Gb.a<H, b> implements C1037sc {
        private b() {
            super(H.zzvp);
        }

        /* synthetic */ b(C c) {
            this();
        }
    }

    static {
        Gb.a(H.class, zzvp);
    }

    private H() {
    }

    public static H z() {
        return zzvp;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C.a[i - 1]) {
            case 1:
                return new H();
            case 2:
                return new b(null);
            case 3:
                return Gb.a((C1026qc) zzvp, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u001a", new Object[]{"zzue", "zzvl", a.a(), "zzvm", "zzvn", "zzvo"});
            case 4:
                return zzvp;
            case 5:
                C1073yc<H> ycVar = zzuo;
                if (ycVar == null) {
                    synchronized (H.class) {
                        ycVar = zzuo;
                        if (ycVar == null) {
                            ycVar = new c<>(zzvp);
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

    public final boolean p() {
        return (this.zzue & 1) != 0;
    }

    public final a q() {
        a a2 = a.a(this.zzvl);
        return a2 == null ? a.UNKNOWN_MATCH_TYPE : a2;
    }

    public final boolean r() {
        return (this.zzue & 2) != 0;
    }

    public final String s() {
        return this.zzvm;
    }

    public final boolean t() {
        return (this.zzue & 4) != 0;
    }

    public final boolean u() {
        return this.zzvn;
    }

    public final List<String> x() {
        return this.zzvo;
    }

    public final int y() {
        return this.zzvo.size();
    }
}
