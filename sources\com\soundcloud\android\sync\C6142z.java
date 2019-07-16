package com.soundcloud.android.sync;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.Collections;
import java.util.List;

/* renamed from: com.soundcloud.android.sync.z reason: case insensitive filesystem */
/* compiled from: SingleJobRequest */
public class C6142z implements ea {
    private final r a;
    private final boolean b;
    private final ResultReceiver c;
    private final C5327TLa d;
    protected final String e;
    protected SyncJobResult f;

    public C6142z(r rVar, String str, boolean z, ResultReceiver resultReceiver, C5327TLa tLa) {
        this.a = rVar;
        this.e = str;
        this.b = z;
        this.c = resultReceiver;
        this.d = tLa;
    }

    private Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("syncResult", this.f);
        return bundle;
    }

    public void a(W w) {
        SyncJobResult syncJobResult;
        if (w.a() == null) {
            syncJobResult = SyncJobResult.a(this.e, w.d());
        } else {
            syncJobResult = SyncJobResult.a(this.e, w.a());
        }
        this.f = syncJobResult;
    }

    public boolean c() {
        return this.b;
    }

    public boolean d() {
        return this.f != null;
    }

    public List<? extends W> b() {
        return Collections.singletonList(this.a);
    }

    public boolean b(W w) {
        return this.a.equals(w) && this.f == null;
    }

    public void a() {
        this.c.send(0, e());
        this.d.c(C3876taa.n, this.f);
    }
}
