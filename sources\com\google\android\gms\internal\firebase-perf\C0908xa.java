package com.google.android.gms.internal.firebase-perf;

/* renamed from: com.google.android.gms.internal.firebase-perf.xa reason: case insensitive filesystem */
public enum C0908xa implements C0909xb {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    
    private static final C0905wb<C0908xa> c = null;
    private final int e;

    static {
        c = new Aa();
    }

    private C0908xa(int i) {
        this.e = i;
    }

    public static C0908xa a(int i) {
        if (i == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public final int k() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(C0908xa.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.e);
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    public static C0917zb a() {
        return C0916za.a;
    }
}
