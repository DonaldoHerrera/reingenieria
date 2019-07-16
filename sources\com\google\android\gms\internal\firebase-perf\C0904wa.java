package com.google.android.gms.internal.firebase-perf;

/* renamed from: com.google.android.gms.internal.firebase-perf.wa reason: case insensitive filesystem */
public enum C0904wa implements C0909xb {
    SERVICE_WORKER_STATUS_UNKNOWN(0),
    UNSUPPORTED(1),
    CONTROLLED(2),
    UNCONTROLLED(3);
    
    private static final C0905wb<C0904wa> e = null;
    private final int g;

    static {
        e = new C0900va();
    }

    private C0904wa(int i) {
        this.g = i;
    }

    public static C0917zb a() {
        return C0912ya.a;
    }

    public final int k() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(C0904wa.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.g);
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
