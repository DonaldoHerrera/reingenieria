package com.soundcloud.android.offline;

/* compiled from: OfflinePlaybackOperations */
public class Vd {
    private final C2436_U a;
    private final De b;
    private final Se c;

    public Vd(C2436_U _u, De de, Se se) {
        this.a = _u;
        this.b = de;
        this.c = se;
    }

    public boolean a(C3508cda cda) {
        return this.a.l() && this.c.a(cda) == C3823mda.DOWNLOADED;
    }
}
