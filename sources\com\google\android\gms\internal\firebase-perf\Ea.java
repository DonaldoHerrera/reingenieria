package com.google.android.gms.internal.firebase-perf;

public enum Ea implements C0909xb {
    VISIBILITY_STATE_UNKNOWN(0),
    VISIBLE(1),
    HIDDEN(2),
    PRERENDER(3),
    UNLOADED(4);
    
    private static final C0905wb<Ea> f = null;
    private final int h;

    static {
        f = new Ga();
    }

    private Ea(int i) {
        this.h = i;
    }

    public static C0917zb a() {
        return Fa.a;
    }

    public final int k() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(Ea.class.getName());
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
