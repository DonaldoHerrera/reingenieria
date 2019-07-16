package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.C0627a.e;

final class U implements Runnable {
    private final /* synthetic */ N a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;

    U(P p, N n, String str, String str2) {
        this.a = n;
        this.b = str;
        this.c = str2;
    }

    public final void run() {
        e eVar;
        synchronized (this.a.g) {
            eVar = (e) this.a.g.get(this.b);
        }
        if (eVar != null) {
            eVar.a(this.a.e, this.b, this.c);
            return;
        }
        N.a.a("Discarded message for unknown namespace '%s'", this.b);
    }
}
