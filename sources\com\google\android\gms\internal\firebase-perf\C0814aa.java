package com.google.android.gms.internal.firebase-perf;

/* renamed from: com.google.android.gms.internal.firebase-perf.aa reason: case insensitive filesystem */
public enum C0814aa implements C0909xb {
    EFFECTIVE_CONNECTION_TYPE_UNKNOWN(0),
    EFFECTIVE_CONNECTION_TYPE_SLOW_2G(1),
    EFFECTIVE_CONNECTION_TYPE_2G(2),
    EFFECTIVE_CONNECTION_TYPE_3G(3),
    EFFECTIVE_CONNECTION_TYPE_4G(4);
    
    private static final C0905wb<C0814aa> f = null;
    private final int h;

    static {
        f = new Z();
    }

    private C0814aa(int i) {
        this.h = i;
    }

    public static C0917zb a() {
        return C0824ca.a;
    }

    public final int k() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(C0814aa.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.h);
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
