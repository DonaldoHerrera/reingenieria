package com.soundcloud.android.sync;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.soundcloud.android.sync.u reason: case insensitive filesystem */
/* compiled from: MultiJobRequest */
class C6137u implements ea {
    private final List<W> a;
    private final boolean b;
    private final ResultReceiver c;
    private final C5327TLa d;
    private final HashSet<W> e;
    private Bundle f = new Bundle();

    public C6137u(List<W> list, ResultReceiver resultReceiver, boolean z, C5327TLa tLa) {
        this.a = list;
        this.b = z;
        this.c = resultReceiver;
        this.d = tLa;
        this.e = new HashSet<>(list);
    }

    public void a(W w) {
        SyncJobResult syncJobResult;
        if (b(w)) {
            this.e.remove(w);
            Exception a2 = w.a();
            String c2 = c(w);
            if (a2 == null) {
                syncJobResult = SyncJobResult.a(c2, w.d());
            } else {
                syncJobResult = SyncJobResult.a(c2, w.a());
            }
            this.f.putParcelable(c2, syncJobResult);
            this.d.c(C3876taa.n, syncJobResult);
        }
    }

    public boolean c() {
        return this.b;
    }

    public boolean d() {
        return this.e.isEmpty();
    }

    public List<? extends W> b() {
        return this.a;
    }

    public String c(W w) {
        return ((na) w.b().b()).name();
    }

    public boolean b(W w) {
        return this.e.contains(w);
    }

    public void a() {
        this.c.send(0, this.f);
    }
}
