package com.google.android.gms.internal.firebase-perf;

public final class hd extends C0889sb<hd, a> implements C0843gc {
    private static volatile C0875oc<hd> zzij;
    /* access modifiers changed from: private */
    public static final hd zzxa;
    private int zzie;
    private int zzwy = -1;
    private int zzwz;

    public static final class a extends com.google.android.gms.internal.firebase-perf.C0889sb.b<hd, a> implements C0843gc {
        private a() {
            super(hd.zzxa);
        }

        /* synthetic */ a(gd gdVar) {
            this();
        }
    }

    public enum b implements C0909xb {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        
        private static final C0905wb<b> v = null;
        private final int x;

        static {
            v = new id();
        }

        private b(int i) {
            this.x = i;
        }

        public static C0917zb a() {
            return jd.a;
        }

        public final int k() {
            return this.x;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(b.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" number=");
            sb.append(this.x);
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }
    }

    public enum c implements C0909xb {
        NONE(-1),
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17);
        
        private static final C0905wb<c> t = null;
        private final int v;

        static {
            t = new ld();
        }

        private c(int i) {
            this.v = i;
        }

        public static C0917zb a() {
            return kd.a;
        }

        public final int k() {
            return this.v;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(c.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" number=");
            sb.append(this.v);
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }
    }

    static {
        hd hdVar = new hd();
        zzxa = hdVar;
        C0889sb.a(hd.class, hdVar);
    }

    private hd() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (gd.a[i - 1]) {
            case 1:
                return new hd();
            case 2:
                return new a(null);
            case 3:
                return C0889sb.a((C0835ec) zzxa, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzie", "zzwy", c.a(), "zzwz", b.a()});
            case 4:
                return zzxa;
            case 5:
                C0875oc<hd> ocVar = zzij;
                if (ocVar == null) {
                    synchronized (hd.class) {
                        ocVar = zzij;
                        if (ocVar == null) {
                            ocVar = new com.google.android.gms.internal.firebase-perf.C0889sb.a<>(zzxa);
                            zzij = ocVar;
                        }
                    }
                }
                return ocVar;
            case 6:
                return Byte.valueOf(1);
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
