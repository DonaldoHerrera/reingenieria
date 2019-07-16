package com.google.android.gms.internal.firebase-perf;

public enum V implements C0909xb {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);
    
    private static final C0905wb<V> e = null;
    private final int g;

    static {
        e = new U();
    }

    private V(int i) {
        this.g = i;
    }

    public static C0917zb a() {
        return X.a;
    }

    public final int k() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(V.class.getName());
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
